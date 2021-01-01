package com.tobias.skl.domain.workspace;

import com.tobias.skl.domain.application.Application;
import com.tobias.skl.domain.workspace.files.Files;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkSpace {

    private Integer id;
    private Application application;
    private List<Files> files;
}
