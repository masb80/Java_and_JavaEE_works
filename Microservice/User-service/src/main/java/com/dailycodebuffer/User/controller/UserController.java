package com.dailycodebuffer.User.controller;

import com.dailycodebuffer.User.VO.ResponseTemplateVO;
import com.dailycodebuffer.User.entity.User;
import com.dailycodebuffer.User.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    /*
    Flow of a component:
    controller autowired to service
    service autowired to repository
    repository extends JpaRepository
    JpaRepository connect Entity with Id
     */

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("in the saveUser method in user controller");
       return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId){
        log.info("in the getUserWithDepartment method in user controller");
        return userService.getUserWithDepartment(userId);
    }




}
