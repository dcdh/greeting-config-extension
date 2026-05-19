package com.damdamdeo.greeting.config.extension.runtime;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

/**
 * RootConfig
 */
@ConfigMapping(prefix = "my")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface RootConfig {

    /**
     * Datasource configuration
     */
    DatasourceConfiguration datasource();

    @ConfigGroup
    interface DatasourceConfiguration {

        /**
         * init at startup
         */
        @WithDefault("true")
        boolean initAtStartup();
    }
}
