package au.com.fabricgroup.fmu.mvc.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByUsername(String username);

    @Query(" select count(1) from UserProfile u where u.disabled = ?1 ")
    long countByStatus(long status);

    @Query(" select u from UserProfile u where u.username in ( ?1 ) ")
    List<UserProfile> findAllByUsername(List<String> usernames);
}
