package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `reverseDeliveryDispose` mutation.
 */
public class ReverseDeliveryDisposePayload {
  /**
   * The disposed reverse delivery line items.
   */
  private List<ReverseDeliveryLineItem> reverseDeliveryLineItems;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ReturnUserError> userErrors;

  public ReverseDeliveryDisposePayload() {
  }

  /**
   * The disposed reverse delivery line items.
   */
  public List<ReverseDeliveryLineItem> getReverseDeliveryLineItems() {
    return reverseDeliveryLineItems;
  }

  public void setReverseDeliveryLineItems(List<ReverseDeliveryLineItem> reverseDeliveryLineItems) {
    this.reverseDeliveryLineItems = reverseDeliveryLineItems;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ReturnUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ReturnUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryDisposePayload{reverseDeliveryLineItems='" + reverseDeliveryLineItems + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryDisposePayload that = (ReverseDeliveryDisposePayload) o;
    return Objects.equals(reverseDeliveryLineItems, that.reverseDeliveryLineItems) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseDeliveryLineItems, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The disposed reverse delivery line items.
     */
    private List<ReverseDeliveryLineItem> reverseDeliveryLineItems;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ReturnUserError> userErrors;

    public ReverseDeliveryDisposePayload build() {
      ReverseDeliveryDisposePayload result = new ReverseDeliveryDisposePayload();
      result.reverseDeliveryLineItems = this.reverseDeliveryLineItems;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The disposed reverse delivery line items.
     */
    public Builder reverseDeliveryLineItems(
        List<ReverseDeliveryLineItem> reverseDeliveryLineItems) {
      this.reverseDeliveryLineItems = reverseDeliveryLineItems;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ReturnUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
