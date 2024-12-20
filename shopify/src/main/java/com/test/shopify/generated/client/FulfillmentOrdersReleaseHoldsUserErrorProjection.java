package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersReleaseHoldsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrdersReleaseHoldsUserError"));
  }

  public FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrdersReleaseHoldsUserErrorCodeProjection<FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrdersReleaseHoldsUserErrorCodeProjection<FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrdersReleaseHoldsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrdersReleaseHoldsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
