package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleActivatePayload"));
  }

  public PriceRuleActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleActivateProjectionRoot<PARENT, ROOT>, PriceRuleActivateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
