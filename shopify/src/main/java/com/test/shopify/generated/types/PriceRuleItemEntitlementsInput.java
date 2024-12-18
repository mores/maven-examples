package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a price rule line item entitlement.
 */
public class PriceRuleItemEntitlementsInput {
  /**
   * Whether the price rule applies to all items.
   */
  private Boolean targetAllLineItems = false;

  /**
   * The products to which the price rule applies.
   */
  private List<String> productIds;

  /**
   * The product variants to which the price rule applies.
   */
  private List<String> productVariantIds;

  /**
   * The collections to which the price rule applies.
   */
  private List<String> collectionIds;

  public PriceRuleItemEntitlementsInput() {
  }

  /**
   * Whether the price rule applies to all items.
   */
  public Boolean getTargetAllLineItems() {
    return targetAllLineItems;
  }

  public void setTargetAllLineItems(Boolean targetAllLineItems) {
    this.targetAllLineItems = targetAllLineItems;
  }

  /**
   * The products to which the price rule applies.
   */
  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  /**
   * The product variants to which the price rule applies.
   */
  public List<String> getProductVariantIds() {
    return productVariantIds;
  }

  public void setProductVariantIds(List<String> productVariantIds) {
    this.productVariantIds = productVariantIds;
  }

  /**
   * The collections to which the price rule applies.
   */
  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
  }

  @Override
  public String toString() {
    return "PriceRuleItemEntitlementsInput{targetAllLineItems='" + targetAllLineItems + "', productIds='" + productIds + "', productVariantIds='" + productVariantIds + "', collectionIds='" + collectionIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleItemEntitlementsInput that = (PriceRuleItemEntitlementsInput) o;
    return Objects.equals(targetAllLineItems, that.targetAllLineItems) &&
        Objects.equals(productIds, that.productIds) &&
        Objects.equals(productVariantIds, that.productVariantIds) &&
        Objects.equals(collectionIds, that.collectionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAllLineItems, productIds, productVariantIds, collectionIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the price rule applies to all items.
     */
    private Boolean targetAllLineItems = false;

    /**
     * The products to which the price rule applies.
     */
    private List<String> productIds;

    /**
     * The product variants to which the price rule applies.
     */
    private List<String> productVariantIds;

    /**
     * The collections to which the price rule applies.
     */
    private List<String> collectionIds;

    public PriceRuleItemEntitlementsInput build() {
      PriceRuleItemEntitlementsInput result = new PriceRuleItemEntitlementsInput();
      result.targetAllLineItems = this.targetAllLineItems;
      result.productIds = this.productIds;
      result.productVariantIds = this.productVariantIds;
      result.collectionIds = this.collectionIds;
      return result;
    }

    /**
     * Whether the price rule applies to all items.
     */
    public Builder targetAllLineItems(Boolean targetAllLineItems) {
      this.targetAllLineItems = targetAllLineItems;
      return this;
    }

    /**
     * The products to which the price rule applies.
     */
    public Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      return this;
    }

    /**
     * The product variants to which the price rule applies.
     */
    public Builder productVariantIds(List<String> productVariantIds) {
      this.productVariantIds = productVariantIds;
      return this;
    }

    /**
     * The collections to which the price rule applies.
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }
  }
}
