package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an inventory item.
 */
public class InventoryItemInput {
  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  private String cost;

  /**
   * Whether the inventory item is tracked.
   */
  private Boolean tracked;

  public InventoryItemInput() {
  }

  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  /**
   * Whether the inventory item is tracked.
   */
  public Boolean getTracked() {
    return tracked;
  }

  public void setTracked(Boolean tracked) {
    this.tracked = tracked;
  }

  @Override
  public String toString() {
    return "InventoryItemInput{cost='" + cost + "', tracked='" + tracked + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemInput that = (InventoryItemInput) o;
    return Objects.equals(cost, that.cost) &&
        Objects.equals(tracked, that.tracked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, tracked);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    private String cost;

    /**
     * Whether the inventory item is tracked.
     */
    private Boolean tracked;

    public InventoryItemInput build() {
      InventoryItemInput result = new InventoryItemInput();
      result.cost = this.cost;
      result.tracked = this.tracked;
      return result;
    }

    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    public Builder cost(String cost) {
      this.cost = cost;
      return this;
    }

    /**
     * Whether the inventory item is tracked.
     */
    public Builder tracked(Boolean tracked) {
      this.tracked = tracked;
      return this;
    }
  }
}
