package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a line item included in a draft order.
 */
public class DraftOrderLineItemInput {
  /**
   * The custom discount to be applied.
   */
  private DraftOrderAppliedDiscountInput appliedDiscount;

  /**
   * A generic custom attribute using a key value pair.
   */
  private List<AttributeInput> customAttributes;

  /**
   * The custom line item price without any discounts applied in shop currency.
   * This field is ignored when `variantId` is provided.
   */
  private String originalUnitPrice;

  /**
   * The line item quantity.
   */
  private int quantity;

  /**
   * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
   */
  private Boolean requiresShipping;

  /**
   * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
   */
  private String sku;

  /**
   * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
   */
  private Boolean taxable;

  /**
   * Title of the line item. This field is ignored when `variantId` is provided.
   */
  private String title;

  /**
   * The ID of the product variant corresponding to the line item.
   * Must be null for custom line items, otherwise required.
   */
  private String variantId;

  /**
   * The weight unit and value inputs for custom line items only.
   * This field is ignored when `variantId` is provided.
   */
  private WeightInput weight;

  public DraftOrderLineItemInput() {
  }

  /**
   * The custom discount to be applied.
   */
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * A generic custom attribute using a key value pair.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The custom line item price without any discounts applied in shop currency.
   * This field is ignored when `variantId` is provided.
   */
  public String getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(String originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   * The line item quantity.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
   */
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
   */
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * Title of the line item. This field is ignored when `variantId` is provided.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The ID of the product variant corresponding to the line item.
   * Must be null for custom line items, otherwise required.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The weight unit and value inputs for custom line items only.
   * This field is ignored when `variantId` is provided.
   */
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "DraftOrderLineItemInput{appliedDiscount='" + appliedDiscount + "', customAttributes='" + customAttributes + "', originalUnitPrice='" + originalUnitPrice + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderLineItemInput that = (DraftOrderLineItemInput) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, customAttributes, originalUnitPrice, quantity, requiresShipping, sku, taxable, title, variantId, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The custom discount to be applied.
     */
    private DraftOrderAppliedDiscountInput appliedDiscount;

    /**
     * A generic custom attribute using a key value pair.
     */
    private List<AttributeInput> customAttributes;

    /**
     * The custom line item price without any discounts applied in shop currency.
     * This field is ignored when `variantId` is provided.
     */
    private String originalUnitPrice;

    /**
     * The line item quantity.
     */
    private int quantity;

    /**
     * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
     */
    private Boolean requiresShipping;

    /**
     * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
     */
    private String sku;

    /**
     * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
     */
    private Boolean taxable;

    /**
     * Title of the line item. This field is ignored when `variantId` is provided.
     */
    private String title;

    /**
     * The ID of the product variant corresponding to the line item.
     * Must be null for custom line items, otherwise required.
     */
    private String variantId;

    /**
     * The weight unit and value inputs for custom line items only.
     * This field is ignored when `variantId` is provided.
     */
    private WeightInput weight;

    public DraftOrderLineItemInput build() {
      DraftOrderLineItemInput result = new DraftOrderLineItemInput();
      result.appliedDiscount = this.appliedDiscount;
      result.customAttributes = this.customAttributes;
      result.originalUnitPrice = this.originalUnitPrice;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.weight = this.weight;
      return result;
    }

    /**
     * The custom discount to be applied.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * A generic custom attribute using a key value pair.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The custom line item price without any discounts applied in shop currency.
     * This field is ignored when `variantId` is provided.
     */
    public Builder originalUnitPrice(String originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    /**
     * The line item quantity.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Whether physical shipping is required for a custom line item. This field is ignored when `variantId` is provided.
     */
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The SKU number for custom line items only. This field is ignored when `variantId` is provided.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * Whether the custom line item is taxable. This field is ignored when `variantId` is provided.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * Title of the line item. This field is ignored when `variantId` is provided.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The ID of the product variant corresponding to the line item.
     * Must be null for custom line items, otherwise required.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The weight unit and value inputs for custom line items only.
     * This field is ignored when `variantId` is provided.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }
  }
}
