package com.yinwang.loginmod.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer id;
    private String password;

    public User(Integer id, String password) {
        this.id = id;
        this.password = password;
    }
}
