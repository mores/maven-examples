package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountCodeBxgyCreate` mutation.
 */
public class DiscountCodeBxgyCreatePayload {
  /**
   * The created code discount.
   */
  private DiscountCodeNode codeDiscountNode;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountCodeBxgyCreatePayload() {
  }

  /**
   * The created code discount.
   */
  public DiscountCodeNode getCodeDiscountNode() {
    return codeDiscountNode;
  }

  public void setCodeDiscountNode(DiscountCodeNode codeDiscountNode) {
    this.codeDiscountNode = codeDiscountNode;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountCodeBxgyCreatePayload{codeDiscountNode='" + codeDiscountNode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBxgyCreatePayload that = (DiscountCodeBxgyCreatePayload) o;
    return Objects.equals(codeDiscountNode, that.codeDiscountNode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeDiscountNode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created code discount.
     */
    private DiscountCodeNode codeDiscountNode;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountCodeBxgyCreatePayload build() {
      DiscountCodeBxgyCreatePayload result = new DiscountCodeBxgyCreatePayload();
      result.codeDiscountNode = this.codeDiscountNode;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created code discount.
     */
    public Builder codeDiscountNode(DiscountCodeNode codeDiscountNode) {
      this.codeDiscountNode = codeDiscountNode;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
