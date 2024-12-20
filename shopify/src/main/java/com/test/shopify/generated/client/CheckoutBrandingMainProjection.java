package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMain"));
  }

  public CheckoutBrandingMainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> backgroundImage(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("backgroundImage", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }
}
