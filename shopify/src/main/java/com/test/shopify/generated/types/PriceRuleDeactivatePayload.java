package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceRuleDeactivate` mutation.
 */
public class PriceRuleDeactivatePayload {
  /**
   * The deactivated price rule.
   */
  private PriceRule priceRule;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceRuleUserError> priceRuleUserErrors;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PriceRuleDeactivatePayload() {
  }

  /**
   * The deactivated price rule.
   */
  public PriceRule getPriceRule() {
    return priceRule;
  }

  public void setPriceRule(PriceRule priceRule) {
    this.priceRule = priceRule;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PriceRuleUserError> getPriceRuleUserErrors() {
    return priceRuleUserErrors;
  }

  public void setPriceRuleUserErrors(List<PriceRuleUserError> priceRuleUserErrors) {
    this.priceRuleUserErrors = priceRuleUserErrors;
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
    return "PriceRuleDeactivatePayload{priceRule='" + priceRule + "', priceRuleUserErrors='" + priceRuleUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleDeactivatePayload that = (PriceRuleDeactivatePayload) o;
    return Objects.equals(priceRule, that.priceRule) &&
        Objects.equals(priceRuleUserErrors, that.priceRuleUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceRule, priceRuleUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The deactivated price rule.
     */
    private PriceRule priceRule;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceRuleUserError> priceRuleUserErrors;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PriceRuleDeactivatePayload build() {
      PriceRuleDeactivatePayload result = new PriceRuleDeactivatePayload();
      result.priceRule = this.priceRule;
      result.priceRuleUserErrors = this.priceRuleUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The deactivated price rule.
     */
    public Builder priceRule(PriceRule priceRule) {
      this.priceRule = priceRule;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder priceRuleUserErrors(List<PriceRuleUserError> priceRuleUserErrors) {
      this.priceRuleUserErrors = priceRuleUserErrors;
      return this;
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
