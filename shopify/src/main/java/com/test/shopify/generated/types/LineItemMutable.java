package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a single line item on an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItemMutable implements com.test.shopify.generated.types.Node {
  /**
   * Whether the line item can be restocked.
   */
  private boolean canRestock;

  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  private List<DiscountAllocation> discountAllocations;

  /**
   * The total line price after discounts are applied, in shop currency.
   */
  private String discountedTotal;

  /**
   * The total line price after discounts are applied, in shop and presentment currencies.
   */
  private MoneyBag discountedTotalSet;

  /**
   * The approximate split price of a line item unit, in shop currency. This value
   * doesn't include discounts applied to the entire order.
   */
  private String discountedUnitPrice;

  /**
   * The approximate split price of a line item unit, in shop and presentment
   * currencies. This value doesn't include discounts applied to the entire order.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * The total number of units to fulfill.
   */
  private int fulfillableQuantity;

  /**
   * The service provider that fulfills the line item.
   *   
   * Deleted fulfillment services will return null.
   */
  private FulfillmentService fulfillmentService;

  /**
   * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
   * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
   */
  private String fulfillmentStatus;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated to the line item's variant.
   */
  private Image image;

  /**
   * Whether the line item can be edited or not.
   */
  private boolean merchantEditable;

  /**
   * The name of the product.
   */
  private String name;

  /**
   * The total number of units that can't be fulfilled. For example, if items have
   * been refunded, or the item isn't something that can be fulfilled, like a tip.
   */
  private int nonFulfillableQuantity;

  /**
   * The total price without any discounts applied, in shop currency. ""This value
   * is based on the unit price of the variant x quantity.
   */
  private String originalTotal;

  /**
   * The total price in shop and presentment currencies, without discounts applied.
   * This value is based on the unit price of the variant x quantity.
   */
  private MoneyBag originalTotalSet;

  /**
   * The variant unit price without discounts applied, in shop currency.
   */
  private String originalUnitPrice;

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The Product object associated with this line item's variant.
   */
  private Product product;

  /**
   * The number of variant units ordered.
   */
  private int quantity;

  /**
   * The line item's quantity, minus the refunded quantity.
   */
  private int refundableQuantity;

  /**
   * Whether physical shipping is required for the variant.
   */
  private boolean requiresShipping;

  /**
   * Whether the line item can be restocked.
   */
  private boolean restockable;

  /**
   * The variant SKU number.
   */
  private String sku;

  /**
   * Staff attributed to the line item.
   */
  private StaffMember staffMember;

  /**
   * The TaxLine object connected to this line item.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether the variant is taxable.
   */
  private boolean taxable;

  /**
   * The title of the product.
   */
  private String title;

  /**
   * The total amount of the discount allocated to the line item in the shop
   * currency. This field must be explicitly set using draft orders, Shopify
   * scripts, or the API. Instead of using this field, Shopify recommends using
   * `discountAllocations`, which provides the same information.
   */
  private String totalDiscount;

  /**
   * The total amount of the discount allocated to the line item in the presentment
   * currency. This field must be explicitly set using draft orders, Shopify
   * scripts, or the API. Instead of using this field, Shopify recommends using
   * `discountAllocations`, which provides the same information.
   */
  private MoneyBag totalDiscountSet;

  /**
   * The total discounted value of unfulfilled units, in shop currency.
   */
  private String unfulfilledDiscountedTotal;

  /**
   * The total discounted value of unfulfilled units, in shop and presentment currencies.
   */
  private MoneyBag unfulfilledDiscountedTotalSet;

  /**
   * The total price without any discounts applied. This value is based on the unit
   * price of the variant x quantity of all unfulfilled units, in shop currency.
   */
  private String unfulfilledOriginalTotal;

  /**
   * The total price without any discounts applied. This value is based on the unit
   * price of the variant x quantity of all unfulfilled units, in shop and
   * presentment currencies.
   */
  private MoneyBag unfulfilledOriginalTotalSet;

  /**
   * The number of units not yet fulfilled.
   */
  private int unfulfilledQuantity;

  /**
   * The Variant object associated with this line item.
   */
  private ProductVariant variant;

  /**
   * The name of the variant.
   */
  private String variantTitle;

  /**
   * The name of the vendor who made the variant.
   */
  private String vendor;

  public LineItemMutable() {
  }

  /**
   * Whether the line item can be restocked.
   */
  public boolean getCanRestock() {
    return canRestock;
  }

  public void setCanRestock(boolean canRestock) {
    this.canRestock = canRestock;
  }

  /**
   * A list of attributes that represent custom features or special requests.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The total line price after discounts are applied, in shop currency.
   */
  public String getDiscountedTotal() {
    return discountedTotal;
  }

  public void setDiscountedTotal(String discountedTotal) {
    this.discountedTotal = discountedTotal;
  }

  /**
   * The total line price after discounts are applied, in shop and presentment currencies.
   */
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  /**
   * The approximate split price of a line item unit, in shop currency. This value
   * doesn't include discounts applied to the entire order.
   */
  public String getDiscountedUnitPrice() {
    return discountedUnitPrice;
  }

  public void setDiscountedUnitPrice(String discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
  }

  /**
   * The approximate split price of a line item unit, in shop and presentment
   * currencies. This value doesn't include discounts applied to the entire order.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * The total number of units to fulfill.
   */
  public int getFulfillableQuantity() {
    return fulfillableQuantity;
  }

  public void setFulfillableQuantity(int fulfillableQuantity) {
    this.fulfillableQuantity = fulfillableQuantity;
  }

  /**
   * The service provider that fulfills the line item.
   *   
   * Deleted fulfillment services will return null.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
   * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
   */
  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The image associated to the line item's variant.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Whether the line item can be edited or not.
   */
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  /**
   * The name of the product.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The total number of units that can't be fulfilled. For example, if items have
   * been refunded, or the item isn't something that can be fulfilled, like a tip.
   */
  public int getNonFulfillableQuantity() {
    return nonFulfillableQuantity;
  }

  public void setNonFulfillableQuantity(int nonFulfillableQuantity) {
    this.nonFulfillableQuantity = nonFulfillableQuantity;
  }

  /**
   * The total price without any discounts applied, in shop currency. ""This value
   * is based on the unit price of the variant x quantity.
   */
  public String getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(String originalTotal) {
    this.originalTotal = originalTotal;
  }

  /**
   * The total price in shop and presentment currencies, without discounts applied.
   * This value is based on the unit price of the variant x quantity.
   */
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  /**
   * The variant unit price without discounts applied, in shop currency.
   */
  public String getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(String originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The Product object associated with this line item's variant.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The number of variant units ordered.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The line item's quantity, minus the refunded quantity.
   */
  public int getRefundableQuantity() {
    return refundableQuantity;
  }

  public void setRefundableQuantity(int refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
  }

  /**
   * Whether physical shipping is required for the variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Whether the line item can be restocked.
   */
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  /**
   * The variant SKU number.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Staff attributed to the line item.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The TaxLine object connected to this line item.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether the variant is taxable.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The title of the product.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total amount of the discount allocated to the line item in the shop
   * currency. This field must be explicitly set using draft orders, Shopify
   * scripts, or the API. Instead of using this field, Shopify recommends using
   * `discountAllocations`, which provides the same information.
   */
  public String getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(String totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  /**
   * The total amount of the discount allocated to the line item in the presentment
   * currency. This field must be explicitly set using draft orders, Shopify
   * scripts, or the API. Instead of using this field, Shopify recommends using
   * `discountAllocations`, which provides the same information.
   */
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
  }

  /**
   * The total discounted value of unfulfilled units, in shop currency.
   */
  public String getUnfulfilledDiscountedTotal() {
    return unfulfilledDiscountedTotal;
  }

  public void setUnfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
    this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
  }

  /**
   * The total discounted value of unfulfilled units, in shop and presentment currencies.
   */
  public MoneyBag getUnfulfilledDiscountedTotalSet() {
    return unfulfilledDiscountedTotalSet;
  }

  public void setUnfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
    this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
  }

  /**
   * The total price without any discounts applied. This value is based on the unit
   * price of the variant x quantity of all unfulfilled units, in shop currency.
   */
  public String getUnfulfilledOriginalTotal() {
    return unfulfilledOriginalTotal;
  }

  public void setUnfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
    this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
  }

  /**
   * The total price without any discounts applied. This value is based on the unit
   * price of the variant x quantity of all unfulfilled units, in shop and
   * presentment currencies.
   */
  public MoneyBag getUnfulfilledOriginalTotalSet() {
    return unfulfilledOriginalTotalSet;
  }

  public void setUnfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
    this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
  }

  /**
   * The number of units not yet fulfilled.
   */
  public int getUnfulfilledQuantity() {
    return unfulfilledQuantity;
  }

  public void setUnfulfilledQuantity(int unfulfilledQuantity) {
    this.unfulfilledQuantity = unfulfilledQuantity;
  }

  /**
   * The Variant object associated with this line item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  /**
   * The name of the variant.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The name of the vendor who made the variant.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public String toString() {
    return "LineItemMutable{canRestock='" + canRestock + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPrice='" + discountedUnitPrice + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', fulfillableQuantity='" + fulfillableQuantity + "', fulfillmentService='" + fulfillmentService + "', fulfillmentStatus='" + fulfillmentStatus + "', id='" + id + "', image='" + image + "', merchantEditable='" + merchantEditable + "', name='" + name + "', nonFulfillableQuantity='" + nonFulfillableQuantity + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', originalUnitPrice='" + originalUnitPrice + "', originalUnitPriceSet='" + originalUnitPriceSet + "', product='" + product + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', sku='" + sku + "', staffMember='" + staffMember + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', totalDiscount='" + totalDiscount + "', totalDiscountSet='" + totalDiscountSet + "', unfulfilledDiscountedTotal='" + unfulfilledDiscountedTotal + "', unfulfilledDiscountedTotalSet='" + unfulfilledDiscountedTotalSet + "', unfulfilledOriginalTotal='" + unfulfilledOriginalTotal + "', unfulfilledOriginalTotalSet='" + unfulfilledOriginalTotalSet + "', unfulfilledQuantity='" + unfulfilledQuantity + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItemMutable that = (LineItemMutable) o;
    return canRestock == that.canRestock &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPrice, that.discountedUnitPrice) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        fulfillableQuantity == that.fulfillableQuantity &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(fulfillmentStatus, that.fulfillmentStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        merchantEditable == that.merchantEditable &&
        Objects.equals(name, that.name) &&
        nonFulfillableQuantity == that.nonFulfillableQuantity &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        requiresShipping == that.requiresShipping &&
        restockable == that.restockable &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalDiscount, that.totalDiscount) &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(unfulfilledDiscountedTotal, that.unfulfilledDiscountedTotal) &&
        Objects.equals(unfulfilledDiscountedTotalSet, that.unfulfilledDiscountedTotalSet) &&
        Objects.equals(unfulfilledOriginalTotal, that.unfulfilledOriginalTotal) &&
        Objects.equals(unfulfilledOriginalTotalSet, that.unfulfilledOriginalTotalSet) &&
        unfulfilledQuantity == that.unfulfilledQuantity &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRestock, customAttributes, discountAllocations, discountedTotal, discountedTotalSet, discountedUnitPrice, discountedUnitPriceSet, fulfillableQuantity, fulfillmentService, fulfillmentStatus, id, image, merchantEditable, name, nonFulfillableQuantity, originalTotal, originalTotalSet, originalUnitPrice, originalUnitPriceSet, product, quantity, refundableQuantity, requiresShipping, restockable, sku, staffMember, taxLines, taxable, title, totalDiscount, totalDiscountSet, unfulfilledDiscountedTotal, unfulfilledDiscountedTotalSet, unfulfilledOriginalTotal, unfulfilledOriginalTotalSet, unfulfilledQuantity, variant, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the line item can be restocked.
     */
    private boolean canRestock;

    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    private List<DiscountAllocation> discountAllocations;

    /**
     * The total line price after discounts are applied, in shop currency.
     */
    private String discountedTotal;

    /**
     * The total line price after discounts are applied, in shop and presentment currencies.
     */
    private MoneyBag discountedTotalSet;

    /**
     * The approximate split price of a line item unit, in shop currency. This value
     * doesn't include discounts applied to the entire order.
     */
    private String discountedUnitPrice;

    /**
     * The approximate split price of a line item unit, in shop and presentment
     * currencies. This value doesn't include discounts applied to the entire order.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * The total number of units to fulfill.
     */
    private int fulfillableQuantity;

    /**
     * The service provider that fulfills the line item.
     *   
     * Deleted fulfillment services will return null.
     */
    private FulfillmentService fulfillmentService;

    /**
     * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
     * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
     */
    private String fulfillmentStatus;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated to the line item's variant.
     */
    private Image image;

    /**
     * Whether the line item can be edited or not.
     */
    private boolean merchantEditable;

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The total number of units that can't be fulfilled. For example, if items have
     * been refunded, or the item isn't something that can be fulfilled, like a tip.
     */
    private int nonFulfillableQuantity;

    /**
     * The total price without any discounts applied, in shop currency. ""This value
     * is based on the unit price of the variant x quantity.
     */
    private String originalTotal;

    /**
     * The total price in shop and presentment currencies, without discounts applied.
     * This value is based on the unit price of the variant x quantity.
     */
    private MoneyBag originalTotalSet;

    /**
     * The variant unit price without discounts applied, in shop currency.
     */
    private String originalUnitPrice;

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The Product object associated with this line item's variant.
     */
    private Product product;

    /**
     * The number of variant units ordered.
     */
    private int quantity;

    /**
     * The line item's quantity, minus the refunded quantity.
     */
    private int refundableQuantity;

    /**
     * Whether physical shipping is required for the variant.
     */
    private boolean requiresShipping;

    /**
     * Whether the line item can be restocked.
     */
    private boolean restockable;

    /**
     * The variant SKU number.
     */
    private String sku;

    /**
     * Staff attributed to the line item.
     */
    private StaffMember staffMember;

    /**
     * The TaxLine object connected to this line item.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether the variant is taxable.
     */
    private boolean taxable;

    /**
     * The title of the product.
     */
    private String title;

    /**
     * The total amount of the discount allocated to the line item in the shop
     * currency. This field must be explicitly set using draft orders, Shopify
     * scripts, or the API. Instead of using this field, Shopify recommends using
     * `discountAllocations`, which provides the same information.
     */
    private String totalDiscount;

    /**
     * The total amount of the discount allocated to the line item in the presentment
     * currency. This field must be explicitly set using draft orders, Shopify
     * scripts, or the API. Instead of using this field, Shopify recommends using
     * `discountAllocations`, which provides the same information.
     */
    private MoneyBag totalDiscountSet;

    /**
     * The total discounted value of unfulfilled units, in shop currency.
     */
    private String unfulfilledDiscountedTotal;

    /**
     * The total discounted value of unfulfilled units, in shop and presentment currencies.
     */
    private MoneyBag unfulfilledDiscountedTotalSet;

    /**
     * The total price without any discounts applied. This value is based on the unit
     * price of the variant x quantity of all unfulfilled units, in shop currency.
     */
    private String unfulfilledOriginalTotal;

    /**
     * The total price without any discounts applied. This value is based on the unit
     * price of the variant x quantity of all unfulfilled units, in shop and
     * presentment currencies.
     */
    private MoneyBag unfulfilledOriginalTotalSet;

    /**
     * The number of units not yet fulfilled.
     */
    private int unfulfilledQuantity;

    /**
     * The Variant object associated with this line item.
     */
    private ProductVariant variant;

    /**
     * The name of the variant.
     */
    private String variantTitle;

    /**
     * The name of the vendor who made the variant.
     */
    private String vendor;

    public LineItemMutable build() {
      LineItemMutable result = new LineItemMutable();
      result.canRestock = this.canRestock;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPrice = this.discountedUnitPrice;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.fulfillableQuantity = this.fulfillableQuantity;
      result.fulfillmentService = this.fulfillmentService;
      result.fulfillmentStatus = this.fulfillmentStatus;
      result.id = this.id;
      result.image = this.image;
      result.merchantEditable = this.merchantEditable;
      result.name = this.name;
      result.nonFulfillableQuantity = this.nonFulfillableQuantity;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPrice = this.originalUnitPrice;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.product = this.product;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.requiresShipping = this.requiresShipping;
      result.restockable = this.restockable;
      result.sku = this.sku;
      result.staffMember = this.staffMember;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.totalDiscount = this.totalDiscount;
      result.totalDiscountSet = this.totalDiscountSet;
      result.unfulfilledDiscountedTotal = this.unfulfilledDiscountedTotal;
      result.unfulfilledDiscountedTotalSet = this.unfulfilledDiscountedTotalSet;
      result.unfulfilledOriginalTotal = this.unfulfilledOriginalTotal;
      result.unfulfilledOriginalTotalSet = this.unfulfilledOriginalTotalSet;
      result.unfulfilledQuantity = this.unfulfilledQuantity;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * Whether the line item can be restocked.
     */
    public Builder canRestock(boolean canRestock) {
      this.canRestock = canRestock;
      return this;
    }

    /**
     * A list of attributes that represent custom features or special requests.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The total line price after discounts are applied, in shop currency.
     */
    public Builder discountedTotal(String discountedTotal) {
      this.discountedTotal = discountedTotal;
      return this;
    }

    /**
     * The total line price after discounts are applied, in shop and presentment currencies.
     */
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    /**
     * The approximate split price of a line item unit, in shop currency. This value
     * doesn't include discounts applied to the entire order.
     */
    public Builder discountedUnitPrice(String discountedUnitPrice) {
      this.discountedUnitPrice = discountedUnitPrice;
      return this;
    }

    /**
     * The approximate split price of a line item unit, in shop and presentment
     * currencies. This value doesn't include discounts applied to the entire order.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * The total number of units to fulfill.
     */
    public Builder fulfillableQuantity(int fulfillableQuantity) {
      this.fulfillableQuantity = fulfillableQuantity;
      return this;
    }

    /**
     * The service provider that fulfills the line item.
     *   
     * Deleted fulfillment services will return null.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * The line item's fulfillment status. Returns 'fulfilled' if fulfillableQuantity >= quantity,
     * 'partial' if  fulfillableQuantity > 0, and 'unfulfilled' otherwise.
     */
    public Builder fulfillmentStatus(String fulfillmentStatus) {
      this.fulfillmentStatus = fulfillmentStatus;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The image associated to the line item's variant.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * Whether the line item can be edited or not.
     */
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    /**
     * The name of the product.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The total number of units that can't be fulfilled. For example, if items have
     * been refunded, or the item isn't something that can be fulfilled, like a tip.
     */
    public Builder nonFulfillableQuantity(int nonFulfillableQuantity) {
      this.nonFulfillableQuantity = nonFulfillableQuantity;
      return this;
    }

    /**
     * The total price without any discounts applied, in shop currency. ""This value
     * is based on the unit price of the variant x quantity.
     */
    public Builder originalTotal(String originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    /**
     * The total price in shop and presentment currencies, without discounts applied.
     * This value is based on the unit price of the variant x quantity.
     */
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    /**
     * The variant unit price without discounts applied, in shop currency.
     */
    public Builder originalUnitPrice(String originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The Product object associated with this line item's variant.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The number of variant units ordered.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The line item's quantity, minus the refunded quantity.
     */
    public Builder refundableQuantity(int refundableQuantity) {
      this.refundableQuantity = refundableQuantity;
      return this;
    }

    /**
     * Whether physical shipping is required for the variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Whether the line item can be restocked.
     */
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    /**
     * The variant SKU number.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Staff attributed to the line item.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The TaxLine object connected to this line item.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether the variant is taxable.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The title of the product.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total amount of the discount allocated to the line item in the shop
     * currency. This field must be explicitly set using draft orders, Shopify
     * scripts, or the API. Instead of using this field, Shopify recommends using
     * `discountAllocations`, which provides the same information.
     */
    public Builder totalDiscount(String totalDiscount) {
      this.totalDiscount = totalDiscount;
      return this;
    }

    /**
     * The total amount of the discount allocated to the line item in the presentment
     * currency. This field must be explicitly set using draft orders, Shopify
     * scripts, or the API. Instead of using this field, Shopify recommends using
     * `discountAllocations`, which provides the same information.
     */
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
      return this;
    }

    /**
     * The total discounted value of unfulfilled units, in shop currency.
     */
    public Builder unfulfilledDiscountedTotal(String unfulfilledDiscountedTotal) {
      this.unfulfilledDiscountedTotal = unfulfilledDiscountedTotal;
      return this;
    }

    /**
     * The total discounted value of unfulfilled units, in shop and presentment currencies.
     */
    public Builder unfulfilledDiscountedTotalSet(MoneyBag unfulfilledDiscountedTotalSet) {
      this.unfulfilledDiscountedTotalSet = unfulfilledDiscountedTotalSet;
      return this;
    }

    /**
     * The total price without any discounts applied. This value is based on the unit
     * price of the variant x quantity of all unfulfilled units, in shop currency.
     */
    public Builder unfulfilledOriginalTotal(String unfulfilledOriginalTotal) {
      this.unfulfilledOriginalTotal = unfulfilledOriginalTotal;
      return this;
    }

    /**
     * The total price without any discounts applied. This value is based on the unit
     * price of the variant x quantity of all unfulfilled units, in shop and
     * presentment currencies.
     */
    public Builder unfulfilledOriginalTotalSet(MoneyBag unfulfilledOriginalTotalSet) {
      this.unfulfilledOriginalTotalSet = unfulfilledOriginalTotalSet;
      return this;
    }

    /**
     * The number of units not yet fulfilled.
     */
    public Builder unfulfilledQuantity(int unfulfilledQuantity) {
      this.unfulfilledQuantity = unfulfilledQuantity;
      return this;
    }

    /**
     * The Variant object associated with this line item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * The name of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The name of the vendor who made the variant.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
