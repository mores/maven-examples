package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDuplicateAsync` mutation.
 */
public class ProductDuplicateAsyncPayload {
  /**
   * The duplicated product ID.
   */
  private String duplicatedProductId;

  /**
   * The asynchronous job for duplicating the products.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductDuplicateUserError> userErrors;

  public ProductDuplicateAsyncPayload() {
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
   * The asynchronous job for duplicating the products.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
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
    return "ProductDuplicateAsyncPayload{duplicatedProductId='" + duplicatedProductId + "', job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicateAsyncPayload that = (ProductDuplicateAsyncPayload) o;
    return Objects.equals(duplicatedProductId, that.duplicatedProductId) &&
        Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicatedProductId, job, userErrors);
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
     * The asynchronous job for duplicating the products.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductDuplicateUserError> userErrors;

    public ProductDuplicateAsyncPayload build() {
      ProductDuplicateAsyncPayload result = new ProductDuplicateAsyncPayload();
      result.duplicatedProductId = this.duplicatedProductId;
      result.job = this.job;
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
     * The asynchronous job for duplicating the products.
     */
    public Builder job(Job job) {
      this.job = job;
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
