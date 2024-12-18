package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A ShopifyQL parsing error.
 */
public class ParseError {
  /**
   * An error code for the error.
   */
  private ParseErrorCode code;

  /**
   * The description of the parsing error.
   */
  private String message;

  /**
   * The start and end range for the error.
   */
  private ParseErrorRange range;

  public ParseError() {
  }

  /**
   * An error code for the error.
   */
  public ParseErrorCode getCode() {
    return code;
  }

  public void setCode(ParseErrorCode code) {
    this.code = code;
  }

  /**
   * The description of the parsing error.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The start and end range for the error.
   */
  public ParseErrorRange getRange() {
    return range;
  }

  public void setRange(ParseErrorRange range) {
    this.range = range;
  }

  @Override
  public String toString() {
    return "ParseError{code='" + code + "', message='" + message + "', range='" + range + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParseError that = (ParseError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message) &&
        Objects.equals(range, that.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, range);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An error code for the error.
     */
    private ParseErrorCode code;

    /**
     * The description of the parsing error.
     */
    private String message;

    /**
     * The start and end range for the error.
     */
    private ParseErrorRange range;

    public ParseError build() {
      ParseError result = new ParseError();
      result.code = this.code;
      result.message = this.message;
      result.range = this.range;
      return result;
    }

    /**
     * An error code for the error.
     */
    public Builder code(ParseErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The description of the parsing error.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The start and end range for the error.
     */
    public Builder range(ParseErrorRange range) {
      this.range = range;
      return this;
    }
  }
}
