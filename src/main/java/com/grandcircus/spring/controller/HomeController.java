package com.grandcircus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * import com.grandcircus.spring.util.com.grandcircus.spring.controller.UserInput;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.ModelAttribute;

 *
 * Created by USER on 5/8/2017.
 */


@Controller
public class HomeController {

   /* @RequestMapping("/")
    public ModelAndView helloWorld(){
        return new ModelAndView("welcome","hello","Hello World");
    }*/
   @RequestMapping(value = "/")
   public ModelAndView index() {
       return new ModelAndView("index", " ", " ");
   }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView userinput() {
       return new ModelAndView("userinput","command",new UserInput());
    }

    @RequestMapping(value = "/addUserInput", method = RequestMethod.POST)
    public String addUserInput(UserInput userinput, Model model) {
        model.addAttribute("firstname", userinput.getFirstName());
        model.addAttribute("lastname", userinput.getLastName());
        model.addAttribute("ordernumber", userinput.getOrderNumber());

        return "result";
    }

}



/* @RequestMapping(value ="/", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student","command", new Student());
    }

    @RequestMapping(value="/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student, Model model){
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "result";*/
