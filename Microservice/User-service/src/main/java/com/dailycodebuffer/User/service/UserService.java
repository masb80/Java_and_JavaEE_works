package com.dailycodebuffer.User.service;

import com.dailycodebuffer.User.VO.Department;
import com.dailycodebuffer.User.VO.ResponseTemplateVO;
import com.dailycodebuffer.User.entity.User;
import com.dailycodebuffer.User.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("in the saveUser method in user service ");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        // by giving user id, now I know the user
        User user = userRepository.findByUserId(userId);
        log.info(String.valueOf(user.getUserId()));
        // by using this user now I need to know the department
        // we need to call department service over here and
        // then we need to do a REST template request Mapping in here
        // lets create a REST template object in the main function
        log.info("in the getUserWithDepartment method in user service ");
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(), Department.class);
        // HERE, User is getting department information from the DEPARTMENT-SERVICE hostname.
        // from vo, set the user
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
