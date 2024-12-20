package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsVerificationDocumentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsVerificationDocumentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsVerificationDocument"));
  }

  public ShopifyPaymentsVerificationDocumentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsVerificationDocumentTypeProjection<ShopifyPaymentsVerificationDocumentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ShopifyPaymentsVerificationDocumentTypeProjection<ShopifyPaymentsVerificationDocumentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsVerificationDocumentTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyPaymentsVerificationDocumentProjection<PARENT, ROOT> backRequired() {
    getFields().put("backRequired", null);
    return this;
  }

  public ShopifyPaymentsVerificationDocumentProjection<PARENT, ROOT> frontRequired() {
    getFields().put("frontRequired", null);
    return this;
  }
}
