package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An error that occurs during the execution of `MetafieldDefinitionCreate`.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldDefinitionCreateUserError implements com.test.shopify.generated.types.DisplayableError {
  /**
   * The error code.
   */
  private MetafieldDefinitionCreateUserErrorCode code;

  /**
   * The index of the array element that's causing the error.
   */
  private Integer elementIndex;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  public MetafieldDefinitionCreateUserError() {
  }

  /**
   * The error code.
   */
  public MetafieldDefinitionCreateUserErrorCode getCode() {
    return code;
  }

  public void setCode(MetafieldDefinitionCreateUserErrorCode code) {
    this.code = code;
  }

  /**
   * The index of the array element that's causing the error.
   */
  public Integer getElementIndex() {
    return elementIndex;
  }

  public void setElementIndex(Integer elementIndex) {
    this.elementIndex = elementIndex;
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
    return "MetafieldDefinitionCreateUserError{code='" + code + "', elementIndex='" + elementIndex + "', field='" + field + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionCreateUserError that = (MetafieldDefinitionCreateUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(elementIndex, that.elementIndex) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, elementIndex, field, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private MetafieldDefinitionCreateUserErrorCode code;

    /**
     * The index of the array element that's causing the error.
     */
    private Integer elementIndex;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    public MetafieldDefinitionCreateUserError build() {
      MetafieldDefinitionCreateUserError result = new MetafieldDefinitionCreateUserError();
      result.code = this.code;
      result.elementIndex = this.elementIndex;
      result.field = this.field;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(MetafieldDefinitionCreateUserErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The index of the array element that's causing the error.
     */
    public Builder elementIndex(Integer elementIndex) {
      this.elementIndex = elementIndex;
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
