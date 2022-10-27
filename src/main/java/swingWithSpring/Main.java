package swingWithSpring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Window window = context.getBean("myWindow", Window.class);
        window.printController();

        ButtonControllerService controllerService = context.getBean(ButtonControllerService.class);
        controllerService.getController().debugMethod(); //debug -> primary works!


//        context.close();
    }
}
