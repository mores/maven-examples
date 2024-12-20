package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDeleteAsyncProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDeleteAsyncProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDeleteAsyncPayload"));
  }

  public ProductDeleteAsyncProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ProductDeleteAsyncProjectionRoot<PARENT, ROOT>, ProductDeleteAsyncProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<ProductDeleteAsyncProjectionRoot<PARENT, ROOT>, ProductDeleteAsyncProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public ProductDeleteUserErrorProjection<ProductDeleteAsyncProjectionRoot<PARENT, ROOT>, ProductDeleteAsyncProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductDeleteUserErrorProjection<ProductDeleteAsyncProjectionRoot<PARENT, ROOT>, ProductDeleteAsyncProjectionRoot<PARENT, ROOT>> projection = new ProductDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDeleteAsyncProjectionRoot<PARENT, ROOT> deleteProductId() {
    getFields().put("deleteProductId", null);
    return this;
  }
}
