package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersReleaseHoldsProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrdersReleaseHoldsPayload"));
  }

  public FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>, FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>, FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public FulfillmentOrdersReleaseHoldsUserErrorProjection<FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>, FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrdersReleaseHoldsUserErrorProjection<FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>, FulfillmentOrdersReleaseHoldsProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrdersReleaseHoldsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
