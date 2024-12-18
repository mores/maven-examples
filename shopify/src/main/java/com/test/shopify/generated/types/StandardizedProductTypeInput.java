package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides the fields and values to use when adding a standard product type to a
 * product. The [Shopify product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
 * contains the full list of available values.
 */
public class StandardizedProductTypeInput {
  /**
   * The ID of the node in the Shopify taxonomy that represents the product type.
   */
  private String productTaxonomyNodeId;

  public StandardizedProductTypeInput() {
  }

  /**
   * The ID of the node in the Shopify taxonomy that represents the product type.
   */
  public String getProductTaxonomyNodeId() {
    return productTaxonomyNodeId;
  }

  public void setProductTaxonomyNodeId(String productTaxonomyNodeId) {
    this.productTaxonomyNodeId = productTaxonomyNodeId;
  }

  @Override
  public String toString() {
    return "StandardizedProductTypeInput{productTaxonomyNodeId='" + productTaxonomyNodeId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardizedProductTypeInput that = (StandardizedProductTypeInput) o;
    return Objects.equals(productTaxonomyNodeId, that.productTaxonomyNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTaxonomyNodeId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the node in the Shopify taxonomy that represents the product type.
     */
    private String productTaxonomyNodeId;

    public StandardizedProductTypeInput build() {
      StandardizedProductTypeInput result = new StandardizedProductTypeInput();
      result.productTaxonomyNodeId = this.productTaxonomyNodeId;
      return result;
    }

    /**
     * The ID of the node in the Shopify taxonomy that represents the product type.
     */
    public Builder productTaxonomyNodeId(String productTaxonomyNodeId) {
      this.productTaxonomyNodeId = productTaxonomyNodeId;
      return this;
    }
  }
}
