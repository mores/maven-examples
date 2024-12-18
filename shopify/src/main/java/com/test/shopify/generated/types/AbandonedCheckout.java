package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A checkout that was abandoned by the customer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AbandonedCheckout implements com.test.shopify.generated.types.Navigable, com.test.shopify.generated.types.Node {
  /**
   * The URL for the buyer to recover their checkout.
   */
  private String abandonedCheckoutUrl;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of the line items in this checkout.
   */
  private AbandonedCheckoutLineItemConnection lineItems;

  /**
   * The number of products in the checkout.
   */
  private int lineItemsQuantity;

  /**
   * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
   */
  private MoneyBag totalPriceSet;

  public AbandonedCheckout() {
  }

  /**
   * The URL for the buyer to recover their checkout.
   */
  public String getAbandonedCheckoutUrl() {
    return abandonedCheckoutUrl;
  }

  public void setAbandonedCheckoutUrl(String abandonedCheckoutUrl) {
    this.abandonedCheckoutUrl = abandonedCheckoutUrl;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of the line items in this checkout.
   */
  public AbandonedCheckoutLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(AbandonedCheckoutLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The number of products in the checkout.
   */
  public int getLineItemsQuantity() {
    return lineItemsQuantity;
  }

  public void setLineItemsQuantity(int lineItemsQuantity) {
    this.lineItemsQuantity = lineItemsQuantity;
  }

  /**
   * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  @Override
  public String toString() {
    return "AbandonedCheckout{abandonedCheckoutUrl='" + abandonedCheckoutUrl + "', defaultCursor='" + defaultCursor + "', id='" + id + "', lineItems='" + lineItems + "', lineItemsQuantity='" + lineItemsQuantity + "', totalPriceSet='" + totalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckout that = (AbandonedCheckout) o;
    return Objects.equals(abandonedCheckoutUrl, that.abandonedCheckoutUrl) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        lineItemsQuantity == that.lineItemsQuantity &&
        Objects.equals(totalPriceSet, that.totalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedCheckoutUrl, defaultCursor, id, lineItems, lineItemsQuantity, totalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL for the buyer to recover their checkout.
     */
    private String abandonedCheckoutUrl;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of the line items in this checkout.
     */
    private AbandonedCheckoutLineItemConnection lineItems;

    /**
     * The number of products in the checkout.
     */
    private int lineItemsQuantity;

    /**
     * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
     */
    private MoneyBag totalPriceSet;

    public AbandonedCheckout build() {
      AbandonedCheckout result = new AbandonedCheckout();
      result.abandonedCheckoutUrl = this.abandonedCheckoutUrl;
      result.defaultCursor = this.defaultCursor;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.lineItemsQuantity = this.lineItemsQuantity;
      result.totalPriceSet = this.totalPriceSet;
      return result;
    }

    /**
     * The URL for the buyer to recover their checkout.
     */
    public Builder abandonedCheckoutUrl(String abandonedCheckoutUrl) {
      this.abandonedCheckoutUrl = abandonedCheckoutUrl;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of the line items in this checkout.
     */
    public Builder lineItems(AbandonedCheckoutLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The number of products in the checkout.
     */
    public Builder lineItemsQuantity(int lineItemsQuantity) {
      this.lineItemsQuantity = lineItemsQuantity;
      return this;
    }

    /**
     * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}
