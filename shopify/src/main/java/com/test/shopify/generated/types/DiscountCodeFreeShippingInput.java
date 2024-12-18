package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update a free shipping code discount.
 */
public class DiscountCodeFreeShippingInput {
  /**
   * Determines which discount classes the shipping discount can combine with.
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
   * The code to use the discount.
   */
  private String code;

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
   * The customers that are eligible to use the discount.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * A list of destinations where the discount will apply.
   */
  private DiscountShippingDestinationSelectionInput destination;

  /**
   * The maximum shipping price that qualifies for the discount.
   */
  private String maximumShippingPrice;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  private Integer recurringCycleLimit;

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  private Boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription items.
   */
  private Boolean appliesOnSubscription;

  public DiscountCodeFreeShippingInput() {
  }

  /**
   * Determines which discount classes the shipping discount can combine with.
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
   * The code to use the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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
   * The customers that are eligible to use the discount.
   */
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * A list of destinations where the discount will apply.
   */
  public DiscountShippingDestinationSelectionInput getDestination() {
    return destination;
  }

  public void setDestination(DiscountShippingDestinationSelectionInput destination) {
    this.destination = destination;
  }

  /**
   * The maximum shipping price that qualifies for the discount.
   */
  public String getMaximumShippingPrice() {
    return maximumShippingPrice;
  }

  public void setMaximumShippingPrice(String maximumShippingPrice) {
    this.maximumShippingPrice = maximumShippingPrice;
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

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription items.
   */
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCodeFreeShippingInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', code='" + code + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', minimumRequirement='" + minimumRequirement + "', customerSelection='" + customerSelection + "', destination='" + destination + "', maximumShippingPrice='" + maximumShippingPrice + "', recurringCycleLimit='" + recurringCycleLimit + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeFreeShippingInput that = (DiscountCodeFreeShippingInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(code, that.code) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(maximumShippingPrice, that.maximumShippingPrice) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, code, usageLimit, appliesOncePerCustomer, minimumRequirement, customerSelection, destination, maximumShippingPrice, recurringCycleLimit, appliesOnOneTimePurchase, appliesOnSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Determines which discount classes the shipping discount can combine with.
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
     * The code to use the discount.
     */
    private String code;

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
     * The customers that are eligible to use the discount.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * A list of destinations where the discount will apply.
     */
    private DiscountShippingDestinationSelectionInput destination;

    /**
     * The maximum shipping price that qualifies for the discount.
     */
    private String maximumShippingPrice;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    private Integer recurringCycleLimit;

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    private Boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription items.
     */
    private Boolean appliesOnSubscription;

    public DiscountCodeFreeShippingInput build() {
      DiscountCodeFreeShippingInput result = new DiscountCodeFreeShippingInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.code = this.code;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.minimumRequirement = this.minimumRequirement;
      result.customerSelection = this.customerSelection;
      result.destination = this.destination;
      result.maximumShippingPrice = this.maximumShippingPrice;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      return result;
    }

    /**
     * Determines which discount classes the shipping discount can combine with.
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
     * The code to use the discount.
     */
    public Builder code(String code) {
      this.code = code;
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
     * The customers that are eligible to use the discount.
     */
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * A list of destinations where the discount will apply.
     */
    public Builder destination(DiscountShippingDestinationSelectionInput destination) {
      this.destination = destination;
      return this;
    }

    /**
     * The maximum shipping price that qualifies for the discount.
     */
    public Builder maximumShippingPrice(String maximumShippingPrice) {
      this.maximumShippingPrice = maximumShippingPrice;
      return this;
    }

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription items.
     */
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }
  }
}
