package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to dispose a reverse delivery line item.
 */
public class ReverseDeliveryDisposeInput {
  /**
   * The ID of the reverse delivery line item.
   */
  private String reverseDeliveryLineItemId;

  /**
   * The quantity of the reverse delivery line item to dispose.
   */
  private int quantity;

  /**
   * The final arrangement for the reverse delivery line item.
   */
  private ReverseFulfillmentOrderDispositionType dispositionType;

  /**
   * The ID of the location where the reverse delivery line item is to be disposed. This is required
   *           when the disposition type is RESTOCKED.
   */
  private String locationId;

  public ReverseDeliveryDisposeInput() {
  }

  /**
   * The ID of the reverse delivery line item.
   */
  public String getReverseDeliveryLineItemId() {
    return reverseDeliveryLineItemId;
  }

  public void setReverseDeliveryLineItemId(String reverseDeliveryLineItemId) {
    this.reverseDeliveryLineItemId = reverseDeliveryLineItemId;
  }

  /**
   * The quantity of the reverse delivery line item to dispose.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The final arrangement for the reverse delivery line item.
   */
  public ReverseFulfillmentOrderDispositionType getDispositionType() {
    return dispositionType;
  }

  public void setDispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  /**
   * The ID of the location where the reverse delivery line item is to be disposed. This is required
   *           when the disposition type is RESTOCKED.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryDisposeInput{reverseDeliveryLineItemId='" + reverseDeliveryLineItemId + "', quantity='" + quantity + "', dispositionType='" + dispositionType + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryDisposeInput that = (ReverseDeliveryDisposeInput) o;
    return Objects.equals(reverseDeliveryLineItemId, that.reverseDeliveryLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(dispositionType, that.dispositionType) &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseDeliveryLineItemId, quantity, dispositionType, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the reverse delivery line item.
     */
    private String reverseDeliveryLineItemId;

    /**
     * The quantity of the reverse delivery line item to dispose.
     */
    private int quantity;

    /**
     * The final arrangement for the reverse delivery line item.
     */
    private ReverseFulfillmentOrderDispositionType dispositionType;

    /**
     * The ID of the location where the reverse delivery line item is to be disposed. This is required
     *           when the disposition type is RESTOCKED.
     */
    private String locationId;

    public ReverseDeliveryDisposeInput build() {
      ReverseDeliveryDisposeInput result = new ReverseDeliveryDisposeInput();
      result.reverseDeliveryLineItemId = this.reverseDeliveryLineItemId;
      result.quantity = this.quantity;
      result.dispositionType = this.dispositionType;
      result.locationId = this.locationId;
      return result;
    }

    /**
     * The ID of the reverse delivery line item.
     */
    public Builder reverseDeliveryLineItemId(String reverseDeliveryLineItemId) {
      this.reverseDeliveryLineItemId = reverseDeliveryLineItemId;
      return this;
    }

    /**
     * The quantity of the reverse delivery line item to dispose.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The final arrangement for the reverse delivery line item.
     */
    public Builder dispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
      this.dispositionType = dispositionType;
      return this;
    }

    /**
     * The ID of the location where the reverse delivery line item is to be disposed. This is required
     *           when the disposition type is RESTOCKED.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
