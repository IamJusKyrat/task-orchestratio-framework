package com.example.parent;

import com.example.imported.ImportedTaskService;
import org.springframework.beans.factory.annotation.Autowired;

public class ImportedWrapperService {
    @Autowired
    public ImportedTaskService importedTaskService;

    public String performImportedTaskSpecificAction(){
        return importedTaskService.performSpecialFunction();
    }
}
