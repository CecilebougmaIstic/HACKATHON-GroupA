package org.trans_hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.trans_hack.model.User;

import org.trans_hack.service.UserService;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /*Créer un utilisateur******/
    @PostMapping("/users")
    public String saveUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        System.out.println("**************"+ user.toString());
        return userService.saveUser(user);
    }
    /*Modifier un utilisateur */
    @PutMapping("/users")
    public String updateUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return userService.updateUser(user);

    }
    /*Supprimer un utilisateur par son email*/
    @DeleteMapping ("/artists/{email}")
    public String deleteArtist(@RequestParam String email) throws ExecutionException, InterruptedException {
        return userService.deleteUser(email);
    }
    /*Api de Login*/
    @PostMapping("/users/login")
    public User loginUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return userService.loginUser(user.getEmail(),user.getPassWord());
    }

}
