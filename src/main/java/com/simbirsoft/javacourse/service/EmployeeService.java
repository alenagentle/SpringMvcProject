package com.simbirsoft.javacourse.service;

import com.simbirsoft.javacourse.data.EmployeeData;
import com.simbirsoft.javacourse.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    @Autowired
    @Qualifier("employeeData")
    private EmployeeData emplData;

    public Employee getEmployeeData(String login){
        return emplData.getEmplyeeByLogin(login);
    }


}
