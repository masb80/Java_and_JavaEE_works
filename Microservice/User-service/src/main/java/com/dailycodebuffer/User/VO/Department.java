package com.dailycodebuffer.User.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    // we will only add a POJO in here
    // we don't need to add any @Id or anything
    // this mainly communicating with the department services

    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
