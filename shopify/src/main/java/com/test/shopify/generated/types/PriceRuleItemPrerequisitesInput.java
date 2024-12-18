package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a price rule's item prerequisites.
 */
public class PriceRuleItemPrerequisitesInput {
  /**
   * The products needed for the price rule to be applied.
   */
  private List<String> productIds;

  /**
   * The product variants needed for the price rule to be applied.
   */
  private List<String> productVariantIds;

  /**
   * The collections needed for the price rule to be applied.
   */
  private List<String> collectionIds;

  public PriceRuleItemPrerequisitesInput() {
  }

  /**
   * The products needed for the price rule to be applied.
   */
  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  /**
   * The product variants needed for the price rule to be applied.
   */
  public List<String> getProductVariantIds() {
    return productVariantIds;
  }

  public void setProductVariantIds(List<String> productVariantIds) {
    this.productVariantIds = productVariantIds;
  }

  /**
   * The collections needed for the price rule to be applied.
   */
  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(List<String> collectionIds) {
    this.collectionIds = collectionIds;
  }

  @Override
  public String toString() {
    return "PriceRuleItemPrerequisitesInput{productIds='" + productIds + "', productVariantIds='" + productVariantIds + "', collectionIds='" + collectionIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleItemPrerequisitesInput that = (PriceRuleItemPrerequisitesInput) o;
    return Objects.equals(productIds, that.productIds) &&
        Objects.equals(productVariantIds, that.productVariantIds) &&
        Objects.equals(collectionIds, that.collectionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds, productVariantIds, collectionIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The products needed for the price rule to be applied.
     */
    private List<String> productIds;

    /**
     * The product variants needed for the price rule to be applied.
     */
    private List<String> productVariantIds;

    /**
     * The collections needed for the price rule to be applied.
     */
    private List<String> collectionIds;

    public PriceRuleItemPrerequisitesInput build() {
      PriceRuleItemPrerequisitesInput result = new PriceRuleItemPrerequisitesInput();
      result.productIds = this.productIds;
      result.productVariantIds = this.productVariantIds;
      result.collectionIds = this.collectionIds;
      return result;
    }

    /**
     * The products needed for the price rule to be applied.
     */
    public Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      return this;
    }

    /**
     * The product variants needed for the price rule to be applied.
     */
    public Builder productVariantIds(List<String> productVariantIds) {
      this.productVariantIds = productVariantIds;
      return this;
    }

    /**
     * The collections needed for the price rule to be applied.
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }
  }
}
