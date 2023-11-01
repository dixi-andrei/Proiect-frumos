package com.example.proiectfrumos_bkd;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user){
        validateEmail(user.getEmail());
        validateUsername(user.getUsername());
        //validatePassword(user.getParola());
        userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        User userUpdate = userRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(String.format("User-ul cu id-ul %s nu exista",id)));

        validateEmail(user.getEmail());
        validateUsername(user.getUsername());
        //validatePassword(userUpdate.getParola());

        userUpdate.setUsername(user.getUsername());
        userUpdate.setNume(user.getNume());
        userUpdate.setPrenume(user.getPrenume());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setParola(user.getParola());

        userRepository.save(userUpdate);

    }

    @Override
    public void partialUpdateUser(Long id, User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(String.format("User-ul cu id-ul %s nu există", id)));

        if (user.getUsername() != null) {
            validateUsername(user.getUsername());
            userToUpdate.setUsername(user.getUsername());
        }
        if (user.getNume() != null) {
            userToUpdate.setNume(user.getNume());
        }
        if (user.getPrenume() != null) {
            userToUpdate.setPrenume(user.getPrenume());
        }
        if (user.getEmail() != null) {
            validateEmail(user.getEmail());
            userToUpdate.setEmail(user.getEmail());
        }
        if (user.getParola() != null) {
            validatePassword(user.getParola());
            userToUpdate.setParola(user.getParola());
        }

        userRepository.save(userToUpdate);
    }


    @Override
    public void deleteUser(Long id) {
        boolean userExists = userRepository.existsById(id);
        if(!userExists){
            throw new IllegalStateException(String.format("User-ul cu id-ul %s nu exista",id));
        }
        userRepository.deleteById(id);
    }

    public void validateEmail(String email){
        Optional<User> userOptional = userRepository.getUserByEmail(email);
        if(userOptional.isPresent()){
            throw new IllegalStateException(String.format("Un cont este deja creat cu adresa de email %s!",email));
        }
    }

    public void validateUsername(String username){
        Optional<User> userOptional = userRepository.getUserByUsername(username);
        if(userOptional.isPresent()){
            throw new IllegalStateException(String.format("Un cont are deja username-ul %s",username));
        }
    }

    public void validatePassword(String parola){
        if(parola.length() < 8){
            throw new IllegalStateException("Parola trebuie sa fie de cel putin 8 caractere!");
        }

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;

        for(char c : parola.toCharArray()){
            if(Character.isUpperCase(c)){
                upperCase = true;
            }
            if(Character.isLowerCase(c)){
                lowerCase = true;
            }
            if(Character.isDigit(c)){
                digit = true;
            }
        }

        if (!upperCase || !lowerCase || !digit) {
            throw new IllegalStateException("Parola trebuie să conțină cel puțin o literă mare, o literă mică și o cifră!");
        }

    }

}
