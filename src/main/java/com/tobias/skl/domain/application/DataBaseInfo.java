package com.tobias.skl.domain.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataBaseInfo {

    private Integer id;
    private String host;
    private String name;
    private String databaseType;

    private String username;
    private String password;

    private Integer port;
    private String SID;
    private String serviceName;
    private Environment environment;
}
