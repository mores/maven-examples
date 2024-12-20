package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateAsyncProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateAsyncProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDuplicateAsyncPayload"));
  }

  public ProductDuplicateAsyncProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public ProductDuplicateUserErrorProjection<ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductDuplicateUserErrorProjection<ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>, ProductDuplicateAsyncProjectionRoot<PARENT, ROOT>> projection = new ProductDuplicateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDuplicateAsyncProjectionRoot<PARENT, ROOT> duplicatedProductId() {
    getFields().put("duplicatedProductId", null);
    return this;
  }
}
