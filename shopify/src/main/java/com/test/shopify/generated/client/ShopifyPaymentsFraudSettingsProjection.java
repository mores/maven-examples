package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsFraudSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsFraudSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsFraudSettings"));
  }

  public ShopifyPaymentsFraudSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsFraudSettingsProjection<PARENT, ROOT> declineChargeOnAvsFailure() {
    getFields().put("declineChargeOnAvsFailure", null);
    return this;
  }

  public ShopifyPaymentsFraudSettingsProjection<PARENT, ROOT> declineChargeOnCvcFailure() {
    getFields().put("declineChargeOnCvcFailure", null);
    return this;
  }
}
