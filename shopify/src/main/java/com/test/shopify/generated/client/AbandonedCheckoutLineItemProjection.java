package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItem"));
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceWithCodeDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceWithCodeDiscount", projection);
     return projection;
  }

  public ImageProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> originalTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<AbandonedCheckoutLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }
}
