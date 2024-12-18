package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A return line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnLineItem implements com.test.shopify.generated.types.Node {
  /**
   * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
   */
  private String customerNote;

  /**
   * The fulfillment line item from which items are returned.
   */
  private FulfillmentLineItem fulfillmentLineItem;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The quantity being returned.
   */
  private int quantity;

  /**
   * The quantity that can be refunded.
   */
  private int refundableQuantity;

  /**
   * The quantity that was refunded.
   */
  private int refundedQuantity;

  /**
   * The reason for returning the item.
   */
  private ReturnReason returnReason;

  /**
   * Additional information about the reason for the return. Maximum length: 255 characters.
   */
  private String returnReasonNote;

  /**
   * The total weight of the item.
   */
  private Weight totalWeight;

  /**
   * The total line price after all discounts on the line item, including both line
   * item level discounts and code-based line item discounts, are applied.
   */
  private MoneyBag withCodeDiscountedTotalPriceSet;

  public ReturnLineItem() {
  }

  /**
   * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
   */
  public String getCustomerNote() {
    return customerNote;
  }

  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }

  /**
   * The fulfillment line item from which items are returned.
   */
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
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
   * The quantity being returned.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity that can be refunded.
   */
  public int getRefundableQuantity() {
    return refundableQuantity;
  }

  public void setRefundableQuantity(int refundableQuantity) {
    this.refundableQuantity = refundableQuantity;
  }

  /**
   * The quantity that was refunded.
   */
  public int getRefundedQuantity() {
    return refundedQuantity;
  }

  public void setRefundedQuantity(int refundedQuantity) {
    this.refundedQuantity = refundedQuantity;
  }

  /**
   * The reason for returning the item.
   */
  public ReturnReason getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }

  /**
   * Additional information about the reason for the return. Maximum length: 255 characters.
   */
  public String getReturnReasonNote() {
    return returnReasonNote;
  }

  public void setReturnReasonNote(String returnReasonNote) {
    this.returnReasonNote = returnReasonNote;
  }

  /**
   * The total weight of the item.
   */
  public Weight getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

  /**
   * The total line price after all discounts on the line item, including both line
   * item level discounts and code-based line item discounts, are applied.
   */
  public MoneyBag getWithCodeDiscountedTotalPriceSet() {
    return withCodeDiscountedTotalPriceSet;
  }

  public void setWithCodeDiscountedTotalPriceSet(MoneyBag withCodeDiscountedTotalPriceSet) {
    this.withCodeDiscountedTotalPriceSet = withCodeDiscountedTotalPriceSet;
  }

  @Override
  public String toString() {
    return "ReturnLineItem{customerNote='" + customerNote + "', fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', refundedQuantity='" + refundedQuantity + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', totalWeight='" + totalWeight + "', withCodeDiscountedTotalPriceSet='" + withCodeDiscountedTotalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItem that = (ReturnLineItem) o;
    return Objects.equals(customerNote, that.customerNote) &&
        Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        refundedQuantity == that.refundedQuantity &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(totalWeight, that.totalWeight) &&
        Objects.equals(withCodeDiscountedTotalPriceSet, that.withCodeDiscountedTotalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNote, fulfillmentLineItem, id, quantity, refundableQuantity, refundedQuantity, returnReason, returnReasonNote, totalWeight, withCodeDiscountedTotalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
     */
    private String customerNote;

    /**
     * The fulfillment line item from which items are returned.
     */
    private FulfillmentLineItem fulfillmentLineItem;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The quantity being returned.
     */
    private int quantity;

    /**
     * The quantity that can be refunded.
     */
    private int refundableQuantity;

    /**
     * The quantity that was refunded.
     */
    private int refundedQuantity;

    /**
     * The reason for returning the item.
     */
    private ReturnReason returnReason;

    /**
     * Additional information about the reason for the return. Maximum length: 255 characters.
     */
    private String returnReasonNote;

    /**
     * The total weight of the item.
     */
    private Weight totalWeight;

    /**
     * The total line price after all discounts on the line item, including both line
     * item level discounts and code-based line item discounts, are applied.
     */
    private MoneyBag withCodeDiscountedTotalPriceSet;

    public ReturnLineItem build() {
      ReturnLineItem result = new ReturnLineItem();
      result.customerNote = this.customerNote;
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.refundedQuantity = this.refundedQuantity;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.totalWeight = this.totalWeight;
      result.withCodeDiscountedTotalPriceSet = this.withCodeDiscountedTotalPriceSet;
      return result;
    }

    /**
     * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
     */
    public Builder customerNote(String customerNote) {
      this.customerNote = customerNote;
      return this;
    }

    /**
     * The fulfillment line item from which items are returned.
     */
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
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
     * The quantity being returned.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity that can be refunded.
     */
    public Builder refundableQuantity(int refundableQuantity) {
      this.refundableQuantity = refundableQuantity;
      return this;
    }

    /**
     * The quantity that was refunded.
     */
    public Builder refundedQuantity(int refundedQuantity) {
      this.refundedQuantity = refundedQuantity;
      return this;
    }

    /**
     * The reason for returning the item.
     */
    public Builder returnReason(ReturnReason returnReason) {
      this.returnReason = returnReason;
      return this;
    }

    /**
     * Additional information about the reason for the return. Maximum length: 255 characters.
     */
    public Builder returnReasonNote(String returnReasonNote) {
      this.returnReasonNote = returnReasonNote;
      return this;
    }

    /**
     * The total weight of the item.
     */
    public Builder totalWeight(Weight totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    /**
     * The total line price after all discounts on the line item, including both line
     * item level discounts and code-based line item discounts, are applied.
     */
    public Builder withCodeDiscountedTotalPriceSet(MoneyBag withCodeDiscountedTotalPriceSet) {
      this.withCodeDiscountedTotalPriceSet = withCodeDiscountedTotalPriceSet;
      return this;
    }
  }
}
