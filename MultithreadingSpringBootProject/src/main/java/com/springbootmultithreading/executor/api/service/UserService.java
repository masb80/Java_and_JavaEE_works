package com.springbootmultithreading.executor.api.service;

import com.springbootmultithreading.executor.api.entity.User;
import com.springbootmultithreading.executor.api.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class UserService {
    // to check the statement better to use log here
    Object target;
    Logger logger = LoggerFactory.getLogger(UserService.class);
    // we need to inject our repository
    @Autowired
    private UserRepository userRepository;
    /* Now make a method who will read the csv file and communicate
     with the persistence databases */
    @Async
    public CompletableFuture<List<User>> saveUsers(MultipartFile file) throws Exception {
        /*
        giving start and end time to see the execution time
         */
        long start = System.currentTimeMillis();
        // now we will write a utility method who will read and write our csv file
        List<User> users = parseCSVFile(file);
           // now give a logger mesage which thread is saving the data in csv file
        logger.info("Saving the list of the users in save {} ", users.size(), "  "+ Thread.currentThread().getName());
        // now call our repository to save the data
        users = userRepository.saveAll(users);

        long end = System.currentTimeMillis();
        // one more log statement to check the time executions
        logger.info("Total time {}", (end-start));
        return CompletableFuture.completedFuture(users);
    }

 //  parse from csv file
    private List<User> parseCSVFile(final MultipartFile file) throws Exception {
        final List<User> users = new ArrayList<>();
        try {
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    final String[] data = line.split(",");
                    final User user = new User();
                    user.setName(data[0]);
                    user.setEmail(data[1]);
                    user.setGender(data[2]);
                    users.add(user);
                }
                return users;
            }
        } catch (final IOException e) {
            logger.error("Failed to parse CSV file {}", e);
            throw new Exception("Failed to parse CSV  file {}", e);
        }
    }
    // fetching data / all the users from db
    @Async
    public CompletableFuture<List<User>> findAllUser(){
        // give a logger to get the active thread name
        logger.info("get list of user by "+ Thread.currentThread().getName());
        List<User> users = userRepository.findAll();
        return CompletableFuture.completedFuture(users);
    }

}
