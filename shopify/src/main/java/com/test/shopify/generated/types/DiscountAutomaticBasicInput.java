package com.test.shopify.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update an automatic basic discount.
 */
public class DiscountAutomaticBasicInput {
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
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  private DiscountMinimumRequirementInput minimumRequirement;

  /**
   * Information about the qualifying items and their discount.
   */
  private DiscountCustomerGetsInput customerGets;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  private Integer recurringCycleLimit;

  public DiscountAutomaticBasicInput() {
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
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  public DiscountMinimumRequirementInput getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  /**
   * Information about the qualifying items and their discount.
   */
  public DiscountCustomerGetsInput getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGetsInput customerGets) {
    this.customerGets = customerGets;
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
    return "DiscountAutomaticBasicInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', minimumRequirement='" + minimumRequirement + "', customerGets='" + customerGets + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBasicInput that = (DiscountAutomaticBasicInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, minimumRequirement, customerGets, recurringCycleLimit);
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
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    private DiscountMinimumRequirementInput minimumRequirement;

    /**
     * Information about the qualifying items and their discount.
     */
    private DiscountCustomerGetsInput customerGets;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    private Integer recurringCycleLimit;

    public DiscountAutomaticBasicInput build() {
      DiscountAutomaticBasicInput result = new DiscountAutomaticBasicInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.minimumRequirement = this.minimumRequirement;
      result.customerGets = this.customerGets;
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
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    /**
     * Information about the qualifying items and their discount.
     */
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
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
