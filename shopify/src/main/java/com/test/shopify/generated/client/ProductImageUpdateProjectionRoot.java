package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductImageUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductImageUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductImageUpdatePayload"));
  }

  public ProductImageUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<ProductImageUpdateProjectionRoot<PARENT, ROOT>, ProductImageUpdateProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ProductImageUpdateProjectionRoot<PARENT, ROOT>, ProductImageUpdateProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public UserErrorProjection<ProductImageUpdateProjectionRoot<PARENT, ROOT>, ProductImageUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductImageUpdateProjectionRoot<PARENT, ROOT>, ProductImageUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
