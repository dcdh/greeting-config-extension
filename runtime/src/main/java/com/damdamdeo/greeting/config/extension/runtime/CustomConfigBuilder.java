package com.damdamdeo.greeting.config.extension.runtime;

import io.smallrye.config.SmallRyeConfigBuilder;
import io.smallrye.config.SmallRyeConfigBuilderCustomizer;

public class CustomConfigBuilder implements SmallRyeConfigBuilderCustomizer {
    @Override
    public void configBuilder(final SmallRyeConfigBuilder builder) {
        System.out.println("CustomConfigBuilder");
        builder.withMappingIgnore("my.**");
    }
}
