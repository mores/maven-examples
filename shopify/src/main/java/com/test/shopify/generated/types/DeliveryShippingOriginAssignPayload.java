package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryShippingOriginAssign` mutation.
 */
public class DeliveryShippingOriginAssignPayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DeliveryShippingOriginAssignPayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryShippingOriginAssignPayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryShippingOriginAssignPayload that = (DeliveryShippingOriginAssignPayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DeliveryShippingOriginAssignPayload build() {
      DeliveryShippingOriginAssignPayload result = new DeliveryShippingOriginAssignPayload();
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
