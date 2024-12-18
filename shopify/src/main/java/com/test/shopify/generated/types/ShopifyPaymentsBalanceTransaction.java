package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A transaction that contributes to a Shopify Payments account balance.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsBalanceTransaction implements com.test.shopify.generated.types.Node {
  /**
   * The adjustment orders associated to the transaction.
   */
  private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The net amount contributing to the merchant's balance.
   */
  private MoneyV2 net;

  /**
   * The date and time when the balance transaction was processed.
   */
  private OffsetDateTime transactionDate;

  public ShopifyPaymentsBalanceTransaction() {
  }

  /**
   * The adjustment orders associated to the transaction.
   */
  public List<ShopifyPaymentsAdjustmentOrder> getAdjustmentsOrders() {
    return adjustmentsOrders;
  }

  public void setAdjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
    this.adjustmentsOrders = adjustmentsOrders;
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
   * The net amount contributing to the merchant's balance.
   */
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  /**
   * The date and time when the balance transaction was processed.
   */
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsBalanceTransaction{adjustmentsOrders='" + adjustmentsOrders + "', id='" + id + "', net='" + net + "', transactionDate='" + transactionDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsBalanceTransaction that = (ShopifyPaymentsBalanceTransaction) o;
    return Objects.equals(adjustmentsOrders, that.adjustmentsOrders) &&
        Objects.equals(id, that.id) &&
        Objects.equals(net, that.net) &&
        Objects.equals(transactionDate, that.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentsOrders, id, net, transactionDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The adjustment orders associated to the transaction.
     */
    private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The net amount contributing to the merchant's balance.
     */
    private MoneyV2 net;

    /**
     * The date and time when the balance transaction was processed.
     */
    private OffsetDateTime transactionDate;

    public ShopifyPaymentsBalanceTransaction build() {
      ShopifyPaymentsBalanceTransaction result = new ShopifyPaymentsBalanceTransaction();
      result.adjustmentsOrders = this.adjustmentsOrders;
      result.id = this.id;
      result.net = this.net;
      result.transactionDate = this.transactionDate;
      return result;
    }

    /**
     * The adjustment orders associated to the transaction.
     */
    public Builder adjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
      this.adjustmentsOrders = adjustmentsOrders;
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
     * The net amount contributing to the merchant's balance.
     */
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    /**
     * The date and time when the balance transaction was processed.
     */
    public Builder transactionDate(OffsetDateTime transactionDate) {
      this.transactionDate = transactionDate;
      return this;
    }
  }
}
