package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsText(){
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +

                "<h2>We have a few skills we would like to learn. Here's the list: </h2>" +

                "<ol>"+
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                     "<li>Python</li>" +
                "</ol>" +

                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        String formhtml =
                "<html>" +
                "<body>" +
                    "<form action = 'userProfile' method = 'post'>" +
                        "<p>Name:</p>" +
                        "<input type = 'text' name = 'name' </input>" +

                        "<p>My favorite Language:</p>" +
                        "<select name = 'choice1' id='choice1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +

                        "<p>My 2nd favorite Language:</p>" +
                        "<select name = 'choice2' id='choice2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +

                        "<p>My 3rd favorite Language:</p>" +
                        "<select name = 'choice3' id='choice3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +

                        "<p><input type = 'submit' value = 'Submit' /></p>" +
                    "</form>"

                + "</body>"
                + "</html>";
        return formhtml;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "userProfile")
    @ResponseBody
    public static String createProfile(@RequestParam String name, String choice1, String choice2, String choice3){
        return "<html>" +
                "<body>" +
                "<h1>" +
                 name +
                "</h1>" +

                "<ol>" +

                "<li>" +
                choice1 +
                "</li>" +

                "<li>" +
                choice2 +
                "</li>" +

                "<li>" +
                choice3 +
                "</li>" +

                "</ol>" +

                "</body>" +
                "</html>";
    }

}
