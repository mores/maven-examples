package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The notification settings for the account.
 */
public class ShopifyPaymentsNotificationSettings {
  /**
   * Receive email notifications when new payouts are sent or payouts fail.
   */
  private boolean payouts;

  public ShopifyPaymentsNotificationSettings() {
  }

  /**
   * Receive email notifications when new payouts are sent or payouts fail.
   */
  public boolean getPayouts() {
    return payouts;
  }

  public void setPayouts(boolean payouts) {
    this.payouts = payouts;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsNotificationSettings{payouts='" + payouts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsNotificationSettings that = (ShopifyPaymentsNotificationSettings) o;
    return payouts == that.payouts;
  }

  @Override
  public int hashCode() {
    return Objects.hash(payouts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Receive email notifications when new payouts are sent or payouts fail.
     */
    private boolean payouts;

    public ShopifyPaymentsNotificationSettings build() {
      ShopifyPaymentsNotificationSettings result = new ShopifyPaymentsNotificationSettings();
      result.payouts = this.payouts;
      return result;
    }

    /**
     * Receive email notifications when new payouts are sent or payouts fail.
     */
    public Builder payouts(boolean payouts) {
      this.payouts = payouts;
      return this;
    }
  }
}
