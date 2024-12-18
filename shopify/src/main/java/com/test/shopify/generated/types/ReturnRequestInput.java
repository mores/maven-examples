package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for requesting a return.
 */
public class ReturnRequestInput {
  /**
   * The ID of the order that's being returned.
   */
  private String orderId;

  /**
   * The line items that are being handled in the return.
   */
  private List<ReturnRequestLineItemInput> returnLineItems;

  public ReturnRequestInput() {
  }

  /**
   * The ID of the order that's being returned.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The line items that are being handled in the return.
   */
  public List<ReturnRequestLineItemInput> getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  @Override
  public String toString() {
    return "ReturnRequestInput{orderId='" + orderId + "', returnLineItems='" + returnLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestInput that = (ReturnRequestInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(returnLineItems, that.returnLineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, returnLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order that's being returned.
     */
    private String orderId;

    /**
     * The line items that are being handled in the return.
     */
    private List<ReturnRequestLineItemInput> returnLineItems;

    public ReturnRequestInput build() {
      ReturnRequestInput result = new ReturnRequestInput();
      result.orderId = this.orderId;
      result.returnLineItems = this.returnLineItems;
      return result;
    }

    /**
     * The ID of the order that's being returned.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The line items that are being handled in the return.
     */
    public Builder returnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }
  }
}
