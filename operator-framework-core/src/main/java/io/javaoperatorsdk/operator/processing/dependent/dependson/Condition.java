package io.javaoperatorsdk.operator.processing.dependent.dependson;

import io.fabric8.kubernetes.api.model.HasMetadata;

public interface Condition<R,P extends HasMetadata> {

    boolean isMet(R dependentResource, P primaryResource);

}
