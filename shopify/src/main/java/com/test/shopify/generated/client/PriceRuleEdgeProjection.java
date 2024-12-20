package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleEdge"));
  }

  public PriceRuleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<PriceRuleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PriceRuleProjection<PriceRuleEdgeProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PriceRuleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
