package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleDiscountCodeUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleDiscountCodeUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleDiscountCodeUpdatePayload"));
  }

  public PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> priceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleDiscountCodeProjection<>(this, this);    
    getFields().put("priceRuleDiscountCode", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>, PriceRuleDiscountCodeUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
