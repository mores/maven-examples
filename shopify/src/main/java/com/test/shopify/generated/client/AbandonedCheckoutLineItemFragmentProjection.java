package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AbandonedCheckoutLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AbandonedCheckoutLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItem"));
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalPriceWithCodeDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceWithCodeDiscount(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceWithCodeDiscount", projection);
     return projection;
  }

  public ImageProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductVariantProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AbandonedCheckoutLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AbandonedCheckoutLineItem {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
