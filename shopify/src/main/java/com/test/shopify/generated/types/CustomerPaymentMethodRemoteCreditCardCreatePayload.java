package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodRemoteCreditCardCreate` mutation.
 */
public class CustomerPaymentMethodRemoteCreditCardCreatePayload {
  /**
   * The customer payment method.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerPaymentMethodUserError> userErrors;

  public CustomerPaymentMethodRemoteCreditCardCreatePayload() {
  }

  /**
   * The customer payment method.
   */
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerPaymentMethodUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerPaymentMethodUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodRemoteCreditCardCreatePayload{customerPaymentMethod='" + customerPaymentMethod + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodRemoteCreditCardCreatePayload that = (CustomerPaymentMethodRemoteCreditCardCreatePayload) o;
    return Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPaymentMethod, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer payment method.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerPaymentMethodUserError> userErrors;

    public CustomerPaymentMethodRemoteCreditCardCreatePayload build() {
      CustomerPaymentMethodRemoteCreditCardCreatePayload result = new CustomerPaymentMethodRemoteCreditCardCreatePayload();
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer payment method.
     */
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerPaymentMethodUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
