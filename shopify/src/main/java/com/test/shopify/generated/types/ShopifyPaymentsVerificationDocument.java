package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A document which can be used to verify an individual.
 */
public class ShopifyPaymentsVerificationDocument {
  /**
   * True if the back side of the document is required.
   */
  private boolean backRequired;

  /**
   * True if the front side of the document is required.
   */
  private boolean frontRequired;

  /**
   * The type of the document which can be used for verification.
   */
  private ShopifyPaymentsVerificationDocumentType type;

  public ShopifyPaymentsVerificationDocument() {
  }

  /**
   * True if the back side of the document is required.
   */
  public boolean getBackRequired() {
    return backRequired;
  }

  public void setBackRequired(boolean backRequired) {
    this.backRequired = backRequired;
  }

  /**
   * True if the front side of the document is required.
   */
  public boolean getFrontRequired() {
    return frontRequired;
  }

  public void setFrontRequired(boolean frontRequired) {
    this.frontRequired = frontRequired;
  }

  /**
   * The type of the document which can be used for verification.
   */
  public ShopifyPaymentsVerificationDocumentType getType() {
    return type;
  }

  public void setType(ShopifyPaymentsVerificationDocumentType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsVerificationDocument{backRequired='" + backRequired + "', frontRequired='" + frontRequired + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsVerificationDocument that = (ShopifyPaymentsVerificationDocument) o;
    return backRequired == that.backRequired &&
        frontRequired == that.frontRequired &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backRequired, frontRequired, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * True if the back side of the document is required.
     */
    private boolean backRequired;

    /**
     * True if the front side of the document is required.
     */
    private boolean frontRequired;

    /**
     * The type of the document which can be used for verification.
     */
    private ShopifyPaymentsVerificationDocumentType type;

    public ShopifyPaymentsVerificationDocument build() {
      ShopifyPaymentsVerificationDocument result = new ShopifyPaymentsVerificationDocument();
      result.backRequired = this.backRequired;
      result.frontRequired = this.frontRequired;
      result.type = this.type;
      return result;
    }

    /**
     * True if the back side of the document is required.
     */
    public Builder backRequired(boolean backRequired) {
      this.backRequired = backRequired;
      return this;
    }

    /**
     * True if the front side of the document is required.
     */
    public Builder frontRequired(boolean frontRequired) {
      this.frontRequired = frontRequired;
      return this;
    }

    /**
     * The type of the document which can be used for verification.
     */
    public Builder type(ShopifyPaymentsVerificationDocumentType type) {
      this.type = type;
      return this;
    }
  }
}
