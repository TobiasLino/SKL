package com.tobias.skl.domain.workspace.files;

public enum FilesExtension {
    PDF(""),
    JPG(""),
    GIF(""),
    MKV(""),
    MP4(""),
    TXT(""),
    DOC(""),
    XLS(""),
    PPT("");

    private String type;

    FilesExtension(String type) {
        this.type = type;
    }
}
