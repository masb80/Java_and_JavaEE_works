package com.dailycodebuffer.User.VO;

import com.dailycodebuffer.User.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    // we need to a wrapper who will communicate both the
    // user and department services

    // we need to make a return type so that we can
    // we can return user and department, any
    // for this we need to  make a function in controller

    private User user;
    private Department department;

}
