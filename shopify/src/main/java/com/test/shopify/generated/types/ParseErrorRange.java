package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A range of ShopifyQL parsing errors.
 */
public class ParseErrorRange {
  /**
   * The ending position of the error.
   */
  private ErrorPosition end;

  /**
   * The starting position of the error.
   */
  private ErrorPosition start;

  public ParseErrorRange() {
  }

  /**
   * The ending position of the error.
   */
  public ErrorPosition getEnd() {
    return end;
  }

  public void setEnd(ErrorPosition end) {
    this.end = end;
  }

  /**
   * The starting position of the error.
   */
  public ErrorPosition getStart() {
    return start;
  }

  public void setStart(ErrorPosition start) {
    this.start = start;
  }

  @Override
  public String toString() {
    return "ParseErrorRange{end='" + end + "', start='" + start + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParseErrorRange that = (ParseErrorRange) o;
    return Objects.equals(end, that.end) &&
        Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ending position of the error.
     */
    private ErrorPosition end;

    /**
     * The starting position of the error.
     */
    private ErrorPosition start;

    public ParseErrorRange build() {
      ParseErrorRange result = new ParseErrorRange();
      result.end = this.end;
      result.start = this.start;
      return result;
    }

    /**
     * The ending position of the error.
     */
    public Builder end(ErrorPosition end) {
      this.end = end;
      return this;
    }

    /**
     * The starting position of the error.
     */
    public Builder start(ErrorPosition start) {
      this.start = start;
      return this;
    }
  }
}
