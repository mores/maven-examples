package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDeleteImages` mutation.
 */
public class ProductDeleteImagesPayload {
  /**
   * The array of image IDs to delete.
   */
  private List<String> deletedImageIds;

  /**
   * The product object.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductDeleteImagesPayload() {
  }

  /**
   * The array of image IDs to delete.
   */
  public List<String> getDeletedImageIds() {
    return deletedImageIds;
  }

  public void setDeletedImageIds(List<String> deletedImageIds) {
    this.deletedImageIds = deletedImageIds;
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
    return "ProductDeleteImagesPayload{deletedImageIds='" + deletedImageIds + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteImagesPayload that = (ProductDeleteImagesPayload) o;
    return Objects.equals(deletedImageIds, that.deletedImageIds) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedImageIds, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The array of image IDs to delete.
     */
    private List<String> deletedImageIds;

    /**
     * The product object.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductDeleteImagesPayload build() {
      ProductDeleteImagesPayload result = new ProductDeleteImagesPayload();
      result.deletedImageIds = this.deletedImageIds;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The array of image IDs to delete.
     */
    public Builder deletedImageIds(List<String> deletedImageIds) {
      this.deletedImageIds = deletedImageIds;
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
