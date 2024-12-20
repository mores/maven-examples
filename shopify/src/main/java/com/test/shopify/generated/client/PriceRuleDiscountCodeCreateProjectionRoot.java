package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDiscountCodeCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDiscountCodeCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleDiscountCodeCreatePayload"));
  }

  public PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> priceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleDiscountCodeProjection<>(this, this);    
    getFields().put("priceRuleDiscountCode", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
