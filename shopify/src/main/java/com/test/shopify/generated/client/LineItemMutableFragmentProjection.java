package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class LineItemMutableFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public LineItemMutableFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemMutable"));
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> originalTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public StaffMemberProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public TaxLineProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public TaxLineProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> taxLines(
      Integer first) {
    TaxLineProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());    
    getFields().put("taxLines", projection);
    getInputArguments().computeIfAbsent("taxLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("taxLines").add(firstArg);
    return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> unfulfilledDiscountedTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledDiscountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> unfulfilledOriginalTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledOriginalTotalSet", projection);
     return projection;
  }

  public ProductVariantProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<LineItemMutableFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> canRestock() {
    getFields().put("canRestock", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> fulfillableQuantity() {
    getFields().put("fulfillableQuantity", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> fulfillmentStatus() {
    getFields().put("fulfillmentStatus", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> nonFulfillableQuantity() {
    getFields().put("nonFulfillableQuantity", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> unfulfilledDiscountedTotal() {
    getFields().put("unfulfilledDiscountedTotal", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> unfulfilledOriginalTotal() {
    getFields().put("unfulfilledOriginalTotal", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> unfulfilledQuantity() {
    getFields().put("unfulfilledQuantity", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public LineItemMutableFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on LineItemMutable {");
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
