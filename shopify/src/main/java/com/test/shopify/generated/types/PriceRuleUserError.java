package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents an error that happens during execution of a price rule mutation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRuleUserError implements com.test.shopify.generated.types.DisplayableError {
  /**
   * Error code to uniquely identify the error.
   */
  private PriceRuleErrorCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public PriceRuleUserError() {
  }

  /**
   * Error code to uniquely identify the error.
   */
  public PriceRuleErrorCode getCode() {
    return code;
  }

  public void setCode(PriceRuleErrorCode code) {
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
    return "PriceRuleUserError{code='" + code + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleUserError that = (PriceRuleUserError) o;
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
     * Error code to uniquely identify the error.
     */
    private PriceRuleErrorCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public PriceRuleUserError build() {
      PriceRuleUserError result = new PriceRuleUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * Error code to uniquely identify the error.
     */
    public Builder code(PriceRuleErrorCode code) {
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
