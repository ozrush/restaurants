package ru.bokhan.education.web;

import static ru.bokhan.education.util.Constants.START_SEQ;

public class SecurityUtil {
    private static int id = START_SEQ;

    public static int authUserId() {
        return id;
    }

    public static void setAuthUserId(int id) {
        SecurityUtil.id = id;
    }

}
