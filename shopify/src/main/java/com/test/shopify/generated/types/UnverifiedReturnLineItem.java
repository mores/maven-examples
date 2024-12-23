package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An unverified return line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UnverifiedReturnLineItem implements com.test.shopify.generated.types.Node, com.test.shopify.generated.types.ReturnLineItemType {
  /**
   * A note from the customer that describes the item to be returned. Maximum length: 300 characters.
   */
  private String customerNote;

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
   * The unit price of the unverified return line item.
   */
  private MoneyV2 unitPrice;

  public UnverifiedReturnLineItem() {
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
   * The unit price of the unverified return line item.
   */
  public MoneyV2 getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(MoneyV2 unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "UnverifiedReturnLineItem{customerNote='" + customerNote + "', id='" + id + "', quantity='" + quantity + "', refundableQuantity='" + refundableQuantity + "', refundedQuantity='" + refundedQuantity + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', unitPrice='" + unitPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnverifiedReturnLineItem that = (UnverifiedReturnLineItem) o;
    return Objects.equals(customerNote, that.customerNote) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        refundableQuantity == that.refundableQuantity &&
        refundedQuantity == that.refundedQuantity &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(unitPrice, that.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNote, id, quantity, refundableQuantity, refundedQuantity, returnReason, returnReasonNote, unitPrice);
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
     * The unit price of the unverified return line item.
     */
    private MoneyV2 unitPrice;

    public UnverifiedReturnLineItem build() {
      UnverifiedReturnLineItem result = new UnverifiedReturnLineItem();
      result.customerNote = this.customerNote;
      result.id = this.id;
      result.quantity = this.quantity;
      result.refundableQuantity = this.refundableQuantity;
      result.refundedQuantity = this.refundedQuantity;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.unitPrice = this.unitPrice;
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
     * The unit price of the unverified return line item.
     */
    public Builder unitPrice(MoneyV2 unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }
  }
}
