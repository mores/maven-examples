package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The fraud settings of a payments account.
 */
public class ShopifyPaymentsFraudSettings {
  /**
   * Decline a charge if there's an AVS failure.
   */
  private boolean declineChargeOnAvsFailure;

  /**
   * Decline a charge if there's an CVC failure.
   */
  private boolean declineChargeOnCvcFailure;

  public ShopifyPaymentsFraudSettings() {
  }

  /**
   * Decline a charge if there's an AVS failure.
   */
  public boolean getDeclineChargeOnAvsFailure() {
    return declineChargeOnAvsFailure;
  }

  public void setDeclineChargeOnAvsFailure(boolean declineChargeOnAvsFailure) {
    this.declineChargeOnAvsFailure = declineChargeOnAvsFailure;
  }

  /**
   * Decline a charge if there's an CVC failure.
   */
  public boolean getDeclineChargeOnCvcFailure() {
    return declineChargeOnCvcFailure;
  }

  public void setDeclineChargeOnCvcFailure(boolean declineChargeOnCvcFailure) {
    this.declineChargeOnCvcFailure = declineChargeOnCvcFailure;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsFraudSettings{declineChargeOnAvsFailure='" + declineChargeOnAvsFailure + "', declineChargeOnCvcFailure='" + declineChargeOnCvcFailure + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsFraudSettings that = (ShopifyPaymentsFraudSettings) o;
    return declineChargeOnAvsFailure == that.declineChargeOnAvsFailure &&
        declineChargeOnCvcFailure == that.declineChargeOnCvcFailure;
  }

  @Override
  public int hashCode() {
    return Objects.hash(declineChargeOnAvsFailure, declineChargeOnCvcFailure);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Decline a charge if there's an AVS failure.
     */
    private boolean declineChargeOnAvsFailure;

    /**
     * Decline a charge if there's an CVC failure.
     */
    private boolean declineChargeOnCvcFailure;

    public ShopifyPaymentsFraudSettings build() {
      ShopifyPaymentsFraudSettings result = new ShopifyPaymentsFraudSettings();
      result.declineChargeOnAvsFailure = this.declineChargeOnAvsFailure;
      result.declineChargeOnCvcFailure = this.declineChargeOnCvcFailure;
      return result;
    }

    /**
     * Decline a charge if there's an AVS failure.
     */
    public Builder declineChargeOnAvsFailure(boolean declineChargeOnAvsFailure) {
      this.declineChargeOnAvsFailure = declineChargeOnAvsFailure;
      return this;
    }

    /**
     * Decline a charge if there's an CVC failure.
     */
    public Builder declineChargeOnCvcFailure(boolean declineChargeOnCvcFailure) {
      this.declineChargeOnCvcFailure = declineChargeOnCvcFailure;
      return this;
    }
  }
}
