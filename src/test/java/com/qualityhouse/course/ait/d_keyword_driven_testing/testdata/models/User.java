package com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String address;
}
