package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A fulfillment hold currently applied on a fulfillment order.
 */
public class FulfillmentHold {
  /**
   * The name of the app or service that applied the fulfillment hold.
   */
  private String heldBy;

  /**
   * The reason for the fulfillment hold.
   */
  private FulfillmentHoldReason reason;

  /**
   * Additional information about the fulfillment hold reason.
   */
  private String reasonNotes;

  public FulfillmentHold() {
  }

  /**
   * The name of the app or service that applied the fulfillment hold.
   */
  public String getHeldBy() {
    return heldBy;
  }

  public void setHeldBy(String heldBy) {
    this.heldBy = heldBy;
  }

  /**
   * The reason for the fulfillment hold.
   */
  public FulfillmentHoldReason getReason() {
    return reason;
  }

  public void setReason(FulfillmentHoldReason reason) {
    this.reason = reason;
  }

  /**
   * Additional information about the fulfillment hold reason.
   */
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  @Override
  public String toString() {
    return "FulfillmentHold{heldBy='" + heldBy + "', reason='" + reason + "', reasonNotes='" + reasonNotes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentHold that = (FulfillmentHold) o;
    return Objects.equals(heldBy, that.heldBy) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(reasonNotes, that.reasonNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heldBy, reason, reasonNotes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the app or service that applied the fulfillment hold.
     */
    private String heldBy;

    /**
     * The reason for the fulfillment hold.
     */
    private FulfillmentHoldReason reason;

    /**
     * Additional information about the fulfillment hold reason.
     */
    private String reasonNotes;

    public FulfillmentHold build() {
      FulfillmentHold result = new FulfillmentHold();
      result.heldBy = this.heldBy;
      result.reason = this.reason;
      result.reasonNotes = this.reasonNotes;
      return result;
    }

    /**
     * The name of the app or service that applied the fulfillment hold.
     */
    public Builder heldBy(String heldBy) {
      this.heldBy = heldBy;
      return this;
    }

    /**
     * The reason for the fulfillment hold.
     */
    public Builder reason(FulfillmentHoldReason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Additional information about the fulfillment hold reason.
     */
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }
  }
}
