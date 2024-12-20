package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductAppendImagesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductAppendImagesProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductAppendImagesPayload"));
  }

  public ProductAppendImagesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> newImages(
      ) {
    ImageProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("newImages", projection);
    return projection;
  }

  public ProductProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductAppendImagesProjectionRoot<PARENT, ROOT>, ProductAppendImagesProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
