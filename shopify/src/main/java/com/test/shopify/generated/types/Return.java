package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a return.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Return implements com.test.shopify.generated.types.Node {
  /**
   * Additional information about the declined return.
   */
  private ReturnDecline decline;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the return.
   */
  private String name;

  /**
   * The order that the return belongs to.
   */
  private Order order;

  /**
   * The list of refunds associated with the return.
   */
  private RefundConnection refunds;

  /**
   * The return line items attached to the return.
   */
  private ReturnLineItemConnection returnLineItems;

  /**
   * The list of reverse fulfillment orders for the return.
   */
  private ReverseFulfillmentOrderConnection reverseFulfillmentOrders;

  /**
   * The status of the return.
   */
  private ReturnStatus status;

  /**
   * A suggested refund for the return.
   */
  private SuggestedReturnRefund suggestedRefund;

  /**
   * The sum of all return line item quantities for the return.
   */
  private int totalQuantity;

  public Return() {
  }

  /**
   * Additional information about the declined return.
   */
  public ReturnDecline getDecline() {
    return decline;
  }

  public void setDecline(ReturnDecline decline) {
    this.decline = decline;
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
   * The name of the return.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order that the return belongs to.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The list of refunds associated with the return.
   */
  public RefundConnection getRefunds() {
    return refunds;
  }

  public void setRefunds(RefundConnection refunds) {
    this.refunds = refunds;
  }

  /**
   * The return line items attached to the return.
   */
  public ReturnLineItemConnection getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(ReturnLineItemConnection returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  /**
   * The list of reverse fulfillment orders for the return.
   */
  public ReverseFulfillmentOrderConnection getReverseFulfillmentOrders() {
    return reverseFulfillmentOrders;
  }

  public void setReverseFulfillmentOrders(
      ReverseFulfillmentOrderConnection reverseFulfillmentOrders) {
    this.reverseFulfillmentOrders = reverseFulfillmentOrders;
  }

  /**
   * The status of the return.
   */
  public ReturnStatus getStatus() {
    return status;
  }

  public void setStatus(ReturnStatus status) {
    this.status = status;
  }

  /**
   * A suggested refund for the return.
   */
  public SuggestedReturnRefund getSuggestedRefund() {
    return suggestedRefund;
  }

  public void setSuggestedRefund(SuggestedReturnRefund suggestedRefund) {
    this.suggestedRefund = suggestedRefund;
  }

  /**
   * The sum of all return line item quantities for the return.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "Return{decline='" + decline + "', id='" + id + "', name='" + name + "', order='" + order + "', refunds='" + refunds + "', returnLineItems='" + returnLineItems + "', reverseFulfillmentOrders='" + reverseFulfillmentOrders + "', status='" + status + "', suggestedRefund='" + suggestedRefund + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Return that = (Return) o;
    return Objects.equals(decline, that.decline) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(order, that.order) &&
        Objects.equals(refunds, that.refunds) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(reverseFulfillmentOrders, that.reverseFulfillmentOrders) &&
        Objects.equals(status, that.status) &&
        Objects.equals(suggestedRefund, that.suggestedRefund) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(decline, id, name, order, refunds, returnLineItems, reverseFulfillmentOrders, status, suggestedRefund, totalQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Additional information about the declined return.
     */
    private ReturnDecline decline;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the return.
     */
    private String name;

    /**
     * The order that the return belongs to.
     */
    private Order order;

    /**
     * The list of refunds associated with the return.
     */
    private RefundConnection refunds;

    /**
     * The return line items attached to the return.
     */
    private ReturnLineItemConnection returnLineItems;

    /**
     * The list of reverse fulfillment orders for the return.
     */
    private ReverseFulfillmentOrderConnection reverseFulfillmentOrders;

    /**
     * The status of the return.
     */
    private ReturnStatus status;

    /**
     * A suggested refund for the return.
     */
    private SuggestedReturnRefund suggestedRefund;

    /**
     * The sum of all return line item quantities for the return.
     */
    private int totalQuantity;

    public Return build() {
      Return result = new Return();
      result.decline = this.decline;
      result.id = this.id;
      result.name = this.name;
      result.order = this.order;
      result.refunds = this.refunds;
      result.returnLineItems = this.returnLineItems;
      result.reverseFulfillmentOrders = this.reverseFulfillmentOrders;
      result.status = this.status;
      result.suggestedRefund = this.suggestedRefund;
      result.totalQuantity = this.totalQuantity;
      return result;
    }

    /**
     * Additional information about the declined return.
     */
    public Builder decline(ReturnDecline decline) {
      this.decline = decline;
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
     * The name of the return.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The order that the return belongs to.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of refunds associated with the return.
     */
    public Builder refunds(RefundConnection refunds) {
      this.refunds = refunds;
      return this;
    }

    /**
     * The return line items attached to the return.
     */
    public Builder returnLineItems(ReturnLineItemConnection returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    /**
     * The list of reverse fulfillment orders for the return.
     */
    public Builder reverseFulfillmentOrders(
        ReverseFulfillmentOrderConnection reverseFulfillmentOrders) {
      this.reverseFulfillmentOrders = reverseFulfillmentOrders;
      return this;
    }

    /**
     * The status of the return.
     */
    public Builder status(ReturnStatus status) {
      this.status = status;
      return this;
    }

    /**
     * A suggested refund for the return.
     */
    public Builder suggestedRefund(SuggestedReturnRefund suggestedRefund) {
      this.suggestedRefund = suggestedRefund;
      return this;
    }

    /**
     * The sum of all return line item quantities for the return.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
