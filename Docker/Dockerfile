FROM eclipse-temurin:17-jdk-jammy
RUN sudo wget https://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
RUN sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
RUN sudo yum install -y apache-maven

WORKDIR /app

COPY .mvnw/ .mvnw
COPY mvnw pom.xml ./
RUN mvn clean install

COPY ./target/Demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]