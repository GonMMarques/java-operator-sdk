package io.javaoperatorsdk.operator.processing.dependent;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.processing.dependent.Matcher.Result;

public interface Updater<R, P extends HasMetadata> {
  R update(R actual, R desired, P primary, Context<P> context);

  Result<R> match(R actualResource, P primary, Context<P> context);

  // todo change to simple desired matching?
  default Result<R> match(R actualResource, P primary, int index, Context<P> context) {
    if (index == 0) {
      return match(actualResource, primary, context);
    } else {
      throw new IllegalStateException("Implement this");
    }
  }
}
