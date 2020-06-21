#Commands
docker image build -t spring-cloud-config-app .
docker container run --name configserver -p 8888:8888 -d spring-cloud-config-app
docker container logs configserver

#Commands
docker image build -t spring-cloud-eureka-server-app .
docker container run --name eurekaserver -p 8761:8761 -d spring-cloud-eureka-server-app
docker container logs eurekaserver

#Commands
docker image build -t spring-cloud-eureka-server-app .
docker container run --name eurekaserver -p 8761:8761 -d spring-cloud-eureka-server-app
docker container logs eurekaserver

#Commands
docker image build -t spring-cloud-client-app1 .
docker container run --name clientapp1 -p 8761:8761 -d spring-cloud-client-app1
docker container logs clientapp1

#Commands
docker image build -t spring-cloud-client-app2 .
docker container run --name clientapp2 -p 8761:8761 -d spring-cloud-client-app2
docker container logs clientapp2

#Commands
docker image build -t spring-cloud-zuul-app .
docker container run --name zuulserver -p 8761:8761 -d spring-cloud-zuul-app
docker container logs zuulserver

# Top start multiple boot services in docker networking

docker network ls
docker network create spring-cloud-poc
docker container run --network spring-cloud-poc --name configserver -p 8888:8888 -d spring-cloud-config-app
docker container run --network spring-cloud-poc --name eurekaserver -p 8761:8761 --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" -d spring-cloud-eureka-server-app
docker container run --network spring-cloud-poc --name clientapp1 --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" --env="EUREKA_URI=http://eurekaserver:8761/eureka" -d spring-cloud-client-app1
docker container run --network spring-cloud-poc --name clientapp2 --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" --env="EUREKA_URI=http://eurekaserver:8761/eureka" -d spring-cloud-client-app2
docker container run --network spring-cloud-poc --name zuulserver -p 8762:8762 --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" --env="EUREKA_URI=http://eurekaserver:8761/eureka" -d spring-cloud-zuul-app

# For regular services do not keep the name

docker container run --network spring-cloud-poc --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" --env="EUREKA_URI=http://eurekaserver:8761/eureka" -d spring-cloud-client-app1
docker container run --network spring-cloud-poc --env="SPRING_CLOUD_CONFIG_URI=http://configserver:8888" --env="EUREKA_URI=http://eurekaserver:8761/eureka" -d spring-cloud-client-app2


docker container start spring-cloud-config-app-network-container
docker container start spring-cloud-eureka-server-app-network-container