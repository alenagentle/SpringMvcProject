package com.simbirsoft.javacourse.data;

import com.simbirsoft.javacourse.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class EmployeeData {
    private HashMap<String,Employee> hashData;

    public EmployeeData(){
        this.hashData = new HashMap<String,Employee> ();

    }

    public void putEmplyee(Employee empl){
        hashData.put(empl.getLogin(),empl);

    }

    public Employee getEmplyeeByLogin(String keyName){
        return hashData.get(keyName);
    }
}
