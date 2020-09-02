package ru.bokhan.education.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.bokhan.education.model.User;
import ru.bokhan.education.service.UserService;
import ru.bokhan.education.web.SecurityUtil;

import java.util.List;

import static ru.bokhan.education.util.Constants.ADMIN_ID;
import static ru.bokhan.education.util.ValidationUtil.assureIdConsistent;
import static ru.bokhan.education.util.ValidationUtil.checkNew;

@Controller
public class AdminRestController {

    private final UserService service;

    @Autowired
    public AdminRestController(UserService service) {
        this.service = service;
    }

    public List<User> getAll(){
        int userId = SecurityUtil.authUserId();
        return userId == ADMIN_ID ? service.getAll() :  null;
    }

    public User get(int id){
        return service.get(id);
    }

    public User create(User user) {
        checkNew(user);
        return service.create(user);
    }

    public void delete(int id) {
        service.delete(id);
    }

    public void update(User user, int id) {
        assureIdConsistent(user, id);
        service.update(user);
    }
}
