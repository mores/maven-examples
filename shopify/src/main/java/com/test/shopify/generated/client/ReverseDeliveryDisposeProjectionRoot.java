package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryDisposeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryDisposeProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseDeliveryDisposePayload"));
  }

  public ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryLineItemProjection<ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>, ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>> reverseDeliveryLineItems(
      ) {
    ReverseDeliveryLineItemProjection<ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>, ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryLineItemProjection<>(this, this);    
    getFields().put("reverseDeliveryLineItems", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>, ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>, ReverseDeliveryDisposeProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
