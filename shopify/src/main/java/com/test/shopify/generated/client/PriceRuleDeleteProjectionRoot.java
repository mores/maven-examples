package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleDeletePayload"));
  }

  public PriceRuleDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleUserErrorProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public ShopProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleDeleteProjectionRoot<PARENT, ROOT>, PriceRuleDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PriceRuleDeleteProjectionRoot<PARENT, ROOT> deletedPriceRuleId() {
    getFields().put("deletedPriceRuleId", null);
    return this;
  }
}
