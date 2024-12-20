package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransaction"));
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> adjustmentsOrders(
      ) {
     ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAdjustmentOrderProjection<>(this, getRoot());
     getFields().put("adjustmentsOrders", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> net(
      ) {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> transactionDate() {
    getFields().put("transactionDate", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsBalanceTransaction {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
