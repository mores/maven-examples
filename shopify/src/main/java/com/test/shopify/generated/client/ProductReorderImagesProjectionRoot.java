package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductReorderImagesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductReorderImagesProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductReorderImagesPayload"));
  }

  public ProductReorderImagesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ProductReorderImagesProjectionRoot<PARENT, ROOT>, ProductReorderImagesProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<ProductReorderImagesProjectionRoot<PARENT, ROOT>, ProductReorderImagesProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<ProductReorderImagesProjectionRoot<PARENT, ROOT>, ProductReorderImagesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductReorderImagesProjectionRoot<PARENT, ROOT>, ProductReorderImagesProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
