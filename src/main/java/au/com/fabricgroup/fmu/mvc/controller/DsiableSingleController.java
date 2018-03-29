package au.com.fabricgroup.fmu.mvc.controller;

import au.com.fabricgroup.fmu.mvc.model.UserProfile;
import au.com.fabricgroup.fmu.mvc.model.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DsiableSingleController {
    @Autowired
    private UserProfileRepository userProfileRepository;
    @PostMapping("/disable")
    public String disableSingle(@RequestParam("username") String username, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("message", username);

        UserProfile userProfile = userProfileRepository.findByUsername(username);
        if (userProfile != null) {
            if (userProfile.getDisabled().longValue() == 0L) {
                userProfile.setDisabled(1L);
                userProfileRepository.save(userProfile);
                redirectAttributes.addFlashAttribute("message", userProfile.getUsername() + " has been disabled.");
            } else {
                redirectAttributes.addFlashAttribute("message", "Cannot process request as the user is already disabled.");
            }
        } else {
            redirectAttributes.addFlashAttribute("message", "Cannot find specified user profile.");
        }
        return "redirect:/file";
    }
}
