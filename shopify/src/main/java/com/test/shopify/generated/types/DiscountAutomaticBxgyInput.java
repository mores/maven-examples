package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update an automatic Buy X, Get Y (BXGY) discount.
 */
public class DiscountAutomaticBxgyInput {
  /**
   * Determines which discount classes the discount can combine with.
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * The date and time when the discount starts.
   */
  private OffsetDateTime startsAt;

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * The title of the discount.
   */
  private String title;

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  private String usesPerOrderLimit;

  /**
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  private DiscountCustomerBuysInput customerBuys;

  /**
   * The qualifying items in an order, the quantity of each one, and the total value of the discount.
   */
  private DiscountCustomerGetsInput customerGets;

  public DiscountAutomaticBxgyInput() {
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
   * The title of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  public String getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(String usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
  }

  /**
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  public DiscountCustomerBuysInput getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
    this.customerBuys = customerBuys;
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

  @Override
  public String toString() {
    return "DiscountAutomaticBxgyInput{combinesWith='" + combinesWith + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', title='" + title + "', usesPerOrderLimit='" + usesPerOrderLimit + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgyInput that = (DiscountAutomaticBxgyInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(title, that.title) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, startsAt, endsAt, title, usesPerOrderLimit, customerBuys, customerGets);
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
     * The date and time when the discount starts.
     */
    private OffsetDateTime startsAt;

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * The title of the discount.
     */
    private String title;

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    private String usesPerOrderLimit;

    /**
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    private DiscountCustomerBuysInput customerBuys;

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    private DiscountCustomerGetsInput customerGets;

    public DiscountAutomaticBxgyInput build() {
      DiscountAutomaticBxgyInput result = new DiscountAutomaticBxgyInput();
      result.combinesWith = this.combinesWith;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.title = this.title;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
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
     * The title of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    public Builder usesPerOrderLimit(String usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }

    /**
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    public Builder customerBuys(DiscountCustomerBuysInput customerBuys) {
      this.customerBuys = customerBuys;
      return this;
    }

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
      return this;
    }
  }
}
