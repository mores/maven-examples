package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleCreatePayload"));
  }

  public PriceRuleCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> priceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleDiscountCodeProjection<>(this, this);    
    getFields().put("priceRuleDiscountCode", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleCreateProjectionRoot<PARENT, ROOT>, PriceRuleCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
