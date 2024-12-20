package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingMethod"));
  }

  public ShippingMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingMethodProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShippingMethodProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }
}
