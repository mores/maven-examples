package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentCustomizationDelete` mutation.
 */
public class PaymentCustomizationDeletePayload {
  /**
   * Returns the deleted payment customization ID.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentCustomizationError> userErrors;

  public PaymentCustomizationDeletePayload() {
  }

  /**
   * Returns the deleted payment customization ID.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PaymentCustomizationError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentCustomizationError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentCustomizationDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentCustomizationDeletePayload that = (PaymentCustomizationDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the deleted payment customization ID.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentCustomizationError> userErrors;

    public PaymentCustomizationDeletePayload build() {
      PaymentCustomizationDeletePayload result = new PaymentCustomizationDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the deleted payment customization ID.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentCustomizationError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
