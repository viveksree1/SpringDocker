# SpringDocker

1.	Create a spring boot application
2.	Have maven on it
3.	Add the Dockerfile
4.	Make it a maven wrapper by (Optional step, can be carried out by mvn clean install)
mvn -N io.takari:maven:wrapper
./mvnw install
5.	After running the maven with above command, the build might be done.
6.	Now run 
docker build image_name   .
7.	After this, run the image.
docker run -p 8080:8080  iamge_name
8.	This will run the docker in the docker host like
http://192.168.99.100:8080/
9.	For maven package, add in pom file and run
mvn clean package docker:build 
10.	Jenkins
For Jenkins, need to install git and maven plugins and also post build plugin for integrating with GIT
