package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The delivery method used by a fulfillment order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryMethod implements com.test.shopify.generated.types.Node {
  /**
   * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
   */
  private DeliveryBrandedPromise brandedPromise;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  private OffsetDateTime maxDeliveryDateTime;

  /**
   * The type of the delivery method.
   */
  private DeliveryMethodType methodType;

  /**
   * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  private OffsetDateTime minDeliveryDateTime;

  /**
   * A reference to the shipping method.
   */
  private String serviceCode;

  public DeliveryMethod() {
  }

  /**
   * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
   */
  public DeliveryBrandedPromise getBrandedPromise() {
    return brandedPromise;
  }

  public void setBrandedPromise(DeliveryBrandedPromise brandedPromise) {
    this.brandedPromise = brandedPromise;
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
   * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  public OffsetDateTime getMaxDeliveryDateTime() {
    return maxDeliveryDateTime;
  }

  public void setMaxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
    this.maxDeliveryDateTime = maxDeliveryDateTime;
  }

  /**
   * The type of the delivery method.
   */
  public DeliveryMethodType getMethodType() {
    return methodType;
  }

  public void setMethodType(DeliveryMethodType methodType) {
    this.methodType = methodType;
  }

  /**
   * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  public OffsetDateTime getMinDeliveryDateTime() {
    return minDeliveryDateTime;
  }

  public void setMinDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
    this.minDeliveryDateTime = minDeliveryDateTime;
  }

  /**
   * A reference to the shipping method.
   */
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  @Override
  public String toString() {
    return "DeliveryMethod{brandedPromise='" + brandedPromise + "', id='" + id + "', maxDeliveryDateTime='" + maxDeliveryDateTime + "', methodType='" + methodType + "', minDeliveryDateTime='" + minDeliveryDateTime + "', serviceCode='" + serviceCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethod that = (DeliveryMethod) o;
    return Objects.equals(brandedPromise, that.brandedPromise) &&
        Objects.equals(id, that.id) &&
        Objects.equals(maxDeliveryDateTime, that.maxDeliveryDateTime) &&
        Objects.equals(methodType, that.methodType) &&
        Objects.equals(minDeliveryDateTime, that.minDeliveryDateTime) &&
        Objects.equals(serviceCode, that.serviceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandedPromise, id, maxDeliveryDateTime, methodType, minDeliveryDateTime, serviceCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
     */
    private DeliveryBrandedPromise brandedPromise;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    private OffsetDateTime maxDeliveryDateTime;

    /**
     * The type of the delivery method.
     */
    private DeliveryMethodType methodType;

    /**
     * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    private OffsetDateTime minDeliveryDateTime;

    /**
     * A reference to the shipping method.
     */
    private String serviceCode;

    public DeliveryMethod build() {
      DeliveryMethod result = new DeliveryMethod();
      result.brandedPromise = this.brandedPromise;
      result.id = this.id;
      result.maxDeliveryDateTime = this.maxDeliveryDateTime;
      result.methodType = this.methodType;
      result.minDeliveryDateTime = this.minDeliveryDateTime;
      result.serviceCode = this.serviceCode;
      return result;
    }

    /**
     * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
     */
    public Builder brandedPromise(DeliveryBrandedPromise brandedPromise) {
      this.brandedPromise = brandedPromise;
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
     * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    public Builder maxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
      this.maxDeliveryDateTime = maxDeliveryDateTime;
      return this;
    }

    /**
     * The type of the delivery method.
     */
    public Builder methodType(DeliveryMethodType methodType) {
      this.methodType = methodType;
      return this;
    }

    /**
     * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    public Builder minDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
      this.minDeliveryDateTime = minDeliveryDateTime;
      return this;
    }

    /**
     * A reference to the shipping method.
     */
    public Builder serviceCode(String serviceCode) {
      this.serviceCode = serviceCode;
      return this;
    }
  }
}
