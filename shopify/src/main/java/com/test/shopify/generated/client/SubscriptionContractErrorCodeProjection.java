package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractErrorCode"));
  }

  public SubscriptionContractErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
