package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleDeactivatePayload"));
  }

  public PriceRuleDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleDeactivateProjectionRoot<PARENT, ROOT>, PriceRuleDeactivateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
