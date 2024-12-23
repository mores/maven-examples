package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a metafield capability.
 */
public class MetafieldCapabilityCreateInput {
  /**
   * The input for updating the smart collection condition capability.
   */
  private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

  /**
   * The input for updating the admin filterable capability.
   */
  private MetafieldCapabilityAdminFilterableInput adminFilterable;

  public MetafieldCapabilityCreateInput() {
  }

  /**
   * The input for updating the smart collection condition capability.
   */
  public MetafieldCapabilitySmartCollectionConditionInput getSmartCollectionCondition() {
    return smartCollectionCondition;
  }

  public void setSmartCollectionCondition(
      MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
    this.smartCollectionCondition = smartCollectionCondition;
  }

  /**
   * The input for updating the admin filterable capability.
   */
  public MetafieldCapabilityAdminFilterableInput getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityCreateInput{smartCollectionCondition='" + smartCollectionCondition + "', adminFilterable='" + adminFilterable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityCreateInput that = (MetafieldCapabilityCreateInput) o;
    return Objects.equals(smartCollectionCondition, that.smartCollectionCondition) &&
        Objects.equals(adminFilterable, that.adminFilterable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smartCollectionCondition, adminFilterable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input for updating the smart collection condition capability.
     */
    private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

    /**
     * The input for updating the admin filterable capability.
     */
    private MetafieldCapabilityAdminFilterableInput adminFilterable;

    public MetafieldCapabilityCreateInput build() {
      MetafieldCapabilityCreateInput result = new MetafieldCapabilityCreateInput();
      result.smartCollectionCondition = this.smartCollectionCondition;
      result.adminFilterable = this.adminFilterable;
      return result;
    }

    /**
     * The input for updating the smart collection condition capability.
     */
    public Builder smartCollectionCondition(
        MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
      this.smartCollectionCondition = smartCollectionCondition;
      return this;
    }

    /**
     * The input for updating the admin filterable capability.
     */
    public Builder adminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }
  }
}
