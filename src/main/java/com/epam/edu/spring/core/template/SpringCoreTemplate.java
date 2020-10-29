package com.epam.edu.spring.core.template;

import com.epam.edu.spring.core.template.configuration.InitializerConfiguration;
import com.epam.edu.spring.core.template.configuration.MainConfiguration;
import com.epam.edu.spring.core.template.repository.ItemRepository;
import com.epam.edu.spring.core.template.service.ItemService;
import com.epam.edu.spring.core.template.service.SimpleItemService;
import com.epam.edu.spring.core.template.validator.ItemValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreTemplate {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
		ApplicationContext context = new AnnotationConfigApplicationContext("configApplicationContext",configApplicationContext.getApplicationName());

		InitializerConfiguration.ColorFactory colorFactory = context.getBean(InitializerConfiguration.ColorFactory.class);
		System.out.println(colorFactory.getColor());


		SimpleItemService simpleItemService1 = context.getBean("simpleItemServiceForConstructor",SimpleItemService.class);

		ItemService itemService = context.getBean("itemService",ItemService.class);
		ItemValidator itemValidator = context.getBean("itemValidator",ItemValidator.class);

		ItemRepository itemRepository = context.getBean(ItemRepository.class);

	}

}
