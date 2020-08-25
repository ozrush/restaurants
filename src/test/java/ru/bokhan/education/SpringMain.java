package ru.bokhan.education;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bokhan.education.model.User;
import ru.bokhan.education.repository.UserRepository;
import ru.bokhan.education.repository.jdbc.JdbcUserRepository;

import java.sql.SQLOutput;
import java.util.Arrays;

import static ru.bokhan.education.UserTestData.getNew;

public class SpringMain {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-app.xml", "classpath:spring/spring-db.xml")){
            System.out.println("Bean definition names: "+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
            UserRepository repository = applicationContext.getBean(JdbcUserRepository.class);
            User created = repository.save(getNew());
            System.out.println(created);
        }
    }
}
