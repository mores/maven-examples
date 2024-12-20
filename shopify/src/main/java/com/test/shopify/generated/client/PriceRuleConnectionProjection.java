package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleConnection"));
  }

  public PriceRuleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleEdgeProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     PriceRuleEdgeProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PriceRuleProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     PriceRuleProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PriceRuleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
