FROM maven:3.3.3-jdk-8-onbuild
MAINTAINER pierre.thirouin@ext.mpsa.com
EXPOSE 8080
CMD ["java", "jar", "./target/catalog-microservice-sample-1.0.0-SNAPSHOT-capsule.jar"]