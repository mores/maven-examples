package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to manipulate a price rule.
 */
public class PriceRuleInput {
  /**
   * Determines which discount classes the discount can combine with.
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * PriceRuleValidityPeriod for the price rule.
   */
  private PriceRuleValidityPeriodInput validityPeriod;

  /**
   * Whether the price rule can be applied only once per customer.
   */
  private Boolean oncePerCustomer = false;

  /**
   * The customers that can use this price rule.
   */
  private PriceRuleCustomerSelectionInput customerSelection;

  /**
   * The maximum number of times that the price rule can be used in total.
   */
  private Integer usageLimit;

  /**
   * Title of the price rule.
   */
  private String title;

  /**
   * The maximum number of times that the price rule can be allocated onto an order.
   */
  private Integer allocationLimit;

  /**
   * The method by which the price rule's value is allocated to its entitled items.
   */
  private PriceRuleAllocationMethod allocationMethod;

  /**
   * The value of the price rule.
   */
  private PriceRuleValueInput value;

  /**
   * The type of lines (line_item or shipping_line) to which the price rule applies.
   */
  private PriceRuleTarget target;

  /**
   * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
   */
  private PriceRuleMoneyRangeInput prerequisiteSubtotalRange;

  /**
   * The number of the entitled items must fall within this range for the price rule to be applicable.
   */
  private PriceRuleQuantityRangeInput prerequisiteQuantityRange;

  /**
   * The shipping cost must fall within this range for the price rule to be applicable.
   */
  private PriceRuleMoneyRangeInput prerequisiteShippingPriceRange;

  /**
   * The items to which the price rule applies.
   */
  private PriceRuleItemEntitlementsInput itemEntitlements;

  /**
   * The items required for the price rule to be applicable.
   */
  private PriceRuleItemPrerequisitesInput itemPrerequisites;

  /**
   * The shipping lines to which the price rule applies.
   */
  private PriceRuleShippingEntitlementsInput shippingEntitlements;

  /**
   * Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of entitled items.
   */
  private PriceRulePrerequisiteToEntitlementQuantityRatioInput prerequisiteToEntitlementQuantityRatio;

  public PriceRuleInput() {
  }

