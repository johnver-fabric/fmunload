package au.com.fabricgroup.fmu.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "USER_PROFILE")
public class UserProfile {
    @Id
    @Column(name = "USER_PROFILE_ID")
    private Long userProfileId;
    @Column(name = "AUTHORIZED_BY")
    private String authorizedBy;
    @Column(name = "DISABLED")
    private Long disabled;
    @Column(name = "FORCE_PASSWORD_CHG")
    private Long forcePasswordChg;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SECURITY_ANSWER")
    private String securityAnswer;
    @Column(name = "SECURITY_QUESTION")
    private String securityQuestion;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "VERSION_NO")
    private Long versionNo;
    @Column(name = "CONTACT_ID")
    private Long contactId;
    @Column(name = "COMPANY_ID")
    private Long companyId;
    @Column(name = "DEFAULT_TRADING_REL_ID")
    private Long defaultTradingRelId;
    @Column(name = "USER_SERVICE_LEVEL")
    private String userServiceLevel;
    @Column(name = "HARDCODE_RECEIVER_INDICATOR")
    private Long hardcodeReceiverIndicator;
    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;
    @Column(name = "NEW_USER_SERVICE_LEVEL")
    private String newUserServiceLevel;
    @Column(name = "USER_PRODUCT")
    private String userProduct;

    public Long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Long userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public Long getDisabled() {
        return disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }

    public Long getForcePasswordChg() {
        return forcePasswordChg;
    }

    public void setForcePasswordChg(Long forcePasswordChg) {
        this.forcePasswordChg = forcePasswordChg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getDefaultTradingRelId() {
        return defaultTradingRelId;
    }

    public void setDefaultTradingRelId(Long defaultTradingRelId) {
        this.defaultTradingRelId = defaultTradingRelId;
    }

    public String getUserServiceLevel() {
        return userServiceLevel;
    }

    public void setUserServiceLevel(String userServiceLevel) {
        this.userServiceLevel = userServiceLevel;
    }

    public Long getHardcodeReceiverIndicator() {
        return hardcodeReceiverIndicator;
    }

    public void setHardcodeReceiverIndicator(Long hardcodeReceiverIndicator) {
        this.hardcodeReceiverIndicator = hardcodeReceiverIndicator;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getNewUserServiceLevel() {
        return newUserServiceLevel;
    }

    public void setNewUserServiceLevel(String newUserServiceLevel) {
        this.newUserServiceLevel = newUserServiceLevel;
    }

    public String getUserProduct() {
        return userProduct;
    }

    public void setUserProduct(String userProduct) {
        this.userProduct = userProduct;
    }

    public UserProfile() {}

    public UserProfile(Long userProfileId, String authorizedBy, Long disabled, Long forcePasswordChg, String password, String securityAnswer, String securityQuestion, String username, Long versionNo, Long contactId, Long companyId, Long defaultTradingRelId, String userServiceLevel, Long hardcodeReceiverIndicator, Timestamp createdDate, String newUserServiceLevel, String userProduct) {
        this.userProfileId = userProfileId;
        this.authorizedBy = authorizedBy;
        this.disabled = disabled;
        this.forcePasswordChg = forcePasswordChg;
        this.password = password;
        this.securityAnswer = securityAnswer;
        this.securityQuestion = securityQuestion;
        this.username = username;
        this.versionNo = versionNo;
        this.contactId = contactId;
        this.companyId = companyId;
        this.defaultTradingRelId = defaultTradingRelId;
        this.userServiceLevel = userServiceLevel;
        this.hardcodeReceiverIndicator = hardcodeReceiverIndicator;
        this.createdDate = createdDate;
        this.newUserServiceLevel = newUserServiceLevel;
        this.userProduct = userProduct;
    }
}
