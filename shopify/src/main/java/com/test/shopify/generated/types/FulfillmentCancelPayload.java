package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentCancel` mutation.
 */
public class FulfillmentCancelPayload {
  /**
   * The canceled fulfillment.
   */
  private Fulfillment fulfillment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public FulfillmentCancelPayload() {
  }

  /**
   * The canceled fulfillment.
   */
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
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
    return "FulfillmentCancelPayload{fulfillment='" + fulfillment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentCancelPayload that = (FulfillmentCancelPayload) o;
    return Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The canceled fulfillment.
     */
    private Fulfillment fulfillment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public FulfillmentCancelPayload build() {
      FulfillmentCancelPayload result = new FulfillmentCancelPayload();
      result.fulfillment = this.fulfillment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The canceled fulfillment.
     */
    public Builder fulfillment(Fulfillment fulfillment) {
      this.fulfillment = fulfillment;
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
