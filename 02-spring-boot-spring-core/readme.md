# Spring Container :
IoC container is a framework for implementing automated dependency injection. The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring Container can be configured either by XML, Java annotations, or Java code. These objects are called Spring Beans.
# Spring Bean :
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
# Injection Types :
There are multiple types of Injection with Spring. Constructor injection and setter injection are more preferable. 
-	Constructor Injection – When you have required dependencies and it’s recommended by spring.io development team.
- Setter Injection – When you have optional dependencies.
# Spring Autowiring :
For dependency injection Spring can use auto wiring.  We can use Spring @Autowired annotation for spring bean auto wiring. Spring will scan for @Component annotation. The @Autowired annotation can be used to auto wire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments. 
# @Component Anotation :
@Component marks a class as a Spring Bean. @Component also makes the bean available for dependency injection. In other words, without having to write any explicit code, Spring will: Scan our application for classes annotated with @Component. Instantiate them and inject any specified dependencies into them. 
