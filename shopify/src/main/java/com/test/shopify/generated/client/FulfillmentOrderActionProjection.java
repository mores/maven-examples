package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderAction"));
  }

  public FulfillmentOrderActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
