# Spring Container :
IoC container is a framework for implementing automated dependency injection. The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring Container can be configured either by XML, Java annotations, or Java code. These objects are called Spring Beans.
# Spring Bean :
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
# Injection Types :
There are multiple types of Injection with Spring. Constructor injection and setter injection are more preferable. 
-	Constructor Injection – When you have required dependencies and it’s recommended by spring.io development team.
- Setter Injection – When you have optional dependencies.
# Spring Autowiring :
For dependency injection Spring can use auto wiring.  We can use Spring __@Autowired__ annotation for spring bean auto wiring. Spring will scan for @Component annotation. The @Autowired annotation can be used to auto wire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments. 
# @Component Anotation :
__@Component__ marks a class as a Spring Bean. __@Component__ also makes the bean available for dependency injection. In other words, without having to write any explicit code, Spring will: Scan our application for classes annotated with __@Component__. Instantiate them and inject any specified dependencies into them. 
# @Qualifier Anotation :
If more than one bean of the same type is available in the container, the framework will throw __NoUniqueBeanDefinitionException__, indicating that more than one bean is available for autowiring. To avoid this issue, we use __@Qualifier__ to specify which bean to choose. 
# @Primary Anotation :
There is one more solution of multiple bean available problem. If we don’t need any specific one then we can add __@Primary__ annotation to any class and it will get preference among all the available bean. Spring will automatically choose that class to create the bean despite knowing there are more available beans. But if there is __@Qualifier__ then __@Primary__ annotation won’t work as there is a specific class to create the bean.
# Lazy Initialization :
By default, in Spring, all the defined beans, and their dependencies, are created when the application context is created. Spring will create an instance of each and make them available. In contrast, when we configure a bean with lazy initialization, the bean will only be created, and its dependencies injected, once they're needed. We can use __@Lazy__ annotation in each class so that it won’t be initiated until it’s required. But when we will work on large project and there will be uncountable classes so this annotation won’t be a suitable one.  “ __spring.main.lazy-initialization=true__ “
Spring Boot 2 introduces the spring.main.lazy-initialization property, making it easier to configure lazy initialization across the whole application.
Setting the property value to true means that all the beans in the application will use lazy initialization.
__Disadvantages__ :
- If you have web related components like __@RestController__, not created until requested
- May not discover configuration issues until too late
- Need to make sure you have enough memory for all beans once created
# Configuring Beans With Java Code :
First, we have to create a Configure class with __@Configuration__ Annotation. Then define the __@Bean__ method to configure the Bean. Lastly, Inject the bean into our controller. 
# @Bean Annotation :
Spring __@Bean__ Annotation is applied on a method to specify that it returns a bean to be managed by Spring context. Spring Bean annotation is usually declared in Configuration classes methods. In this case, bean methods may reference other __@Bean__ methods in the same class by calling them directly.

__@Bean__ Annotation make an existing third-party class available in Spring Framework. You may not have access to the source code of third-party class and you want to use that class as a Spring Bean. 

# @Bean Scopes :
Scope mainly refers to the lifecycle of a bean. Like how long does a bean live or how many instance are created. 
Spring Bean Scopes allows us to have more granular control of the bean instances creation. Sometimes we want to create bean instance as singleton but in some other cases we might want it to be created on every request or once in a session.
-	Singleton Scope
-	Prototype Scope 
-	Request Scope
# Singleton Scope :
When we define a bean with the singleton scope, the container creates a single instance of that bean; all requests for that bean name will return the same object, which is cached. Any modifications to the object will be reflected in all references to the bean. This scope is the default value if no other scope is specified.
# Prototype Scope:
A new instance will be created every time the bean is requested from the spring container.
# Request Scope:
This is same as prototype scope however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.

