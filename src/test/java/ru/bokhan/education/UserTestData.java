package ru.bokhan.education;

import ru.bokhan.education.model.Role;
import ru.bokhan.education.model.User;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTestData {
    public static final int START_SEQ = 100000;
    public static final int NOT_FOUND = 10;
    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;

    public static final User USER = new User(USER_ID, "User", "user@gmail.com", "Password", Role.USER, null);
    public static final User ADMIN = new User(ADMIN_ID, "Admin", "admin@gmail.com", "Password", Role.ADMIN, null);

    public static User getNew() {
        return new User(null, "New", "new@user.com", "newPass", Role.USER, null);
    }

    public static User getUpdated() {
        User updated = new User(USER);
        updated.setName("UpdatedName");
        updated.setPassword("NewPass");
        updated.setEmail("newEmail");
        updated.setRole(Role.ADMIN);
        return updated;
    }

    public static void assertMatch(User actual, User expected) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected, "role");
    }
    public static void assertMatch(Iterable<User> actual, User... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }
    public static void assertMatch(Iterable<User> actual, Iterable<User> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields("role").isEqualTo(expected);
    }
}
