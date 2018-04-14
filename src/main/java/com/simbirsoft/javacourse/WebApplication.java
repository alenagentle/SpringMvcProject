package com.simbirsoft.javacourse;

import com.simbirsoft.javacourse.data.EmployeeData;
import com.simbirsoft.javacourse.data.PropertyReader;
import com.simbirsoft.javacourse.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebApplication.class, args);
	}
}
