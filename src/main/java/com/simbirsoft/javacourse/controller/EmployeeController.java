package com.simbirsoft.javacourse.controller;

import com.simbirsoft.javacourse.entity.Employee;
import com.simbirsoft.javacourse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    @Qualifier("employeeService")
    private EmployeeService emplServ;


    @RequestMapping(value="/emplmodel")
    public String getEmployeeInfo(Model model, @RequestParam(value = "login") String login) {


        Employee empl = this.emplServ.getEmployeeData(login);
        model.addAttribute("login", empl.getLogin());
        model.addAttribute("fio", empl.getFio());
        model.addAttribute("dob", empl.getDob());
        model.addAttribute("phone", empl.getPhone());
        model.addAttribute("email", empl.getEmail());
        model.addAttribute("skype", empl.getSkype());
        model.addAttribute("target", empl.getTarget());
        model.addAttribute("expirience", empl.getExperiences());
        model.addAttribute("education", empl.getEducations());
        return "employee";
    }

}
