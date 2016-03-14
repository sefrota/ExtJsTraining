package com.extjstraining.server.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by sletras on 09/03/2016.
 */
public class Person {

    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String company;
    private String email;
    private String country;
    private LocalDate dateOfBirth;
    private String profilePicUrl;

    public Person(String userId, String password, String firstName,
                  String lastName, String company, String email,
                  String country, LocalDate dateOfBirth, String profilePicUrl) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.profilePicUrl = profilePicUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    @Override
    public String toString() {
        return String.format(
                "Person:[userId='%s', password='%s', firstName='%s', lastName='%s'," +
                        "company='%s', email='%s', country='%s', dateOfBirth='%s'" +
                        "profilePicUrl='%s'",
                userId, password, firstName, lastName,
                company, email, country, dateOfBirth, profilePicUrl);
    }
}
