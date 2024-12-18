package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * An automatic discount that offers customers free shipping on their order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticFreeShipping implements Discount, DiscountAutomatic {
  /**
   * Whether the discount applies on regular one-time-purchase shipping lines.
   */
  private boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription shipping lines.
   */
  private boolean appliesOnSubscription;

  /**
   * The number of times that the discount has been used.
   * For example, if a "Buy 3, Get 1 Free" t-shirt discount
   * is automatically applied in 200 transactions, then the
   * discount has been used 200 times.
   * This value is updated asynchronously. As a result,
   * it might be lower than the actual usage count until the
   * asynchronous process is completed.
   */
  private int asyncUsageCount;

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWith combinesWith;

  /**
   * The date and time when the discount was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A shipping destination that qualifies for the discount.
   */
  private DiscountShippingDestinationSelection destinationSelection;

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private ShippingDiscountClass discountClass;

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * Indicates whether there are any timeline comments on the discount.
   */
  private boolean hasTimelineComment;

  /**
   * The maximum shipping price amount accepted to qualify for the discount.
   */
  private MoneyV2 maximumShippingPrice;

  /**
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  private DiscountMinimumRequirement minimumRequirement;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  private int recurringCycleLimit;

  /**
   * A short summary of the discount.
   */
  private String shortSummary;

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  private OffsetDateTime startsAt;

  /**
   * The status of the discount that describes its availability,
   * expiration, or pending activation.
   */
  private DiscountStatus status;

  /**
   * A detailed explanation of what the discount is,
   * who can use it, when and where it applies, and any associated
   * rules or limitations.
   */
  private String summary;

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  private String title;

  /**
   * The total sales from orders where the discount was used.
   */
  private MoneyV2 totalSales;

  /**
   * The date and time when the discount was updated.
   */
  private OffsetDateTime updatedAt;

  public DiscountAutomaticFreeShipping() {
  }

  /**
   * Whether the discount applies on regular one-time-purchase shipping lines.
   */
  public boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription shipping lines.
   */
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * The number of times that the discount has been used.
   * For example, if a "Buy 3, Get 1 Free" t-shirt discount
   * is automatically applied in 200 transactions, then the
   * discount has been used 200 times.
   * This value is updated asynchronously. As a result,
   * it might be lower than the actual usage count until the
   * asynchronous process is completed.
   */
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The date and time when the discount was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A shipping destination that qualifies for the discount.
   */
  public DiscountShippingDestinationSelection getDestinationSelection() {
    return destinationSelection;
  }

  public void setDestinationSelection(DiscountShippingDestinationSelection destinationSelection) {
    this.destinationSelection = destinationSelection;
  }

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public ShippingDiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(ShippingDiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * Indicates whether there are any timeline comments on the discount.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  /**
   * The maximum shipping price amount accepted to qualify for the discount.
   */
  public MoneyV2 getMaximumShippingPrice() {
    return maximumShippingPrice;
  }

  public void setMaximumShippingPrice(MoneyV2 maximumShippingPrice) {
    this.maximumShippingPrice = maximumShippingPrice;
  }

  /**
   * The minimum subtotal or quantity that's required for the discount to be applied.
   */
  public DiscountMinimumRequirement getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirement minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   */
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  /**
   * A short summary of the discount.
   */
  public String getShortSummary() {
    return shortSummary;
  }

  public void setShortSummary(String shortSummary) {
    this.shortSummary = shortSummary;
  }

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The status of the discount that describes its availability,
   * expiration, or pending activation.
   */
  public DiscountStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountStatus status) {
    this.status = status;
  }

  /**
   * A detailed explanation of what the discount is,
   * who can use it, when and where it applies, and any associated
   * rules or limitations.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total sales from orders where the discount was used.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  /**
   * The date and time when the discount was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticFreeShipping{appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', destinationSelection='" + destinationSelection + "', discountClass='" + discountClass + "', endsAt='" + endsAt + "', hasTimelineComment='" + hasTimelineComment + "', maximumShippingPrice='" + maximumShippingPrice + "', minimumRequirement='" + minimumRequirement + "', recurringCycleLimit='" + recurringCycleLimit + "', shortSummary='" + shortSummary + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', totalSales='" + totalSales + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticFreeShipping that = (DiscountAutomaticFreeShipping) o;
    return appliesOnOneTimePurchase == that.appliesOnOneTimePurchase &&
        appliesOnSubscription == that.appliesOnSubscription &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(destinationSelection, that.destinationSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(endsAt, that.endsAt) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(maximumShippingPrice, that.maximumShippingPrice) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        recurringCycleLimit == that.recurringCycleLimit &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOnOneTimePurchase, appliesOnSubscription, asyncUsageCount, combinesWith, createdAt, destinationSelection, discountClass, endsAt, hasTimelineComment, maximumShippingPrice, minimumRequirement, recurringCycleLimit, shortSummary, startsAt, status, summary, title, totalSales, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount applies on regular one-time-purchase shipping lines.
     */
    private boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription shipping lines.
     */
    private boolean appliesOnSubscription;

    /**
     * The number of times that the discount has been used.
     * For example, if a "Buy 3, Get 1 Free" t-shirt discount
     * is automatically applied in 200 transactions, then the
     * discount has been used 200 times.
     * This value is updated asynchronously. As a result,
     * it might be lower than the actual usage count until the
     * asynchronous process is completed.
     */
    private int asyncUsageCount;

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWith combinesWith;

    /**
     * The date and time when the discount was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A shipping destination that qualifies for the discount.
     */
    private DiscountShippingDestinationSelection destinationSelection;

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private ShippingDiscountClass discountClass;

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * Indicates whether there are any timeline comments on the discount.
     */
    private boolean hasTimelineComment;

    /**
     * The maximum shipping price amount accepted to qualify for the discount.
     */
    private MoneyV2 maximumShippingPrice;

    /**
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    private DiscountMinimumRequirement minimumRequirement;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    private int recurringCycleLimit;

    /**
     * A short summary of the discount.
     */
    private String shortSummary;

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    private OffsetDateTime startsAt;

    /**
     * The status of the discount that describes its availability,
     * expiration, or pending activation.
     */
    private DiscountStatus status;

    /**
     * A detailed explanation of what the discount is,
     * who can use it, when and where it applies, and any associated
     * rules or limitations.
     */
    private String summary;

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    private String title;

    /**
     * The total sales from orders where the discount was used.
     */
    private MoneyV2 totalSales;

    /**
     * The date and time when the discount was updated.
     */
    private OffsetDateTime updatedAt;

    public DiscountAutomaticFreeShipping build() {
      DiscountAutomaticFreeShipping result = new DiscountAutomaticFreeShipping();
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.destinationSelection = this.destinationSelection;
      result.discountClass = this.discountClass;
      result.endsAt = this.endsAt;
      result.hasTimelineComment = this.hasTimelineComment;
      result.maximumShippingPrice = this.maximumShippingPrice;
      result.minimumRequirement = this.minimumRequirement;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shortSummary = this.shortSummary;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Whether the discount applies on regular one-time-purchase shipping lines.
     */
    public Builder appliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription shipping lines.
     */
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * The number of times that the discount has been used.
     * For example, if a "Buy 3, Get 1 Free" t-shirt discount
     * is automatically applied in 200 transactions, then the
     * discount has been used 200 times.
     * This value is updated asynchronously. As a result,
     * it might be lower than the actual usage count until the
     * asynchronous process is completed.
     */
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The date and time when the discount was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A shipping destination that qualifies for the discount.
     */
    public Builder destinationSelection(DiscountShippingDestinationSelection destinationSelection) {
      this.destinationSelection = destinationSelection;
      return this;
    }

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(ShippingDiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Indicates whether there are any timeline comments on the discount.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    /**
     * The maximum shipping price amount accepted to qualify for the discount.
     */
    public Builder maximumShippingPrice(MoneyV2 maximumShippingPrice) {
      this.maximumShippingPrice = maximumShippingPrice;
      return this;
    }

    /**
     * The minimum subtotal or quantity that's required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirement minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     */
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * A short summary of the discount.
     */
    public Builder shortSummary(String shortSummary) {
      this.shortSummary = shortSummary;
      return this;
    }

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The status of the discount that describes its availability,
     * expiration, or pending activation.
     */
    public Builder status(DiscountStatus status) {
      this.status = status;
      return this;
    }

    /**
     * A detailed explanation of what the discount is,
     * who can use it, when and where it applies, and any associated
     * rules or limitations.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total sales from orders where the discount was used.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    /**
     * The date and time when the discount was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
