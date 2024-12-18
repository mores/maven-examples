package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantDelete` mutation.
 */
public class ProductVariantDeletePayload {
  /**
   * The ID of the deleted product variant.
   */
  private String deletedProductVariantId;

  /**
   * The product associated with the deleted product variant.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductVariantDeletePayload() {
  }

  /**
   * The ID of the deleted product variant.
   */
  public String getDeletedProductVariantId() {
    return deletedProductVariantId;
  }

  public void setDeletedProductVariantId(String deletedProductVariantId) {
    this.deletedProductVariantId = deletedProductVariantId;
  }

  /**
   * The product associated with the deleted product variant.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantDeletePayload{deletedProductVariantId='" + deletedProductVariantId + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantDeletePayload that = (ProductVariantDeletePayload) o;
    return Objects.equals(deletedProductVariantId, that.deletedProductVariantId) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedProductVariantId, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted product variant.
     */
    private String deletedProductVariantId;

    /**
     * The product associated with the deleted product variant.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductVariantDeletePayload build() {
      ProductVariantDeletePayload result = new ProductVariantDeletePayload();
      result.deletedProductVariantId = this.deletedProductVariantId;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted product variant.
     */
    public Builder deletedProductVariantId(String deletedProductVariantId) {
      this.deletedProductVariantId = deletedProductVariantId;
      return this;
    }

    /**
     * The product associated with the deleted product variant.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