  /**
   * Determines which discount classes the discount can combine with.
   */
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * PriceRuleValidityPeriod for the price rule.
   */
  public PriceRuleValidityPeriodInput getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(PriceRuleValidityPeriodInput validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  /**
   * Whether the price rule can be applied only once per customer.
   */
  public Boolean getOncePerCustomer() {
    return oncePerCustomer;
  }

  public void setOncePerCustomer(Boolean oncePerCustomer) {
    this.oncePerCustomer = oncePerCustomer;
  }

  /**
   * The customers that can use this price rule.
   */
  public PriceRuleCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(PriceRuleCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The maximum number of times that the price rule can be used in total.
   */
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   * Title of the price rule.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The maximum number of times that the price rule can be allocated onto an order.
   */
  public Integer getAllocationLimit() {
    return allocationLimit;
  }

  public void setAllocationLimit(Integer allocationLimit) {
    this.allocationLimit = allocationLimit;
  }

  /**
   * The method by which the price rule's value is allocated to its entitled items.
   */
  public PriceRuleAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(PriceRuleAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  /**
   * The value of the price rule.
   */
  public PriceRuleValueInput getValue() {
    return value;
  }

  public void setValue(PriceRuleValueInput value) {
    this.value = value;
  }

  /**
   * The type of lines (line_item or shipping_line) to which the price rule applies.
   */
  public PriceRuleTarget getTarget() {
    return target;
  }

  public void setTarget(PriceRuleTarget target) {
    this.target = target;
  }

  /**
   * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
   */
  public PriceRuleMoneyRangeInput getPrerequisiteSubtotalRange() {
    return prerequisiteSubtotalRange;
  }

  public void setPrerequisiteSubtotalRange(PriceRuleMoneyRangeInput prerequisiteSubtotalRange) {
    this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
  }

  /**
   * The number of the entitled items must fall within this range for the price rule to be applicable.
   */
  public PriceRuleQuantityRangeInput getPrerequisiteQuantityRange() {
    return prerequisiteQuantityRange;
  }

  public void setPrerequisiteQuantityRange(PriceRuleQuantityRangeInput prerequisiteQuantityRange) {
    this.prerequisiteQuantityRange = prerequisiteQuantityRange;
  }

  /**
   * The shipping cost must fall within this range for the price rule to be applicable.
   */
  public PriceRuleMoneyRangeInput getPrerequisiteShippingPriceRange() {
    return prerequisiteShippingPriceRange;
  }

  public void setPrerequisiteShippingPriceRange(
      PriceRuleMoneyRangeInput prerequisiteShippingPriceRange) {
    this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
  }

  /**
   * The items to which the price rule applies.
   */
  public PriceRuleItemEntitlementsInput getItemEntitlements() {
    return itemEntitlements;
  }

  public void setItemEntitlements(PriceRuleItemEntitlementsInput itemEntitlements) {
    this.itemEntitlements = itemEntitlements;
  }

  /**
   * The items required for the price rule to be applicable.
   */
  public PriceRuleItemPrerequisitesInput getItemPrerequisites() {
    return itemPrerequisites;
  }

  public void setItemPrerequisites(PriceRuleItemPrerequisitesInput itemPrerequisites) {
    this.itemPrerequisites = itemPrerequisites;
  }

  /**
   * The shipping lines to which the price rule applies.
   */
  public PriceRuleShippingEntitlementsInput getShippingEntitlements() {
    return shippingEntitlements;
  }

  public void setShippingEntitlements(PriceRuleShippingEntitlementsInput shippingEntitlements) {
    this.shippingEntitlements = shippingEntitlements;
  }

  /**
   * Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of entitled items.
   */
  public PriceRulePrerequisiteToEntitlementQuantityRatioInput getPrerequisiteToEntitlementQuantityRatio(
      ) {
    return prerequisiteToEntitlementQuantityRatio;
  }

  public void setPrerequisiteToEntitlementQuantityRatio(
      PriceRulePrerequisiteToEntitlementQuantityRatioInput prerequisiteToEntitlementQuantityRatio) {
    this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
  }

  @Override
  public String toString() {
    return "PriceRuleInput{combinesWith='" + combinesWith + "', validityPeriod='" + validityPeriod + "', oncePerCustomer='" + oncePerCustomer + "', customerSelection='" + customerSelection + "', usageLimit='" + usageLimit + "', title='" + title + "', allocationLimit='" + allocationLimit + "', allocationMethod='" + allocationMethod + "', value='" + value + "', target='" + target + "', prerequisiteSubtotalRange='" + prerequisiteSubtotalRange + "', prerequisiteQuantityRange='" + prerequisiteQuantityRange + "', prerequisiteShippingPriceRange='" + prerequisiteShippingPriceRange + "', itemEntitlements='" + itemEntitlements + "', itemPrerequisites='" + itemPrerequisites + "', shippingEntitlements='" + shippingEntitlements + "', prerequisiteToEntitlementQuantityRatio='" + prerequisiteToEntitlementQuantityRatio + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleInput that = (PriceRuleInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(validityPeriod, that.validityPeriod) &&
        Objects.equals(oncePerCustomer, that.oncePerCustomer) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(title, that.title) &&
        Objects.equals(allocationLimit, that.allocationLimit) &&
        Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(value, that.value) &&
        Objects.equals(target, that.target) &&
        Objects.equals(prerequisiteSubtotalRange, that.prerequisiteSubtotalRange) &&
        Objects.equals(prerequisiteQuantityRange, that.prerequisiteQuantityRange) &&
        Objects.equals(prerequisiteShippingPriceRange, that.prerequisiteShippingPriceRange) &&
        Objects.equals(itemEntitlements, that.itemEntitlements) &&
        Objects.equals(itemPrerequisites, that.itemPrerequisites) &&
        Objects.equals(shippingEntitlements, that.shippingEntitlements) &&
        Objects.equals(prerequisiteToEntitlementQuantityRatio, that.prerequisiteToEntitlementQuantityRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, validityPeriod, oncePerCustomer, customerSelection, usageLimit, title, allocationLimit, allocationMethod, value, target, prerequisiteSubtotalRange, prerequisiteQuantityRange, prerequisiteShippingPriceRange, itemEntitlements, itemPrerequisites, shippingEntitlements, prerequisiteToEntitlementQuantityRatio);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Determines which discount classes the discount can combine with.
     */
    private DiscountCombinesWithInput combinesWith;

    /**
     * PriceRuleValidityPeriod for the price rule.
     */
    private PriceRuleValidityPeriodInput validityPeriod;

    /**
     * Whether the price rule can be applied only once per customer.
     */
    private Boolean oncePerCustomer = false;

    /**
     * The customers that can use this price rule.
     */
    private PriceRuleCustomerSelectionInput customerSelection;

    /**
     * The maximum number of times that the price rule can be used in total.
     */
    private Integer usageLimit;

    /**
     * Title of the price rule.
     */
    private String title;

    /**
     * The maximum number of times that the price rule can be allocated onto an order.
     */
    private Integer allocationLimit;

    /**
     * The method by which the price rule's value is allocated to its entitled items.
     */
    private PriceRuleAllocationMethod allocationMethod;

    /**
     * The value of the price rule.
     */
    private PriceRuleValueInput value;

    /**
     * The type of lines (line_item or shipping_line) to which the price rule applies.
     */
    private PriceRuleTarget target;

    /**
     * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
     */
    private PriceRuleMoneyRangeInput prerequisiteSubtotalRange;

    /**
     * The number of the entitled items must fall within this range for the price rule to be applicable.
     */
    private PriceRuleQuantityRangeInput prerequisiteQuantityRange;

    /**
     * The shipping cost must fall within this range for the price rule to be applicable.
     */
    private PriceRuleMoneyRangeInput prerequisiteShippingPriceRange;

    /**
     * The items to which the price rule applies.
     */
    private PriceRuleItemEntitlementsInput itemEntitlements;

    /**
     * The items required for the price rule to be applicable.
     */
    private PriceRuleItemPrerequisitesInput itemPrerequisites;

    /**
     * The shipping lines to which the price rule applies.
     */
    private PriceRuleShippingEntitlementsInput shippingEntitlements;

    /**
     * Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of entitled items.
     */
    private PriceRulePrerequisiteToEntitlementQuantityRatioInput prerequisiteToEntitlementQuantityRatio;

    public PriceRuleInput build() {
      PriceRuleInput result = new PriceRuleInput();
      result.combinesWith = this.combinesWith;
      result.validityPeriod = this.validityPeriod;
      result.oncePerCustomer = this.oncePerCustomer;
      result.customerSelection = this.customerSelection;
      result.usageLimit = this.usageLimit;
      result.title = this.title;
      result.allocationLimit = this.allocationLimit;
      result.allocationMethod = this.allocationMethod;
      result.value = this.value;
      result.target = this.target;
      result.prerequisiteSubtotalRange = this.prerequisiteSubtotalRange;
      result.prerequisiteQuantityRange = this.prerequisiteQuantityRange;
      result.prerequisiteShippingPriceRange = this.prerequisiteShippingPriceRange;
      result.itemEntitlements = this.itemEntitlements;
      result.itemPrerequisites = this.itemPrerequisites;
      result.shippingEntitlements = this.shippingEntitlements;
      result.prerequisiteToEntitlementQuantityRatio = this.prerequisiteToEntitlementQuantityRatio;
      return result;
    }

    /**
     * Determines which discount classes the discount can combine with.
     */
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * PriceRuleValidityPeriod for the price rule.
     */
    public Builder validityPeriod(PriceRuleValidityPeriodInput validityPeriod) {
      this.validityPeriod = validityPeriod;
      return this;
    }

    /**
     * Whether the price rule can be applied only once per customer.
     */
    public Builder oncePerCustomer(Boolean oncePerCustomer) {
      this.oncePerCustomer = oncePerCustomer;
      return this;
    }

    /**
     * The customers that can use this price rule.
     */
    public Builder customerSelection(PriceRuleCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The maximum number of times that the price rule can be used in total.
     */
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    /**
     * Title of the price rule.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The maximum number of times that the price rule can be allocated onto an order.
     */
    public Builder allocationLimit(Integer allocationLimit) {
      this.allocationLimit = allocationLimit;
      return this;
    }

    /**
     * The method by which the price rule's value is allocated to its entitled items.
     */
    public Builder allocationMethod(PriceRuleAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    /**
     * The value of the price rule.
     */
    public Builder value(PriceRuleValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The type of lines (line_item or shipping_line) to which the price rule applies.
     */
    public Builder target(PriceRuleTarget target) {
      this.target = target;
      return this;
    }

    /**
     * The sum of the entitled items subtotal prices must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteSubtotalRange(PriceRuleMoneyRangeInput prerequisiteSubtotalRange) {
      this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
      return this;
    }

    /**
     * The number of the entitled items must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteQuantityRange(
        PriceRuleQuantityRangeInput prerequisiteQuantityRange) {
      this.prerequisiteQuantityRange = prerequisiteQuantityRange;
      return this;
    }

    /**
     * The shipping cost must fall within this range for the price rule to be applicable.
     */
    public Builder prerequisiteShippingPriceRange(
        PriceRuleMoneyRangeInput prerequisiteShippingPriceRange) {
      this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
      return this;
    }

    /**
     * The items to which the price rule applies.
     */
    public Builder itemEntitlements(PriceRuleItemEntitlementsInput itemEntitlements) {
      this.itemEntitlements = itemEntitlements;
      return this;
    }

    /**
     * The items required for the price rule to be applicable.
     */
    public Builder itemPrerequisites(PriceRuleItemPrerequisitesInput itemPrerequisites) {
      this.itemPrerequisites = itemPrerequisites;
      return this;
    }

    /**
     * The shipping lines to which the price rule applies.
     */
    public Builder shippingEntitlements(PriceRuleShippingEntitlementsInput shippingEntitlements) {
      this.shippingEntitlements = shippingEntitlements;
      return this;
    }

    /**
     * Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of entitled items.
     */
    public Builder prerequisiteToEntitlementQuantityRatio(
        PriceRulePrerequisiteToEntitlementQuantityRatioInput prerequisiteToEntitlementQuantityRatio) {
      this.prerequisiteToEntitlementQuantityRatio = prerequisiteToEntitlementQuantityRatio;
      return this;
    }
  }
}
