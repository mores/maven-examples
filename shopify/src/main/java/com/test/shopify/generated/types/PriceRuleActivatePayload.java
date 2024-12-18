package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceRuleActivate` mutation.
 */
public class PriceRuleActivatePayload {
  /**
   * The activated price rule.
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

  public PriceRuleActivatePayload() {
  }

  /**
   * The activated price rule.
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
    return "PriceRuleActivatePayload{priceRule='" + priceRule + "', priceRuleUserErrors='" + priceRuleUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleActivatePayload that = (PriceRuleActivatePayload) o;
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
     * The activated price rule.
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

    public PriceRuleActivatePayload build() {
      PriceRuleActivatePayload result = new PriceRuleActivatePayload();
      result.priceRule = this.priceRule;
      result.priceRuleUserErrors = this.priceRuleUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The activated price rule.
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
