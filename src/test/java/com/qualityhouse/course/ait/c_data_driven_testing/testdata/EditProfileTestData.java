package com.qualityhouse.course.ait.c_data_driven_testing.testdata;

import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class EditProfileTestData {

    // todo: Exercise C-2.1a - populate test data with correct user profile details
    @DataProvider(name = "valid user profiles")
    public static Object[][] validUsersDP() {
        return new Object[][] {

        };
    }

    // todo: Exercise C-2.2a - populate test data with incorrect user profile details, to provoke the system to handle errors
    @DataProvider(name = "invalid user profiles")
    public static Object[][] invalidUsersDP() {
        return new Object[][] {

        };
    }
}
