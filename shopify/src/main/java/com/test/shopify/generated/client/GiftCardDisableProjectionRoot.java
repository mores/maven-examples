package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardDisableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardDisableProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardDisablePayload"));
  }

  public GiftCardDisableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardDisableProjectionRoot<PARENT, ROOT>, GiftCardDisableProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardDisableProjectionRoot<PARENT, ROOT>, GiftCardDisableProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public UserErrorProjection<GiftCardDisableProjectionRoot<PARENT, ROOT>, GiftCardDisableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<GiftCardDisableProjectionRoot<PARENT, ROOT>, GiftCardDisableProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
