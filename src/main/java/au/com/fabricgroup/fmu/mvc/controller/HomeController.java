package au.com.fabricgroup.fmu.mvc.controller;

import au.com.fabricgroup.fmu.mvc.model.UserProfile;
import au.com.fabricgroup.fmu.mvc.model.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserProfileRepository userProfileRepository;
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("total", userProfileRepository.count());
        model.addAttribute("enabled", userProfileRepository.countByStatus(0L));
        model.addAttribute("disabled", userProfileRepository.countByStatus(1L));
        return "home";
    }

}
