package com.springbootmultithreading.executor.api.controller;

import com.springbootmultithreading.executor.api.entity.User;
import com.springbootmultithreading.executor.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    //TODO FROM HERE FEB 22 NIGHT
    // when we send a request from post man we need use value = "files" as a key  and we are using a miltipart method
    // we are using Multipart file because we are going to multiple file

    @PostMapping(value = "/users", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = "application/json")
    // we need add the file value
    public ResponseEntity saveUsers(@RequestParam(value = "files") MultipartFile[] files) throws Exception {
        // we need to iterative to call our service method
        System.out.println("Files started to save");
        for (MultipartFile file : files) {
            service.saveUsers(file);
        }
        // we need see the http status
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(value="/test")
    public void test(){
        System.out.println("post method tested");
    }


    @GetMapping(value = "/users", produces = "application/json")
    public CompletableFuture<ResponseEntity> findAllUsers() {
        return service.findAllUser().thenApply(ResponseEntity::ok);
    }

    @GetMapping(value = "/usersByMultipleThread", produces = "application/json")
    public ResponseEntity getUsers() {
        /*
        we will split the task with multiple thread
         */
        // same api we are calling by 3 thread
        // config file we have assigned 2 thread and we are making 3 task in here
        CompletableFuture<List<User>> users1 = service.findAllUser();
        CompletableFuture<List<User>> users2 = service.findAllUser();
        CompletableFuture<List<User>> users3 = service.findAllUser();
        // we will wait until all the above task are done
        CompletableFuture.allOf(users1,users2,users3).join();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
