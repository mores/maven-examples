package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryBulkAdjustQuantityAtLocation` mutation.
 */
public class InventoryBulkAdjustQuantityAtLocationPayload {
  /**
   * Represents the updated inventory quantities of an inventory item at the location.
   */
  private List<InventoryLevel> inventoryLevels;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public InventoryBulkAdjustQuantityAtLocationPayload() {
  }

  /**
   * Represents the updated inventory quantities of an inventory item at the location.
   */
  public List<InventoryLevel> getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(List<InventoryLevel> inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
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
    return "InventoryBulkAdjustQuantityAtLocationPayload{inventoryLevels='" + inventoryLevels + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryBulkAdjustQuantityAtLocationPayload that = (InventoryBulkAdjustQuantityAtLocationPayload) o;
    return Objects.equals(inventoryLevels, that.inventoryLevels) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryLevels, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Represents the updated inventory quantities of an inventory item at the location.
     */
    private List<InventoryLevel> inventoryLevels;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public InventoryBulkAdjustQuantityAtLocationPayload build() {
      InventoryBulkAdjustQuantityAtLocationPayload result = new InventoryBulkAdjustQuantityAtLocationPayload();
      result.inventoryLevels = this.inventoryLevels;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Represents the updated inventory quantities of an inventory item at the location.
     */
    public Builder inventoryLevels(List<InventoryLevel> inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
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
