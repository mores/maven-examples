package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `fulfillmentOrderHold` mutation.
 */
public class FulfillmentOrderHoldPayload {
  /**
   * The fulfillment order on which a fulfillment hold was applied.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The remaining fulfillment order containing the line items to which the hold wasn't applied,
   * if specific line items were specified to be placed on hold.
   */
  private FulfillmentOrder remainingFulfillmentOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<FulfillmentOrderHoldUserError> userErrors;

  public FulfillmentOrderHoldPayload() {
  }

  /**
   * The fulfillment order on which a fulfillment hold was applied.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  /**
   * The remaining fulfillment order containing the line items to which the hold wasn't applied,
   * if specific line items were specified to be placed on hold.
   */
  public FulfillmentOrder getRemainingFulfillmentOrder() {
    return remainingFulfillmentOrder;
  }

  public void setRemainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
    this.remainingFulfillmentOrder = remainingFulfillmentOrder;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<FulfillmentOrderHoldUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<FulfillmentOrderHoldUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderHoldPayload{fulfillmentOrder='" + fulfillmentOrder + "', remainingFulfillmentOrder='" + remainingFulfillmentOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderHoldPayload that = (FulfillmentOrderHoldPayload) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(remainingFulfillmentOrder, that.remainingFulfillmentOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, remainingFulfillmentOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order on which a fulfillment hold was applied.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The remaining fulfillment order containing the line items to which the hold wasn't applied,
     * if specific line items were specified to be placed on hold.
     */
    private FulfillmentOrder remainingFulfillmentOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<FulfillmentOrderHoldUserError> userErrors;

    public FulfillmentOrderHoldPayload build() {
      FulfillmentOrderHoldPayload result = new FulfillmentOrderHoldPayload();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.remainingFulfillmentOrder = this.remainingFulfillmentOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The fulfillment order on which a fulfillment hold was applied.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The remaining fulfillment order containing the line items to which the hold wasn't applied,
     * if specific line items were specified to be placed on hold.
     */
    public Builder remainingFulfillmentOrder(FulfillmentOrder remainingFulfillmentOrder) {
      this.remainingFulfillmentOrder = remainingFulfillmentOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<FulfillmentOrderHoldUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
