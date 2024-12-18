package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying the order to mark as paid.
 */
public class OrderMarkAsPaidInput {
  /**
   * The ID of the order to mark as paid.
   */
  private String id;

  public OrderMarkAsPaidInput() {
  }

  /**
   * The ID of the order to mark as paid.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderMarkAsPaidInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderMarkAsPaidInput that = (OrderMarkAsPaidInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order to mark as paid.
     */
    private String id;

    public OrderMarkAsPaidInput build() {
      OrderMarkAsPaidInput result = new OrderMarkAsPaidInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the order to mark as paid.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
