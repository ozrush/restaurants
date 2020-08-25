package ru.bokhan.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bokhan.education.model.User;
import ru.bokhan.education.repository.UserRepository;

import java.util.List;

import static ru.bokhan.education.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserService {


    private  final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user){
        return repository.save(user);
    }

    public void delete(int id){
        checkNotFoundWithId(repository.delete(id), id);
    }

    public User get(int id){
        return checkNotFoundWithId(repository.get(id), id);
    }

    public List<User> getAll(){
        return repository.getAll();
    }

    public void update(User user) {
        checkNotFoundWithId(repository.save(user), user.getId());
    }


}
