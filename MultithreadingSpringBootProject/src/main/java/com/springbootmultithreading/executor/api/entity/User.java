package com.springbootmultithreading.executor.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// for creatind csv file online
//https://www.mockaroo.com/

@Data
@Entity
@Table(name="USER_TBL")
public class User {
    @Id
    @GeneratedValue
//    @AllArgsConstructor
//    @NoArgsConstructor

    private int id;
    private String name;
    private String email;
    private String gender;
}
