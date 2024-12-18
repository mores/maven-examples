package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantCreate` mutation.
 */
public class ProductVariantCreatePayload {
  /**
   * The product associated with the variant.
   */
  private Product product;

  /**
   * The successfully created variant.
   */
  private ProductVariant productVariant;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductVariantCreatePayload() {
  }

  /**
   * The product associated with the variant.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The successfully created variant.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
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
    return "ProductVariantCreatePayload{product='" + product + "', productVariant='" + productVariant + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantCreatePayload that = (ProductVariantCreatePayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productVariant, that.productVariant) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productVariant, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product associated with the variant.
     */
    private Product product;

    /**
     * The successfully created variant.
     */
    private ProductVariant productVariant;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductVariantCreatePayload build() {
      ProductVariantCreatePayload result = new ProductVariantCreatePayload();
      result.product = this.product;
      result.productVariant = this.productVariant;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The product associated with the variant.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The successfully created variant.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
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
