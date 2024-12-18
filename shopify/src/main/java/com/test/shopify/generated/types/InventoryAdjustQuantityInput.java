package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to adjust the inventory quantity.
 */
public class InventoryAdjustQuantityInput {
  /**
   * ID of the inventory level to adjust.
   */
  private String inventoryLevelId;

  /**
   * The change applied to the `available` quantity of the item at the location.
   */
  private int availableDelta;

  public InventoryAdjustQuantityInput() {
  }

  /**
   * ID of the inventory level to adjust.
   */
  public String getInventoryLevelId() {
    return inventoryLevelId;
  }

  public void setInventoryLevelId(String inventoryLevelId) {
    this.inventoryLevelId = inventoryLevelId;
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
    return "InventoryAdjustQuantityInput{inventoryLevelId='" + inventoryLevelId + "', availableDelta='" + availableDelta + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustQuantityInput that = (InventoryAdjustQuantityInput) o;
    return Objects.equals(inventoryLevelId, that.inventoryLevelId) &&
        availableDelta == that.availableDelta;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryLevelId, availableDelta);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the inventory level to adjust.
     */
    private String inventoryLevelId;

    /**
     * The change applied to the `available` quantity of the item at the location.
     */
    private int availableDelta;

    public InventoryAdjustQuantityInput build() {
      InventoryAdjustQuantityInput result = new InventoryAdjustQuantityInput();
      result.inventoryLevelId = this.inventoryLevelId;
      result.availableDelta = this.availableDelta;
      return result;
    }

    /**
     * ID of the inventory level to adjust.
     */
    public Builder inventoryLevelId(String inventoryLevelId) {
      this.inventoryLevelId = inventoryLevelId;
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
