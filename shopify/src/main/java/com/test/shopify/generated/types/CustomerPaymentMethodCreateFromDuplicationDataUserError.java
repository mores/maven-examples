package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An error that occurs during the execution of `CustomerPaymentMethodCreateFromDuplicationData`.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerPaymentMethodCreateFromDuplicationDataUserError implements com.test.shopify.generated.types.DisplayableError {
  /**
   * The error code.
   */
  private CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public CustomerPaymentMethodCreateFromDuplicationDataUserError() {
  }

  /**
   * The error code.
   */
  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode getCode() {
    return code;
  }

  public void setCode(CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode code) {
    this.code = code;
  }

  /**
   * The path to the input field that caused the error.
   */
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  /**
   * The error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodCreateFromDuplicationDataUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodCreateFromDuplicationDataUserError that = (CustomerPaymentMethodCreateFromDuplicationDataUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public CustomerPaymentMethodCreateFromDuplicationDataUserError build() {
      CustomerPaymentMethodCreateFromDuplicationDataUserError result = new CustomerPaymentMethodCreateFromDuplicationDataUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(CustomerPaymentMethodCreateFromDuplicationDataUserErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The path to the input field that caused the error.
     */
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    /**
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
