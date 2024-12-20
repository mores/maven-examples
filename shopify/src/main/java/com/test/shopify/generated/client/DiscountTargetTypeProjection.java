package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountTargetTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountTargetTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountTargetType"));
  }

  public DiscountTargetTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
