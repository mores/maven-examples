package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateAsyncV2ProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateAsyncV2ProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDuplicateAsyncV2Payload"));
  }

  public ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductDuplicateUserErrorProjection<ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductDuplicateUserErrorProjection<ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT>> projection = new ProductDuplicateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT> duplicatedProductId() {
    getFields().put("duplicatedProductId", null);
    return this;
  }

  public ProductDuplicateAsyncV2ProjectionRoot<PARENT, ROOT> productDuplicateJobId() {
    getFields().put("productDuplicateJobId", null);
    return this;
  }
}
