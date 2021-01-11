package org.LaunchCode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String hello (){
        return "<html>" +
                "<head>" +
                "<h1>Skills Tracker </h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol>" +
                "<l1>1. Java </l1>" +
                "<br><l2>2. JavaScript </l2>" +
                "<br><l3>3. Python </l3>" +
                "</ol>" +
                "</head>" +
                "</html>";
    }
    @GetMapping("form")
    @ResponseBody
    public String form (){
        return "<form method = post" +
                "<label for= name> Name:</label><br>" +
                "<input type = 'text' name = 'name'/><br>" +
                "<label for= language1> My Favorite Language</label><br> " +
                "<select name ='language1'>" +
                "<option value = 'Java'> java</option>" +
                "<option value = 'JavaScript'> javascript</option>" +
                "<option value = 'Python'> python</option>" +
                "</select> <br>" +
                "<label for = language2> My Second Favorite Language </label> <br> " +
                "<select name ='language2'>" +
                "<option value = 'Java'> java</option>" +
                "<option value = 'JavaScript'> javascript</option>" +
                "<option value = 'Python'> python</option>" +
                "</select><br>" +
                "<label for = language3> My Third Favorite Language </label> <br>" +
                "<select name ='language3'>" +
                "<option value = 'Java'> java</option>" +
                "<option value = 'JavaScript'> javascript</option>" +
                "<option value = 'Python'> python</option>" +
                "</select><br>" +
                "<input type = 'submit' value ='Submit!'/>";
    }
    @PostMapping("form")
    @ResponseBody
    public String form(@RequestParam String name,
                          @RequestParam String language1,
                          @RequestParam String language2,
                          @RequestParam String language3) {
        String skillsDisplay1;
        switch (language1){
            case "java":
                skillsDisplay1 = "Java";
                break;
            case "javascript":
                skillsDisplay1 = "Javascript";
                break;
            default:
                skillsDisplay1 ="Python";
        }


        String skillsDisplay2;
        switch (language2){
            case "java":
                skillsDisplay2 = "Java";
                break;
            case "javascript":
                skillsDisplay2 = "Javascript";
                break;
            default:
                skillsDisplay2 ="Python";
        }



        String skillsDisplay3;
        switch (language3){
            case "java":
                skillsDisplay3 = "Java";
                break;
            case "javascript":
                skillsDisplay3 = "Javascript";
                break;
            default:
                skillsDisplay3 ="Python";
        }
        return name + skillsDisplay1+ skillsDisplay2 + skillsDisplay3;

    }


}

