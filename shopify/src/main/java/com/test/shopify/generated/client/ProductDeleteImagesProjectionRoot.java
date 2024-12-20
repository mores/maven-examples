package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDeleteImagesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDeleteImagesProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDeleteImagesPayload"));
  }

  public ProductDeleteImagesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductDeleteImagesProjectionRoot<PARENT, ROOT>, ProductDeleteImagesProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductDeleteImagesProjectionRoot<PARENT, ROOT>, ProductDeleteImagesProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductDeleteImagesProjectionRoot<PARENT, ROOT>, ProductDeleteImagesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductDeleteImagesProjectionRoot<PARENT, ROOT>, ProductDeleteImagesProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDeleteImagesProjectionRoot<PARENT, ROOT> deletedImageIds() {
    getFields().put("deletedImageIds", null);
    return this;
  }
}
