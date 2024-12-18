package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDelete` mutation.
 */
public class ProductDeletePayload {
  /**
   * The ID of the deleted product.
   */
  private String deletedProductId;

  /**
   * The shop associated with the product.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductDeletePayload() {
  }

  /**
   * The ID of the deleted product.
   */
  public String getDeletedProductId() {
    return deletedProductId;
  }

  public void setDeletedProductId(String deletedProductId) {
    this.deletedProductId = deletedProductId;
  }

  /**
   * The shop associated with the product.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
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
    return "ProductDeletePayload{deletedProductId='" + deletedProductId + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeletePayload that = (ProductDeletePayload) o;
    return Objects.equals(deletedProductId, that.deletedProductId) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedProductId, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted product.
     */
    private String deletedProductId;

    /**
     * The shop associated with the product.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductDeletePayload build() {
      ProductDeletePayload result = new ProductDeletePayload();
      result.deletedProductId = this.deletedProductId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted product.
     */
    public Builder deletedProductId(String deletedProductId) {
      this.deletedProductId = deletedProductId;
      return this;
    }

    /**
     * The shop associated with the product.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
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
