package com.tobias.skl.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Integer id;
    private String name;
    private String password;
    private List<Role> roles;
}
