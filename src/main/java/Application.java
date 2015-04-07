import org.springframework.boot.SpringApplication;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        HelloService helloService = context.getBean(HelloService.class);
//        System.out.println(helloService.sayHello());
        SpringApplication.run(Application.class, args);
    }
}
