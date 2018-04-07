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
		System.out.println("Hello world!");
		ApplicationContext context = SpringApplication.run(WebApplication.class, args);
		EmployeeData emplData = context.getBean(EmployeeData.class);
		PropertyReader reader = context.getBean(PropertyReader.class);
		Properties prop = reader.loadFile();
		System.out.println(prop.getProperty("FIO"));
		Employee empl1 = new Employee();
		empl1.setLogin("alenagentle");
		empl1.setFio(prop.getProperty("FIO"));
		empl1.setDob(prop.getProperty("DOB"));
		empl1.setPhone(prop.getProperty("phone"));
		empl1.setEmail(prop.getProperty("email"));
		empl1.setSkype(prop.getProperty("skype"));
		empl1.setTarget(prop.getProperty("target"));
		empl1.setExperiences(prop.getProperty("experiences"));
		empl1.setEducations(prop.getProperty("educations"));
		emplData.putEmplyee(empl1);
	}
}
