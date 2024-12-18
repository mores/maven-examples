package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productImageUpdate` mutation.
 */
public class ProductImageUpdatePayload {
  /**
   * The image that has been updated.
   */
  private Image image;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductImageUpdatePayload() {
  }

  /**
   * The image that has been updated.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
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
    return "ProductImageUpdatePayload{image='" + image + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductImageUpdatePayload that = (ProductImageUpdatePayload) o;
    return Objects.equals(image, that.image) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The image that has been updated.
     */
    private Image image;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductImageUpdatePayload build() {
      ProductImageUpdatePayload result = new ProductImageUpdatePayload();
      result.image = this.image;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The image that has been updated.
     */
    public Builder image(Image image) {
      this.image = image;
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
