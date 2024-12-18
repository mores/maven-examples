package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for items and their adjustments.
 */
public class InventoryAdjustItemInput {
  /**
   * ID of the inventory item to adjust.
   */
  private String inventoryItemId;

  /**
   * The change applied to the `available` quantity of the item at the location.
   */
  private int availableDelta;

  public InventoryAdjustItemInput() {
  }

  /**
   * ID of the inventory item to adjust.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The change applied to the `available` quantity of the item at the location.
   */
  public int getAvailableDelta() {
    return availableDelta;
  }

  public void setAvailableDelta(int availableDelta) {
    this.availableDelta = availableDelta;
  }

  @Override
  public String toString() {
    return "InventoryAdjustItemInput{inventoryItemId='" + inventoryItemId + "', availableDelta='" + availableDelta + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustItemInput that = (InventoryAdjustItemInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        availableDelta == that.availableDelta;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, availableDelta);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the inventory item to adjust.
     */
    private String inventoryItemId;

    /**
     * The change applied to the `available` quantity of the item at the location.
     */
    private int availableDelta;

    public InventoryAdjustItemInput build() {
      InventoryAdjustItemInput result = new InventoryAdjustItemInput();
      result.inventoryItemId = this.inventoryItemId;
      result.availableDelta = this.availableDelta;
      return result;
    }

    /**
     * ID of the inventory item to adjust.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The change applied to the `available` quantity of the item at the location.
     */
    public Builder availableDelta(int availableDelta) {
      this.availableDelta = availableDelta;
      return this;
    }
  }
}
