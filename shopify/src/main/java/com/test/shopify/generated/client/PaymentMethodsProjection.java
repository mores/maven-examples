package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentMethodsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentMethodsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMethods"));
  }

  public PaymentMethodsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
