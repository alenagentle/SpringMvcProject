package com.simbirsoft.javacourse.service;

import com.simbirsoft.javacourse.data.EmployeeData;
import com.simbirsoft.javacourse.data.PropertyReader;
import com.simbirsoft.javacourse.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    @Qualifier("employeeData")
    private EmployeeData emplData;

    @Autowired
    private PropertyReader reader;

    @Override
    public void setEmPloyee() {
        Properties prop = reader.loadFile();
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

    public Employee getEmployeeData(String login){
        return emplData.getEmplyeeByLogin(login);
    }
}
