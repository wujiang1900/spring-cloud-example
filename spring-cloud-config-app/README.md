
## Help Commands


	mvn clean install && mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

	docker build -t odxc/spring-cloud-config-app .

	docker run -p 8080:8080 -t odxc/spring-cloud-config-app

	docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8888:8888 -t odxc/spring-cloud-config-app

	docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8888:8888 -t odxc/spring-cloud-config-app

## To Debug Docker Image

	docker run -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8888:8888 -p 5005:5005 -t odxc/spring-cloud-config-app
