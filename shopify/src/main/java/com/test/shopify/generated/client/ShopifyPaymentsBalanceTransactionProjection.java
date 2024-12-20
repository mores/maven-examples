package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBalanceTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBalanceTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransaction"));
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> adjustmentsOrders(
      ) {
     ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAdjustmentOrderProjection<>(this, getRoot());
     getFields().put("adjustmentsOrders", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> net() {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> transactionDate() {
    getFields().put("transactionDate", null);
    return this;
  }
}
