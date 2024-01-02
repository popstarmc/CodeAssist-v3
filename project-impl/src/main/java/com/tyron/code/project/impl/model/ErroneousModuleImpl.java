package com.tyron.code.project.impl.model;

import com.tyron.code.project.model.ProjectError;
import com.tyron.code.project.model.module.ErroneousModule;

import java.nio.file.Path;
import java.util.List;

public class ErroneousModuleImpl extends AbstractModule implements ErroneousModule {

    private final List<ProjectError> errors;

    public ErroneousModuleImpl(Path rootDirectory, List<ProjectError> errors) {
        super(rootDirectory);
        this.errors = errors;
    }

    @Override
    public List<ProjectError> getErrors() {
        return errors;
    }
}
