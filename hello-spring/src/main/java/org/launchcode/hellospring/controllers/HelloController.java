package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Method is a request handler - will live at localhost:8080/hello

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> theNames = new ArrayList<>();
        theNames.add("Rebecca");
        theNames.add("Robert");
        theNames.add("Rachel");
        model.addAttribute("names", theNames);
        return "hello-list";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String hello(@RequestParam String name, @RequestParam String language, Model model) {
        String theGreeting = createMessage(name, language);
        //pass the variable into the model
        model.addAttribute("greeting", theGreeting);
        //render the template
        return "hello";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")     //Handles both get and post requests
//    @ResponseBody
//    public String HelloWithQueryParam(@RequestParam (defaultValue = "World") String name,
//                                      @RequestParam (defaultValue = "english") String language) {
//        return createMessage(name, language);
//    }

    @GetMapping("form")
    public String helloform() {
//        String html = "<html>" +
//                "<body>" +
//                "<form action='/' method='post'>" +   //submit a request to hello
//                "<input type='text' name='name' />" +
//                "<select name='language'\n>" +
//                    "<option value='english'>English</option>\n" +
//                    "<option value='french'>French</option>\n" +
//                    "<option value='spanish'>Spanish</option>\n" +
//                    "<option value='german'>German</option>\n" +
//                    "<option value='italian'>Italian</option>\n" +
//                "</select>" +
//                "<input type='submit' value='Greet Me!' />" +
//                "</form>" +
//                "</body>" +
//                "</html>";
        return "form";
    }

    @GetMapping
    @ResponseBody
    public static String createMessage(String name, String language) {
        if (language.equals("french")) {
            return "Bonjour " + name + "!";
        } else {
            if (language.equals("german")) {
                return "Hallo " + name + "!";
            } else {
                if (language.equals("spanish")) {
                    return "Hola " + name + "!";
                } else {
                    if (language.equals("italian")) {
                        return "Ciao " + name + "!";
                    } else {
                        return "Hello " + name + "!";
                    }
                }
            }
        }
    }
}

//Method is a request handler - will live at the root path localhost:8080
//
//@Controller
//public class HelloController {
//
//    @GetMapping      //Means it will accept get requests
//    @ResponseBody
//    public String Hello() {
//        return "Hello, Spring!";
//    }
//}
