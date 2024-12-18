package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productJoinSellingPlanGroups` mutation.
 */
public class ProductJoinSellingPlanGroupsPayload {
  /**
   * The product object.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public ProductJoinSellingPlanGroupsPayload() {
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
  public List<SellingPlanGroupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SellingPlanGroupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductJoinSellingPlanGroupsPayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductJoinSellingPlanGroupsPayload that = (ProductJoinSellingPlanGroupsPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product object.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public ProductJoinSellingPlanGroupsPayload build() {
      ProductJoinSellingPlanGroupsPayload result = new ProductJoinSellingPlanGroupsPayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
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
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
