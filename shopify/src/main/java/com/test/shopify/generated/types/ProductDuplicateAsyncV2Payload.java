package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDuplicateAsyncV2` mutation.
 */
public class ProductDuplicateAsyncV2Payload {
  /**
   * The duplicated product ID.
   */
  private String duplicatedProductId;

  /**
   * The asynchronous job for duplicating the product.
   */
  private String productDuplicateJobId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductDuplicateUserError> userErrors;

  public ProductDuplicateAsyncV2Payload() {
  }

  /**
   * The duplicated product ID.
   */
  public String getDuplicatedProductId() {
    return duplicatedProductId;
  }

  public void setDuplicatedProductId(String duplicatedProductId) {
    this.duplicatedProductId = duplicatedProductId;
  }

  /**
   * The asynchronous job for duplicating the product.
   */
  public String getProductDuplicateJobId() {
    return productDuplicateJobId;
  }

  public void setProductDuplicateJobId(String productDuplicateJobId) {
    this.productDuplicateJobId = productDuplicateJobId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductDuplicateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductDuplicateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductDuplicateAsyncV2Payload{duplicatedProductId='" + duplicatedProductId + "', productDuplicateJobId='" + productDuplicateJobId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicateAsyncV2Payload that = (ProductDuplicateAsyncV2Payload) o;
    return Objects.equals(duplicatedProductId, that.duplicatedProductId) &&
        Objects.equals(productDuplicateJobId, that.productDuplicateJobId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicatedProductId, productDuplicateJobId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The duplicated product ID.
     */
    private String duplicatedProductId;

    /**
     * The asynchronous job for duplicating the product.
     */
    private String productDuplicateJobId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductDuplicateUserError> userErrors;

    public ProductDuplicateAsyncV2Payload build() {
      ProductDuplicateAsyncV2Payload result = new ProductDuplicateAsyncV2Payload();
      result.duplicatedProductId = this.duplicatedProductId;
      result.productDuplicateJobId = this.productDuplicateJobId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The duplicated product ID.
     */
    public Builder duplicatedProductId(String duplicatedProductId) {
      this.duplicatedProductId = duplicatedProductId;
      return this;
    }

    /**
     * The asynchronous job for duplicating the product.
     */
    public Builder productDuplicateJobId(String productDuplicateJobId) {
      this.productDuplicateJobId = productDuplicateJobId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductDuplicateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
