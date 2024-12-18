package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Shop Pay Installments payment details related to a transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPayInstallmentsPaymentDetails implements PaymentDetails, com.test.shopify.generated.types.BasePaymentDetails {
  /**
   * The name of payment method used by the buyer.
   */
  private String paymentMethodName;

  public ShopPayInstallmentsPaymentDetails() {
  }

  /**
   * The name of payment method used by the buyer.
   */
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsPaymentDetails{paymentMethodName='" + paymentMethodName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsPaymentDetails that = (ShopPayInstallmentsPaymentDetails) o;
    return Objects.equals(paymentMethodName, that.paymentMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of payment method used by the buyer.
     */
    private String paymentMethodName;

    public ShopPayInstallmentsPaymentDetails build() {
      ShopPayInstallmentsPaymentDetails result = new ShopPayInstallmentsPaymentDetails();
      result.paymentMethodName = this.paymentMethodName;
      return result;
    }

    /**
     * The name of payment method used by the buyer.
     */
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }
  }
}
