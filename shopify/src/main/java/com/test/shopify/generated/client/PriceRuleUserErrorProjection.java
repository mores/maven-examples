package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleUserError"));
  }

  public PriceRuleUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleErrorCodeProjection<PriceRuleUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     PriceRuleErrorCodeProjection<PriceRuleUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PriceRuleUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PriceRuleUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
