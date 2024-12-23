package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsAdjustmentOrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsAdjustmentOrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsAdjustmentOrder"));
  }

  public ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT> link() {
    getFields().put("link", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<PARENT, ROOT> orderTransactionId() {
    getFields().put("orderTransactionId", null);
    return this;
  }
}
