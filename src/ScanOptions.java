package io.threatrix.threatagent;

import io.threatrix.threatcenter.core.util.git.SourceRepositoryRef;
import lombok.Data;

import java.io.File;

@Data
public class ScanOptions {

    private String orgId;
    private String entityId;
    private String apiKey;

    private File projectFile;
    private String projectName;
    private String environment;
    private boolean shallow = false;
    private SourceRepositoryRef sourceRepositoryRef;
    private String apiUrl;
    private boolean printProgress;
    private boolean disableCheckLastScan;
    private boolean verbose;

    public ScanOptions(File projectFile) {
        this.projectFile = projectFile;
    }
}
