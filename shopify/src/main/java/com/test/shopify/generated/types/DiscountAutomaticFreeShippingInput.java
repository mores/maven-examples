package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update free shipping automatic discount.
 */
public class DiscountAutomaticFreeShippingInput {
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
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  private DiscountMinimumRequirementInput minimumRequirement;

  /**
   * A list of destinations where the discount will apply.
   */
  private DiscountShippingDestinationSelectionInput destination;

  /**
   * The maximum shipping price that qualifies for the discount.
   */
  private String maximumShippingPrice;

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  private Boolean appliesOnOneTimePurchase = true;

  /**
   * Whether the discount applies on subscription items.
   */
  private Boolean appliesOnSubscription = false;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  private Integer recurringCycleLimit;

  public DiscountAutomaticFreeShippingInput() {
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
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  public DiscountMinimumRequirementInput getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
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
    return "DiscountAutomaticFreeShippingInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', minimumRequirement='" + minimumRequirement + "', destination='" + destination + "', maximumShippingPrice='" + maximumShippingPrice + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticFreeShippingInput that = (DiscountAutomaticFreeShippingInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(maximumShippingPrice, that.maximumShippingPrice) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, minimumRequirement, destination, maximumShippingPrice, appliesOnOneTimePurchase, appliesOnSubscription, recurringCycleLimit);
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
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    private DiscountMinimumRequirementInput minimumRequirement;

    /**
     * A list of destinations where the discount will apply.
     */
    private DiscountShippingDestinationSelectionInput destination;

    /**
     * The maximum shipping price that qualifies for the discount.
     */
    private String maximumShippingPrice;

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    private Boolean appliesOnOneTimePurchase = true;

    /**
     * Whether the discount applies on subscription items.
     */
    private Boolean appliesOnSubscription = false;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    private Integer recurringCycleLimit;

    public DiscountAutomaticFreeShippingInput build() {
      DiscountAutomaticFreeShippingInput result = new DiscountAutomaticFreeShippingInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.minimumRequirement = this.minimumRequirement;
      result.destination = this.destination;
      result.maximumShippingPrice = this.maximumShippingPrice;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.recurringCycleLimit = this.recurringCycleLimit;
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
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
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

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
