package com.tobias.skl.domain.application;

import com.tobias.skl.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Application {

    private Integer id;
    private String name;
    private User solutionLeader;
    private User businessAnalyst;
    private DataBaseInfo dataBaseInfo;
    private List<Link> links;
    private List<User> userLogins;
    private List<Technology> technologies;
}
