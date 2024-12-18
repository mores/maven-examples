package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrdersReleaseHolds` mutation.
 */
public class FulfillmentOrdersReleaseHoldsPayload {
  /**
   * The asynchronous job that will release the fulfillment holds.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrdersReleaseHoldsUserError> userErrors;

  public FulfillmentOrdersReleaseHoldsPayload() {
  }

  /**
   * The asynchronous job that will release the fulfillment holds.
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
  public List<FulfillmentOrdersReleaseHoldsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrdersReleaseHoldsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrdersReleaseHoldsPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrdersReleaseHoldsPayload that = (FulfillmentOrdersReleaseHoldsPayload) o;
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
     * The asynchronous job that will release the fulfillment holds.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrdersReleaseHoldsUserError> userErrors;

    public FulfillmentOrdersReleaseHoldsPayload build() {
      FulfillmentOrdersReleaseHoldsPayload result = new FulfillmentOrdersReleaseHoldsPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job that will release the fulfillment holds.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrdersReleaseHoldsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
