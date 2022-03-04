package io.javaoperatorsdk.operator.processing.dependent.dependson;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.javaoperatorsdk.operator.api.reconciler.dependent.DependentResource;

public interface Waiter<R,P extends HasMetadata> {

  void waitFor(DependentResource<R,P> resource, Condition<R,P> condition);

}
