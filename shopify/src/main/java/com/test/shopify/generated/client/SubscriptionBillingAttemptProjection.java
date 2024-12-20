package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttempt"));
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public OrderProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      ) {
     SubscriptionContractProjection<SubscriptionBillingAttemptProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("subscriptionContract", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> nextActionUrl() {
    getFields().put("nextActionUrl", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> originTime() {
    getFields().put("originTime", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }
}
