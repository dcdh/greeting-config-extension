package com.damdamdeo.greeting.config.extension.runtime;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
@Unremovable
public class GreetingService {

    @Inject
    RootConfig rootConfig;

    public boolean initAtStartup() {
        return rootConfig.datasource().initAtStartup();
    }
}
