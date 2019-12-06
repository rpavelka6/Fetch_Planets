package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Method is a request handler - will live at localhost:8080/hello

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")      //tells it where it lives
//    @ResponseBody
//    public String Hello() {
//        return "Hello, Spring!";
//        }

//Method is a request handler - will live at localhost:8080/hello/goodbye
    @GetMapping("goodbye")      //tells it where it lives
    public String Goodbye() {
        return "Goodbye, Spring!";
        }

    //Handles requests of the form /hello?name=LaunchCode
//    @GetMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")     //Handles both get and post requests
    public String HelloWithQueryParam(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String HelloWithPathParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("{language}")
    public String GetLanguage(@PathVariable String language) {
        return "Language is: " + language;
    }

    // Lives at /hello/form
    @GetMapping("form")
    public String helloform() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +   //submit a request to hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet Me!'>" +
                "<select name='language'>" +
                    "<option value='english'>English</option>" +
                    "<option value='french'>French</option>" +
                    "<option value='spanish'>Spanish</option>" +
                    "<option value='german'>German</option>" +
                    "<option value='italian'>Italian</option>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping
    public static String createMessage(String name, String language) {
        if (language.equals("french")) {
            return "Bonjour " + name;
        } else {
            return "Hello " + name;
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
