package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The adjustment order object.
 */
public class ShopifyPaymentsAdjustmentOrder {
  /**
   * The amount of the adjustment order.
   */
  private MoneyV2 amount;

  /**
   * The link to the adjustment order.
   */
  private String link;

  /**
   * The name of the adjustment order.
   */
  private String name;

  public ShopifyPaymentsAdjustmentOrder() {
  }

  /**
   * The amount of the adjustment order.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The link to the adjustment order.
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The name of the adjustment order.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAdjustmentOrder{amount='" + amount + "', link='" + link + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAdjustmentOrder that = (ShopifyPaymentsAdjustmentOrder) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(link, that.link) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, link, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the adjustment order.
     */
    private MoneyV2 amount;

    /**
     * The link to the adjustment order.
     */
    private String link;

    /**
     * The name of the adjustment order.
     */
    private String name;

    public ShopifyPaymentsAdjustmentOrder build() {
      ShopifyPaymentsAdjustmentOrder result = new ShopifyPaymentsAdjustmentOrder();
      result.amount = this.amount;
      result.link = this.link;
      result.name = this.name;
      return result;
    }

    /**
     * The amount of the adjustment order.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The link to the adjustment order.
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }

    /**
     * The name of the adjustment order.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
