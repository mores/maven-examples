package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantDeletePayload"));
  }

  public ProductVariantDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantDeleteProjectionRoot<PARENT, ROOT>, ProductVariantDeleteProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantDeleteProjectionRoot<PARENT, ROOT>, ProductVariantDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductVariantDeleteProjectionRoot<PARENT, ROOT>, ProductVariantDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductVariantDeleteProjectionRoot<PARENT, ROOT>, ProductVariantDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductVariantDeleteProjectionRoot<PARENT, ROOT> deletedProductVariantId() {
    getFields().put("deletedProductVariantId", null);
    return this;
  }
}
