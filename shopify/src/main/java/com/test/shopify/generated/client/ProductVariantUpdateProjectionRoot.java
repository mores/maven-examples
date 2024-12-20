package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantUpdatePayload"));
  }

  public ProductVariantUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> productVariant(
      ) {
    ProductVariantProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariant", projection);
    return projection;
  }

  public UserErrorProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductVariantUpdateProjectionRoot<PARENT, ROOT>, ProductVariantUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
