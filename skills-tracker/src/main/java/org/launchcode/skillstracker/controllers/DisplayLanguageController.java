package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping("/")
public class DisplayLanguageController {

    @GetMapping
    @RequestMapping("/")
    public String displayHeader() {
        return "<html><head>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "</head>" +
                "<body>" +
                "<h2>" +
                "We have a few skills we would like you to learn.  Here is the list!" +
                "</h2>" +
                "<ol type='1'>" +
                "<li>Java</li>\n" +
                "  <li>JavaScript</li>\n" +
                "  <li>Python</li>\n" +
                "</ol>" +
                "</html>";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="skill")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String displayLanguageChoice(@RequestParam (defaultValue = "World") String name,
            @RequestParam (defaultValue = "Java") String language) {
        return "Language chosen";
    }

    @GetMapping("form")
    public String languageForm() {
        return "<html>" +
                "<body><h1><center>" +
                "<form action='skill' method='post'>" +
                "Name: <br>" +
                "<input type='text' name='name'><br>" +
                "My favorite language: <br>" +
                "<select name='language'>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='java'>Java</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Select'><br>" +
                "My second favorite language:<br>" +
                "<select name='2language'>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Select'><br>" +
                "My third favorite language:<br>" +
                "<select name=3language'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Select'><br>" +
                "</form></h1></center>" +
                "</body>" +
                "</html>";
    }
}
