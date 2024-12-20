package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanReserveProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanReserveProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanReserve"));
  }

  public SellingPlanReserveProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
