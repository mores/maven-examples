package com.test.shopify.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the quantity of prerequisite items required for the price rule to be
 * applicable, compared to quantity of entitled items.
 */
public class PriceRulePrerequisiteToEntitlementQuantityRatioInput {
  /**
   * The quantity of entitled items in the ratio.
   */
  private Integer entitlementQuantity;

  /**
   * The quantity of prerequisite items in the ratio.
   */
  private Integer prerequisiteQuantity;

  public PriceRulePrerequisiteToEntitlementQuantityRatioInput() {
  }

  /**
   * The quantity of entitled items in the ratio.
   */
  public Integer getEntitlementQuantity() {
    return entitlementQuantity;
  }

  public void setEntitlementQuantity(Integer entitlementQuantity) {
    this.entitlementQuantity = entitlementQuantity;
  }

  /**
   * The quantity of prerequisite items in the ratio.
   */
  public Integer getPrerequisiteQuantity() {
    return prerequisiteQuantity;
  }

  public void setPrerequisiteQuantity(Integer prerequisiteQuantity) {
    this.prerequisiteQuantity = prerequisiteQuantity;
  }

  @Override
  public String toString() {
    return "PriceRulePrerequisiteToEntitlementQuantityRatioInput{entitlementQuantity='" + entitlementQuantity + "', prerequisiteQuantity='" + prerequisiteQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRulePrerequisiteToEntitlementQuantityRatioInput that = (PriceRulePrerequisiteToEntitlementQuantityRatioInput) o;
    return Objects.equals(entitlementQuantity, that.entitlementQuantity) &&
        Objects.equals(prerequisiteQuantity, that.prerequisiteQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementQuantity, prerequisiteQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of entitled items in the ratio.
     */
    private Integer entitlementQuantity;

    /**
     * The quantity of prerequisite items in the ratio.
     */
    private Integer prerequisiteQuantity;

    public PriceRulePrerequisiteToEntitlementQuantityRatioInput build() {
      PriceRulePrerequisiteToEntitlementQuantityRatioInput result = new PriceRulePrerequisiteToEntitlementQuantityRatioInput();
      result.entitlementQuantity = this.entitlementQuantity;
      result.prerequisiteQuantity = this.prerequisiteQuantity;
      return result;
    }

    /**
     * The quantity of entitled items in the ratio.
     */
    public Builder entitlementQuantity(Integer entitlementQuantity) {
      this.entitlementQuantity = entitlementQuantity;
      return this;
    }

    /**
     * The quantity of prerequisite items in the ratio.
     */
    public Builder prerequisiteQuantity(Integer prerequisiteQuantity) {
      this.prerequisiteQuantity = prerequisiteQuantity;
      return this;
    }
  }
}
