package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingVisibilityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingVisibilityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingVisibility"));
  }

  public CheckoutBrandingVisibilityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
