package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productAppendImages` mutation.
 */
public class ProductAppendImagesPayload {
  /**
   * List of new images appended to the product.
   */
  private List<Image> newImages;

  /**
   * The product object.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductAppendImagesPayload() {
  }

  /**
   * List of new images appended to the product.
   */
  public List<Image> getNewImages() {
    return newImages;
  }

  public void setNewImages(List<Image> newImages) {
    this.newImages = newImages;
  }

  /**
   * The product object.
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
    return "ProductAppendImagesPayload{newImages='" + newImages + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductAppendImagesPayload that = (ProductAppendImagesPayload) o;
    return Objects.equals(newImages, that.newImages) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newImages, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of new images appended to the product.
     */
    private List<Image> newImages;

    /**
     * The product object.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductAppendImagesPayload build() {
      ProductAppendImagesPayload result = new ProductAppendImagesPayload();
      result.newImages = this.newImages;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * List of new images appended to the product.
     */
    public Builder newImages(List<Image> newImages) {
      this.newImages = newImages;
      return this;
    }

    /**
     * The product object.
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
