package au.com.fabricgroup.fmu.mvc.service;

import au.com.fabricgroup.fmu.mvc.model.UserProfile;
import au.com.fabricgroup.fmu.mvc.model.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class UserProfileService {
    private static final long ENABLED = 0L;
    private static final long DISABLED = 1L;
    @Autowired
    private UserProfileRepository userProfileRepository;
    public List<String> bulkDisable(List<UserProfile> userProfileList) {
        List<String> messages = new ArrayList<String>();
        Iterator<UserProfile> userProfileIterator = userProfileList.iterator();
        List<UserProfile> newUserProfileList = new ArrayList<UserProfile>();
        while (userProfileIterator.hasNext()) {
            UserProfile userProfile = userProfileIterator.next();
            if (userProfile.getDisabled().longValue() == ENABLED) {
                userProfile.setDisabled(Long.valueOf(DISABLED));
                newUserProfileList.add(userProfile);
            }
        }
        if (newUserProfileList.size() > 0) {
            newUserProfileList = userProfileRepository.saveAll(newUserProfileList);
        }
        userProfileIterator = newUserProfileList.iterator();
        while (userProfileIterator.hasNext()) {
            messages.add("User [" + userProfileIterator.next().getUsername() + "] has been disabled.");
        }
        return messages;
    }
}
