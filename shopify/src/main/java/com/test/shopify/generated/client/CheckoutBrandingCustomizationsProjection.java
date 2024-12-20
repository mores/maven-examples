package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingCustomizationsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingCustomizationsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingCustomizations"));
  }

  public CheckoutBrandingCustomizationsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCheckboxProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> checkbox(
      ) {
     CheckoutBrandingCheckboxProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCheckboxProjection<>(this, getRoot());
     getFields().put("checkbox", projection);
     return projection;
  }

  public CheckoutBrandingChoiceListProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> choiceList(
      ) {
     CheckoutBrandingChoiceListProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingChoiceListProjection<>(this, getRoot());
     getFields().put("choiceList", projection);
     return projection;
  }

  public CheckoutBrandingControlProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> control(
      ) {
     CheckoutBrandingControlProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingControlProjection<>(this, getRoot());
     getFields().put("control", projection);
     return projection;
  }

  public CheckoutBrandingImageProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> favicon(
      ) {
     CheckoutBrandingImageProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingImageProjection<>(this, getRoot());
     getFields().put("favicon", projection);
     return projection;
  }

  public CheckoutBrandingGlobalProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> global(
      ) {
     CheckoutBrandingGlobalProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingGlobalProjection<>(this, getRoot());
     getFields().put("global", projection);
     return projection;
  }

  public CheckoutBrandingHeaderProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> header(
      ) {
     CheckoutBrandingHeaderProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeaderProjection<>(this, getRoot());
     getFields().put("header", projection);
     return projection;
  }

  public CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> headingLevel1(
      ) {
     CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel1", projection);
     return projection;
  }

  public CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> headingLevel2(
      ) {
     CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel2", projection);
     return projection;
  }

  public CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> headingLevel3(
      ) {
     CheckoutBrandingHeadingLevelProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingHeadingLevelProjection<>(this, getRoot());
     getFields().put("headingLevel3", projection);
     return projection;
  }

  public CheckoutBrandingMainProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> main(
      ) {
     CheckoutBrandingMainProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingMainProjection<>(this, getRoot());
     getFields().put("main", projection);
     return projection;
  }

  public CheckoutBrandingMerchandiseThumbnailProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> merchandiseThumbnail(
      ) {
     CheckoutBrandingMerchandiseThumbnailProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingMerchandiseThumbnailProjection<>(this, getRoot());
     getFields().put("merchandiseThumbnail", projection);
     return projection;
  }

  public CheckoutBrandingOrderSummaryProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> orderSummary(
      ) {
     CheckoutBrandingOrderSummaryProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingOrderSummaryProjection<>(this, getRoot());
     getFields().put("orderSummary", projection);
     return projection;
  }

  public CheckoutBrandingButtonProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> primaryButton(
      ) {
     CheckoutBrandingButtonProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingButtonProjection<>(this, getRoot());
     getFields().put("primaryButton", projection);
     return projection;
  }

  public CheckoutBrandingButtonProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> secondaryButton(
      ) {
     CheckoutBrandingButtonProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingButtonProjection<>(this, getRoot());
     getFields().put("secondaryButton", projection);
     return projection;
  }

  public CheckoutBrandingSelectProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> select(
      ) {
     CheckoutBrandingSelectProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSelectProjection<>(this, getRoot());
     getFields().put("select", projection);
     return projection;
  }

  public CheckoutBrandingTextFieldProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> textField(
      ) {
     CheckoutBrandingTextFieldProjection<CheckoutBrandingCustomizationsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTextFieldProjection<>(this, getRoot());
     getFields().put("textField", projection);
     return projection;
  }
}
