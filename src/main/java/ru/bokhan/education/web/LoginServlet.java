package ru.bokhan.education.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.bokhan.education.util.Constants.ADMIN_ID;
import static ru.bokhan.education.util.Constants.USER_ID;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        SecurityUtil.setAuthUserId(userId);
        switch (userId) {
            case ADMIN_ID:
                resp.sendRedirect("users");
                break;
            case USER_ID:
                resp.sendRedirect("restaurants");
        }
    }

}
