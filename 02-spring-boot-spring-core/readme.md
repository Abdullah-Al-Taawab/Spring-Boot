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
# @Qualifier Anotation :
If more than one bean of the same type is available in the container, the framework will throw NoUniqueBeanDefinitionException, indicating that more than one bean is available for autowiring. To avoid this issue, we use @Qualifier to specify which bean to choose. 
# @Primary Anotation :
There is one more solution of multiple bean available problem. If we don’t need any specific one then we can add @Primary annotation to any class and it will get preference among all the available bean. Spring will automatically choose that class to create the bean despite knowing there are more available beans. But if there is @Qualifier then @Primary annotation won’t work as there is a specific class to create the bean.

