package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to create or update a BXGY code discount.
 */
public class DiscountCodeBxgyInput {
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
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  private DiscountCustomerBuysInput customerBuys;

  /**
   * The qualifying items that will be discounted, the quantity of each one, and the total value of the discount.
   */
  private DiscountCustomerGetsInput customerGets;

  /**
   * The customers that are eligible to use the discount.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * The code to use the discount.
   */
  private String code;

  /**
   * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
   */
  private Integer usageLimit;

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  private Integer usesPerOrderLimit;

  /**
   * Whether the discount can be applied only once per customer.
   */
  private Boolean appliesOncePerCustomer;

  public DiscountCodeBxgyInput() {
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
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  public DiscountCustomerBuysInput getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
    this.customerBuys = customerBuys;
  }

  /**
   * The qualifying items that will be discounted, the quantity of each one, and the total value of the discount.
   */
  public DiscountCustomerGetsInput getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGetsInput customerGets) {
    this.customerGets = customerGets;
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
   * The maximum number of times that the discount can be applied to an order.
   */
  public Integer getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(Integer usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
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

  @Override
  public String toString() {
    return "DiscountCodeBxgyInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "', customerSelection='" + customerSelection + "', code='" + code + "', usageLimit='" + usageLimit + "', usesPerOrderLimit='" + usesPerOrderLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBxgyInput that = (DiscountCodeBxgyInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(code, that.code) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, customerBuys, customerGets, customerSelection, code, usageLimit, usesPerOrderLimit, appliesOncePerCustomer);
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
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    private DiscountCustomerBuysInput customerBuys;

    /**
     * The qualifying items that will be discounted, the quantity of each one, and the total value of the discount.
     */
    private DiscountCustomerGetsInput customerGets;

    /**
     * The customers that are eligible to use the discount.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * The code to use the discount.
     */
    private String code;

    /**
     * The maximum number of times that the discount can be used. For open-ended discounts, use `null`.
     */
    private Integer usageLimit;

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    private Integer usesPerOrderLimit;

    /**
     * Whether the discount can be applied only once per customer.
     */
    private Boolean appliesOncePerCustomer;

    public DiscountCodeBxgyInput build() {
      DiscountCodeBxgyInput result = new DiscountCodeBxgyInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      result.customerSelection = this.customerSelection;
      result.code = this.code;
      result.usageLimit = this.usageLimit;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
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
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    public Builder customerBuys(DiscountCustomerBuysInput customerBuys) {
      this.customerBuys = customerBuys;
      return this;
    }

    /**
     * The qualifying items that will be discounted, the quantity of each one, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
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
     * The maximum number of times that the discount can be applied to an order.
     */
    public Builder usesPerOrderLimit(Integer usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }

    /**
     * Whether the discount can be applied only once per customer.
     */
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }
  }
}
