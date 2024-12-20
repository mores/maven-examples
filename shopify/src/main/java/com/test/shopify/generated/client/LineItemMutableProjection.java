package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.util.ArrayList;

public class LineItemMutableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemMutableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemMutable"));
  }

  public LineItemMutableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> discountedTotalSet() {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet() {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public StaffMemberProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public TaxLineProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public TaxLineProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> taxLines(Integer first) {
    TaxLineProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());    
    getFields().put("taxLines", projection);
    getInputArguments().computeIfAbsent("taxLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("taxLines").add(firstArg);
    return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> totalDiscountSet() {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> unfulfilledDiscountedTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledDiscountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> unfulfilledOriginalTotalSet(
      ) {
     MoneyBagProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledOriginalTotalSet", projection);
     return projection;
  }

  public ProductVariantProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<LineItemMutableProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public LineItemMutableProjection<PARENT, ROOT> canRestock() {
    getFields().put("canRestock", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> fulfillableQuantity() {
    getFields().put("fulfillableQuantity", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> fulfillmentStatus() {
    getFields().put("fulfillmentStatus", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> nonFulfillableQuantity() {
    getFields().put("nonFulfillableQuantity", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> unfulfilledDiscountedTotal() {
    getFields().put("unfulfilledDiscountedTotal", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> unfulfilledOriginalTotal() {
    getFields().put("unfulfilledOriginalTotal", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> unfulfilledQuantity() {
    getFields().put("unfulfilledQuantity", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public LineItemMutableProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
