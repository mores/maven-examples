package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the product async duplicate mutation.
 */
public class ProductDuplicateAsyncInput {
  /**
   * The ID of the product to be duplicated.
   */
  private String productId;

  /**
   * The new title of the product.
   */
  private String newTitle;

  /**
   * The new status of the product. If no value is provided the status will be inherited from the original product.
   */
  private ProductStatus newStatus;

  /**
   * Specifies whether or not to duplicate images.
   */
  private Boolean includeImages = false;

  public ProductDuplicateAsyncInput() {
  }

  /**
   * The ID of the product to be duplicated.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The new title of the product.
   */
  public String getNewTitle() {
    return newTitle;
  }

  public void setNewTitle(String newTitle) {
    this.newTitle = newTitle;
  }

  /**
   * The new status of the product. If no value is provided the status will be inherited from the original product.
   */
  public ProductStatus getNewStatus() {
    return newStatus;
  }

  public void setNewStatus(ProductStatus newStatus) {
    this.newStatus = newStatus;
  }

  /**
   * Specifies whether or not to duplicate images.
   */
  public Boolean getIncludeImages() {
    return includeImages;
  }

  public void setIncludeImages(Boolean includeImages) {
    this.includeImages = includeImages;
  }

  @Override
  public String toString() {
    return "ProductDuplicateAsyncInput{productId='" + productId + "', newTitle='" + newTitle + "', newStatus='" + newStatus + "', includeImages='" + includeImages + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicateAsyncInput that = (ProductDuplicateAsyncInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(newTitle, that.newTitle) &&
        Objects.equals(newStatus, that.newStatus) &&
        Objects.equals(includeImages, that.includeImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, newTitle, newStatus, includeImages);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product to be duplicated.
     */
    private String productId;

    /**
     * The new title of the product.
     */
    private String newTitle;

    /**
     * The new status of the product. If no value is provided the status will be inherited from the original product.
     */
    private ProductStatus newStatus;

    /**
     * Specifies whether or not to duplicate images.
     */
    private Boolean includeImages = false;

    public ProductDuplicateAsyncInput build() {
      ProductDuplicateAsyncInput result = new ProductDuplicateAsyncInput();
      result.productId = this.productId;
      result.newTitle = this.newTitle;
      result.newStatus = this.newStatus;
      result.includeImages = this.includeImages;
      return result;
    }

    /**
     * The ID of the product to be duplicated.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The new title of the product.
     */
    public Builder newTitle(String newTitle) {
      this.newTitle = newTitle;
      return this;
    }

    /**
     * The new status of the product. If no value is provided the status will be inherited from the original product.
     */
    public Builder newStatus(ProductStatus newStatus) {
      this.newStatus = newStatus;
      return this;
    }

    /**
     * Specifies whether or not to duplicate images.
     */
    public Builder includeImages(Boolean includeImages) {
      this.includeImages = includeImages;
      return this;
    }
  }
}
