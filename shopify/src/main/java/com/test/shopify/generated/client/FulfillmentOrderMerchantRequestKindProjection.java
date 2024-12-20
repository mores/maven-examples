package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMerchantRequestKindProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMerchantRequestKindProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMerchantRequestKind"));
  }

  public FulfillmentOrderMerchantRequestKindProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
