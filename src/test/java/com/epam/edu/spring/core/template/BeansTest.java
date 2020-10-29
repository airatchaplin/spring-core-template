package com.epam.edu.spring.core.template;

import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import com.epam.edu.spring.core.template.service.ItemService;
import com.epam.edu.spring.core.template.validator.ItemValidator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BeansTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);

    @Test
    @DisplayName("Тест бина ItemService с неправильным названием.")
    public void getBeanItemService1(){
        context.getBean("service", ItemService.class);
    }

    @Test
    @DisplayName("Тест бина ItemService.")
    public void getBeanItemService2(){
        context.getBean("itemService",ItemService.class);
    }

    @Test
    @DisplayName("Тест бина ItemValidator.")
    public void getBeanItemValidator(){
        context.getBean("itemValidator", ItemValidator.class);
    }

    @Test
    @DisplayName("Тест бина ItemRepository.")
    public void getBeanItemRepository(){
        context.getBean("itemRepository", ItemRepository.class);
    }
}
