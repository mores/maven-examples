package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantCreatePayload"));
  }

  public ProductVariantCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> productVariant(
      ) {
    ProductVariantProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariant", projection);
    return projection;
  }

  public UserErrorProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductVariantCreateProjectionRoot<PARENT, ROOT>, ProductVariantCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
