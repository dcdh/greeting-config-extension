package com.damdamdeo.greeting.config.extension.deployment;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

/**
 * MyConfig
 */
@ConfigMapping(prefix = "my.config")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface MyConfig {

    /**
     * hello
     */
    @WithDefault("buildTimeValue")
    String buildTimeProperty();
}
