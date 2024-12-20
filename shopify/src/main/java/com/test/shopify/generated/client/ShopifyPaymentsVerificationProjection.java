package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsVerificationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsVerificationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsVerification"));
  }

  public ShopifyPaymentsVerificationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsVerificationStatusProjection<ShopifyPaymentsVerificationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsVerificationStatusProjection<ShopifyPaymentsVerificationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsVerificationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsVerificationSubjectProjection<ShopifyPaymentsVerificationProjection<PARENT, ROOT>, ROOT> subject(
      ) {
     ShopifyPaymentsVerificationSubjectProjection<ShopifyPaymentsVerificationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsVerificationSubjectProjection<>(this, getRoot());
     getFields().put("subject", projection);
     return projection;
  }

  public ShopifyPaymentsVerificationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
