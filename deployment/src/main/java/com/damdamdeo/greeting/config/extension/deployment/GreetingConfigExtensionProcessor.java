package com.damdamdeo.greeting.config.extension.deployment;

import com.damdamdeo.greeting.config.extension.runtime.GreetingService;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

import java.util.List;

class GreetingConfigExtensionProcessor {

    private static final String FEATURE = "greeting-config-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    List<AdditionalBeanBuildItem> additionalBeanBuildItems(MyConfig config) {
        System.out.println("config.fixAtBuildTimeProperty: " + config.buildTimeProperty());
        return List.of(AdditionalBeanBuildItem.unremovableOf(GreetingService.class));
    }
}
