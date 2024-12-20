package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingOrderSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingOrderSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingOrderSummary"));
  }

  public CheckoutBrandingOrderSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> backgroundImage(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("backgroundImage", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }
}