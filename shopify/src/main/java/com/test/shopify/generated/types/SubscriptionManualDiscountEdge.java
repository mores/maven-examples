package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one SubscriptionManualDiscount and a cursor during pagination.
 */
public class SubscriptionManualDiscountEdge {
  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  private String cursor;

  /**
   * The item at the end of SubscriptionManualDiscountEdge.
   */
  private SubscriptionManualDiscount node;

  public SubscriptionManualDiscountEdge() {
  }

  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  /**
   * The item at the end of SubscriptionManualDiscountEdge.
   */
  public SubscriptionManualDiscount getNode() {
    return node;
  }

  public void setNode(SubscriptionManualDiscount node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountEdge that = (SubscriptionManualDiscountEdge) o;
    return Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, node);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
     */
    private String cursor;

    /**
     * The item at the end of SubscriptionManualDiscountEdge.
     */
    private SubscriptionManualDiscount node;

    public SubscriptionManualDiscountEdge build() {
      SubscriptionManualDiscountEdge result = new SubscriptionManualDiscountEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    /**
     * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of SubscriptionManualDiscountEdge.
     */
    public Builder node(SubscriptionManualDiscount node) {
      this.node = node;
      return this;
    }
  }
}