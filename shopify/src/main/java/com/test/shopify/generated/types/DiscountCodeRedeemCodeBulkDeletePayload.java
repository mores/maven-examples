package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountCodeRedeemCodeBulkDelete` mutation.
 */
public class DiscountCodeRedeemCodeBulkDeletePayload {
  /**
   * The asynchronous job that deletes the discount redeem codes.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountCodeRedeemCodeBulkDeletePayload() {
  }

  /**
   * The asynchronous job that deletes the discount redeem codes.
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
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountCodeRedeemCodeBulkDeletePayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeRedeemCodeBulkDeletePayload that = (DiscountCodeRedeemCodeBulkDeletePayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job that deletes the discount redeem codes.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountCodeRedeemCodeBulkDeletePayload build() {
      DiscountCodeRedeemCodeBulkDeletePayload result = new DiscountCodeRedeemCodeBulkDeletePayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job that deletes the discount redeem codes.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
