package com.practice.mvc;

import com.practice.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    //adding validation rules
    @NotNull(message = "Last Name is required")
    @Size(min = 1, message = "Last Name is required")
    private String lastName;

    @Min(value=0, message = "Age must be more than 0")
    @Max(value=120, message = "Age must be less than 120")
    @NotNull(message ="Age is required")
    private Integer age;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits allowed")
    private String postalCode;

    @CourseCode(value = "PRA", message = "The course code with must start with PRA")
    private String courseCode;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
