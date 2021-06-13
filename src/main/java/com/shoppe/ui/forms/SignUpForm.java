package com.shoppe.ui.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class SignUpForm {

    @NotEmpty(message = "{firstname.not.empty}")
    private String firstName;

    private String middleInitial;

    private String lastName;

    @NotEmpty(message = "{email.id.not.empty}")
    @Email(message = "{email.id.invalid.format}")
    private String emailId;

    private String uniqueId;

    @NotEmpty(message = "{mobile.number.not.empty}")
    private String mobileNo;

    @NotEmpty(message = "{password.not.empty}")
    private String password;

    @NotEmpty(message = "{confirm.password.not.empty}")
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
