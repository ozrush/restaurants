package ru.bokhan.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bokhan.education.model.User;
import ru.bokhan.education.repository.UserRepository;

import java.util.List;

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
        repository.delete(id);
    }

    public User get(int id){
        return repository.get(id);
    }

    public List<User> getAll(){
        return repository.getAll();
    }

    public void update(User user) {
        repository.save(user);
    }


}
