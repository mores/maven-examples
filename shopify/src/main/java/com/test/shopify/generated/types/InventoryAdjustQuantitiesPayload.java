package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryAdjustQuantities` mutation.
 */
public class InventoryAdjustQuantitiesPayload {
  /**
   * The group of changes made by the operation.
   */
  private InventoryAdjustmentGroup inventoryAdjustmentGroup;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryAdjustQuantitiesUserError> userErrors;

  public InventoryAdjustQuantitiesPayload() {
  }

  /**
   * The group of changes made by the operation.
   */
  public InventoryAdjustmentGroup getInventoryAdjustmentGroup() {
    return inventoryAdjustmentGroup;
  }

  public void setInventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
    this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryAdjustQuantitiesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryAdjustQuantitiesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryAdjustQuantitiesPayload{inventoryAdjustmentGroup='" + inventoryAdjustmentGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustQuantitiesPayload that = (InventoryAdjustQuantitiesPayload) o;
    return Objects.equals(inventoryAdjustmentGroup, that.inventoryAdjustmentGroup) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryAdjustmentGroup, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The group of changes made by the operation.
     */
    private InventoryAdjustmentGroup inventoryAdjustmentGroup;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryAdjustQuantitiesUserError> userErrors;

    public InventoryAdjustQuantitiesPayload build() {
      InventoryAdjustQuantitiesPayload result = new InventoryAdjustQuantitiesPayload();
      result.inventoryAdjustmentGroup = this.inventoryAdjustmentGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The group of changes made by the operation.
     */
    public Builder inventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
      this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryAdjustQuantitiesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
