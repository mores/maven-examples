package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update a basic code discount.
 */
public class DiscountCodeBasicInput {
  /**
   * Determines which discount classes the discount can combine with.
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * The title of the discount.
   */
  private String title;

  /**
   * The date and time when the discount starts.
   */
  private OffsetDateTime startsAt;

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
   */
  private Integer usageLimit;

  /**
   * Whether the discount can be applied only once per customer.
   */
  private Boolean appliesOncePerCustomer;

  /**
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  private DiscountMinimumRequirementInput minimumRequirement;

  /**
   * The qualifying items in an order, the quantity of each one, and the total value of the discount.
   */
  private DiscountCustomerGetsInput customerGets;

  /**
   * The customers that can use the discount.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * The code to use the discount.
   */
  private String code;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  private Integer recurringCycleLimit;

  public DiscountCodeBasicInput() {
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
   * The title of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time when the discount starts.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
   */
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   * Whether the discount can be applied only once per customer.
   */
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  /**
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  public DiscountMinimumRequirementInput getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  /**
   * The qualifying items in an order, the quantity of each one, and the total value of the discount.
   */
  public DiscountCustomerGetsInput getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGetsInput customerGets) {
    this.customerGets = customerGets;
  }

  /**
   * The customers that can use the discount.
   */
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The code to use the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "DiscountCodeBasicInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', minimumRequirement='" + minimumRequirement + "', customerGets='" + customerGets + "', customerSelection='" + customerSelection + "', code='" + code + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBasicInput that = (DiscountCodeBasicInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(code, that.code) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, usageLimit, appliesOncePerCustomer, minimumRequirement, customerGets, customerSelection, code, recurringCycleLimit);
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
     * The title of the discount.
     */
    private String title;

    /**
     * The date and time when the discount starts.
     */
    private OffsetDateTime startsAt;

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
     */
    private Integer usageLimit;

    /**
     * Whether the discount can be applied only once per customer.
     */
    private Boolean appliesOncePerCustomer;

    /**
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    private DiscountMinimumRequirementInput minimumRequirement;

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    private DiscountCustomerGetsInput customerGets;

    /**
     * The customers that can use the discount.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * The code to use the discount.
     */
    private String code;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    private Integer recurringCycleLimit;

    public DiscountCodeBasicInput build() {
      DiscountCodeBasicInput result = new DiscountCodeBasicInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.minimumRequirement = this.minimumRequirement;
      result.customerGets = this.customerGets;
      result.customerSelection = this.customerSelection;
      result.code = this.code;
      result.recurringCycleLimit = this.recurringCycleLimit;
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
     * The title of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time when the discount starts.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
     */
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    /**
     * Whether the discount can be applied only once per customer.
     */
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    /**
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
      return this;
    }

    /**
     * The customers that can use the discount.
     */
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The code to use the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
