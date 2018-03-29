package au.com.fabricgroup.fmu.mvc.controller;

import au.com.fabricgroup.fmu.mvc.model.UserProfileRepository;
import au.com.fabricgroup.fmu.mvc.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class FileUploadController {
    @Autowired
    private UserProfileService userProfileService;
    @Autowired
    private UserProfileRepository userProfileRepository;
    @PostMapping("/file/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("message", file.getOriginalFilename());
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.getInputStream()));
            String line = null;
            List<String> usernames = new ArrayList<String>();
            Pattern pattern = Pattern.compile("^[A-Za-z0-9.@]+$");
            StringBuffer errors = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null) {
                if (line != null && !StringUtils.isEmpty(line.trim()) && pattern.matcher(line).matches()) {
                    usernames.add(line.trim());
                } else {
                    errors.append("[").append(line).append("] ");
                    redirectAttributes.addFlashAttribute("invalid", "Username " + errors.toString() + "has unacceptable character(s)");
                    continue;
                }
            }
            if (usernames.size() > 0) {
                redirectAttributes.addFlashAttribute("messages", userProfileService.bulkDisable(userProfileRepository.findAllByUsername(usernames)));
            }
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/file";
    }
}
