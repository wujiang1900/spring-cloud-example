# spring-cloud-poc
Contails the following
1. Setup Spring Cloud Config Server
    1. URL: http://localhost:8888/hie-config-server/REST/GetConfig/{application}/{profile/{label-optional}
2. Setup Spring Eureka Naming Server
    1. URL: http://localhost:8761/hie-service-registry
3. Setup Client 1 and register with Eureka Server
    1. URL: /hie-client-app1/get-greeting
4. Setup Client 2 and register with Eureka Server
    1. URL: /hie-client-app2/greeting
5. Span Client 1 and Client 2 for 5 instances each
6. Configure Zuul Gateway and Ribbon Load Balancing
    1. URL: /hie-proxy-server/clientapp2/hie-client-app2/greeting
    2. URL: /hie-proxy-server/clientapp1/hie-client-app1/get-greeting
    
    
Encrypt/Decrypt:

curl -v http://localhost:8888/hie-config-server/encrypt -d <pwd>


# Running multiple instances of eureka
Eureka application properties are modifies to run on 3 different ports. You can run the same app with 3 different profiles (peer1, peer2, peer3) to see the eureka replication.