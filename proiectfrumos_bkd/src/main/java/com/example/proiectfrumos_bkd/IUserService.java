package com.example.proiectfrumos_bkd;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();
    public void createUser(User user);
    public void updateUser(Long id, User user);
    public void partialUpdateUser(Long id, User user);
    public void deleteUser(Long id);

}
