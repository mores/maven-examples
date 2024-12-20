package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceRuleUpdatePayload"));
  }

  public PriceRuleUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> priceRule(
      ) {
    PriceRuleProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleProjection<>(this, this);    
    getFields().put("priceRule", projection);
    return projection;
  }

  public PriceRuleDiscountCodeProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> priceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleDiscountCodeProjection<>(this, this);    
    getFields().put("priceRuleDiscountCode", projection);
    return projection;
  }

  public PriceRuleUserErrorProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> priceRuleUserErrors(
      ) {
    PriceRuleUserErrorProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new PriceRuleUserErrorProjection<>(this, this);    
    getFields().put("priceRuleUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PriceRuleUpdateProjectionRoot<PARENT, ROOT>, PriceRuleUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
