package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderMarkAsPaid` mutation.
 */
public class OrderMarkAsPaidPayload {
  /**
   * The order marked as paid.
   */
  private Order order;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderMarkAsPaidPayload() {
  }

  /**
   * The order marked as paid.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
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
    return "OrderMarkAsPaidPayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderMarkAsPaidPayload that = (OrderMarkAsPaidPayload) o;
    return Objects.equals(order, that.order) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order marked as paid.
     */
    private Order order;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderMarkAsPaidPayload build() {
      OrderMarkAsPaidPayload result = new OrderMarkAsPaidPayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order marked as paid.
     */
    public Builder order(Order order) {
      this.order = order;
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
