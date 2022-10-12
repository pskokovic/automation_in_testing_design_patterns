package com.qualityhouse.course.ait.d_keyword_driven_testing.testdata;

import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models.User;
import lombok.Getter;

@Getter
public class UsersData {

    private User student1;
    private User student2;
    private User student3;
    private User student4;
    private User student5;
    private User userWithWrongPassword;

    public UsersData() {
        initialize();
    }

    private void initialize() {
        initStudent1();
        initStudent2();
        initStudent3();
        initStudent4();
        initStudent5();
        initUserWithWrongPassword();
    }

    private void initStudent1() {
        student1 = User.builder()
                       .username("student1")
                       .password("stpass1")
                       .email("student1@example.com")
                       .name("Student One")
                       .phone("+1111")
                       .address("Student Str. 1")
                       .build();
    }

    private void initStudent2() {
        student2 = User.builder()
                       .username("student2")
                       .password("stpass2")
                       .email("student2@example.com")
                       .name("Student Two")
                       .phone("+2222")
                       .address("Student Str. 2")
                       .build();
    }

    private void initStudent3() {
        student3 = User.builder()
                       .username("student3")
                       .password("stpass3")
                       .email("student3@example.com")
                       .name("Student Three")
                       .phone("+3333")
                       .address("Student Str. 3")
                       .build();
    }

    private void initStudent4() {
        student4 = User.builder()
                       .username("student4")
                       .password("stpass4")
                       .email("student4@example.com")
                       .name("Student Four")
                       .phone("+4444")
                       .address("Student Str. 4")
                       .build();
    }

    private void initStudent5() {
        student5 = User.builder()
                       .username("student5")
                       .password("stpass5")
                       .email("student5@example.com")
                       .name("Student Five")
                       .phone("+5555")
                       .address("Student Str. 5")
                       .build();
    }

    private void initUserWithWrongPassword() {
        userWithWrongPassword = User.builder()
                                    .username("student9")
                                    .password("wrong password")
                                    .email("student9@example.com")
                                    .name("Student Wrong Password")
                                    .phone("+9988777")
                                    .address("Student Str. 999")
                                    .build();
    }

}
