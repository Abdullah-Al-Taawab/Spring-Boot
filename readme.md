# What is Spring Boot?
Spring Boot is a framework that allows developers to create standalone applications with no or little configuration. It is designed specifically for creating dynamic web pages and microservices. Spring Boot is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring framework. Spring Boot Framework is widely used to develop REST APIs
# Why spring boot rather than using spring?
Building a traditional Spring application is really HARD. Spring Boot Make it easier to get started with Spring development and minimize the amount of manual configuration. It also resolves dependency conflicts and we don’t have to configure any server manually because it has an embedded HTTP server so you can get started quickly.
# Drawbacks of Spring Boot
Spring Boot generates a large number of unused dependencies, which results in a large deployment file. So, in large project Spring framework will be more convenient.
# What is Spring Initializr?
Spring Initializr is a Web-based tool that generates the Spring Boot project structure. It is very easy for the developers to select the necessary configuration for their projects. The Spring Initializr tool takes care of the configuration for any Spring-based project and provide an embedded server. You can use this pre-initialized project and click Generate to download a ZIP file
We can access Spring Initializr at start.spring.io.
# Maven
In any java project maven will help us with downloading required jar files and also it will make them available during compile and run. So, we don’t have to download these jar files from their websites and configure them in class path or build path.
# pom.xml
POM file – Project Object Model File. The pom. xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc. It also called the “Shopping List” for Maven.
# Project Coordinates
Project Coordinates uniquely identify a project. There is a term called “GAV” (group id, artifact id, version) by which it describes about a project.  
Example: 
  		<groupId>org.springframework</groupId>
  		<artifactId>spring-context</artifactId>
  		<version>6.0.0</version>
# Spring boot starters
A collection of dependencies grouped together. Makes it much easier for the developer to get started with Spring. It contains Spring-web, Spring-webmvc, json, tomcat, hibernate-validator etc.
# Spring Boot Dev Tools
When we update any code it automatically rerun the server and restarts your application. We just have to add the dependency in the pom.xml file.
# Spring Boot Actuator 
Actuator brings production-ready features to our application. Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency. Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.
# Spring boot actuator – Security
We don’t want to share out application’s information to others. So, we can add this dependency in our pom.xml file. When anyone will try to look into actuator info then spring security will prompt for login. (username: user (by default), password generated in console log).
# Running from the Command-Line
- Use java -jar
- Use Spring Boot Maven plugin
  (mvnw spring-boot:run)

