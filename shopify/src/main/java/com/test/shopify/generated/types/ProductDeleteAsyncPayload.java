package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDeleteAsync` mutation.
 */
public class ProductDeleteAsyncPayload {
  /**
   * The ID of the product that was requested to be deleted.
   */
  private String deleteProductId;

  /**
   * The background job that will delete the product and its associated variants and media.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductDeleteUserError> userErrors;

  public ProductDeleteAsyncPayload() {
  }

  /**
   * The ID of the product that was requested to be deleted.
   */
  public String getDeleteProductId() {
    return deleteProductId;
  }

  public void setDeleteProductId(String deleteProductId) {
    this.deleteProductId = deleteProductId;
  }

  /**
   * The background job that will delete the product and its associated variants and media.
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
  public List<ProductDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductDeleteAsyncPayload{deleteProductId='" + deleteProductId + "', job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteAsyncPayload that = (ProductDeleteAsyncPayload) o;
    return Objects.equals(deleteProductId, that.deleteProductId) &&
        Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProductId, job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product that was requested to be deleted.
     */
    private String deleteProductId;

    /**
     * The background job that will delete the product and its associated variants and media.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductDeleteUserError> userErrors;

    public ProductDeleteAsyncPayload build() {
      ProductDeleteAsyncPayload result = new ProductDeleteAsyncPayload();
      result.deleteProductId = this.deleteProductId;
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the product that was requested to be deleted.
     */
    public Builder deleteProductId(String deleteProductId) {
      this.deleteProductId = deleteProductId;
      return this;
    }

    /**
     * The background job that will delete the product and its associated variants and media.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
