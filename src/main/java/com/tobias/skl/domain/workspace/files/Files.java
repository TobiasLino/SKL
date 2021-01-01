package com.tobias.skl.domain.workspace.files;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Files {

    private Integer id;
    private String name;
    private FilesExtension type;
}
