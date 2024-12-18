package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Error position information in a ShopifyQL parsing error.
 */
public class ErrorPosition {
  /**
   * The character position of the error in the line.
   */
  private int character;

  /**
   * The line number of the error.
   */
  private int line;

  public ErrorPosition() {
  }

  /**
   * The character position of the error in the line.
   */
  public int getCharacter() {
    return character;
  }

  public void setCharacter(int character) {
    this.character = character;
  }

  /**
   * The line number of the error.
   */
  public int getLine() {
    return line;
  }

  public void setLine(int line) {
    this.line = line;
  }

  @Override
  public String toString() {
    return "ErrorPosition{character='" + character + "', line='" + line + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ErrorPosition that = (ErrorPosition) o;
    return character == that.character &&
        line == that.line;
  }

  @Override
  public int hashCode() {
    return Objects.hash(character, line);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The character position of the error in the line.
     */
    private int character;

    /**
     * The line number of the error.
     */
    private int line;

    public ErrorPosition build() {
      ErrorPosition result = new ErrorPosition();
      result.character = this.character;
      result.line = this.line;
      return result;
    }

    /**
     * The character position of the error in the line.
     */
    public Builder character(int character) {
      this.character = character;
      return this;
    }

    /**
     * The line number of the error.
     */
    public Builder line(int line) {
      this.line = line;
      return this;
    }
  }
}
