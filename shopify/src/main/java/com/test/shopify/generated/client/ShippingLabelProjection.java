package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabel"));
  }

  public ShippingLabelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<ShippingLabelProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<ShippingLabelProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public ShippingLabelProjection<PARENT, ROOT> cancellable() {
    getFields().put("cancellable", null);
    return this;
  }

  public ShippingLabelProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLabelProjection<PARENT, ROOT> printed() {
    getFields().put("printed", null);
    return this;
  }
}
