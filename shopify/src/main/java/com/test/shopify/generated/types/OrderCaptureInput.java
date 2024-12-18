package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the authorized transaction to capture and the total amount to capture from it.
 */
public class OrderCaptureInput {
  /**
   * The ID of the order to capture.
   */
  private String id;

  /**
   * The ID of the authorized transaction to capture.
   */
  private String parentTransactionId;

  /**
   * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
   */
  private String amount;

  /**
   * The currency (in ISO format) that's used to capture the order. This must be
   * the presentment currency (the currency used by the customer) and is a required
   * field for orders where the currency and presentment currency differ.
   */
  private CurrencyCode currency;

  public OrderCaptureInput() {
  }

  /**
   * The ID of the order to capture.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the authorized transaction to capture.
   */
  public String getParentTransactionId() {
    return parentTransactionId;
  }

  public void setParentTransactionId(String parentTransactionId) {
    this.parentTransactionId = parentTransactionId;
  }

  /**
   * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The currency (in ISO format) that's used to capture the order. This must be
   * the presentment currency (the currency used by the customer) and is a required
   * field for orders where the currency and presentment currency differ.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "OrderCaptureInput{id='" + id + "', parentTransactionId='" + parentTransactionId + "', amount='" + amount + "', currency='" + currency + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCaptureInput that = (OrderCaptureInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(parentTransactionId, that.parentTransactionId) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(currency, that.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentTransactionId, amount, currency);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the order to capture.
     */
    private String id;

    /**
     * The ID of the authorized transaction to capture.
     */
    private String parentTransactionId;

    /**
     * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
     */
    private String amount;

    /**
     * The currency (in ISO format) that's used to capture the order. This must be
     * the presentment currency (the currency used by the customer) and is a required
     * field for orders where the currency and presentment currency differ.
     */
    private CurrencyCode currency;

    public OrderCaptureInput build() {
      OrderCaptureInput result = new OrderCaptureInput();
      result.id = this.id;
      result.parentTransactionId = this.parentTransactionId;
      result.amount = this.amount;
      result.currency = this.currency;
      return result;
    }

    /**
     * The ID of the order to capture.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the authorized transaction to capture.
     */
    public Builder parentTransactionId(String parentTransactionId) {
      this.parentTransactionId = parentTransactionId;
      return this;
    }

    /**
     * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The currency (in ISO format) that's used to capture the order. This must be
     * the presentment currency (the currency used by the customer) and is a required
     * field for orders where the currency and presentment currency differ.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }
  }
}
