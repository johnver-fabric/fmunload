package au.com.fabricgroup.fmu.mvc.controller;

import au.com.fabricgroup.fmu.mvc.model.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
    @Autowired
    private UserProfileRepository userProfileRepository;
    @GetMapping("/test")
    public String count(Model model) {
        model.addAttribute("message", "Amount of UserProfiles is " + String.valueOf(userProfileRepository.count()));
        return "test";
    }
}
