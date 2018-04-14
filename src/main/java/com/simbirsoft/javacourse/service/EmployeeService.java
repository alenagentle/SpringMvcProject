package com.simbirsoft.javacourse.service;

import com.simbirsoft.javacourse.entity.Employee;

public interface EmployeeService {
    Employee getEmployeeData(String login);
    void setEmPloyee();
}
