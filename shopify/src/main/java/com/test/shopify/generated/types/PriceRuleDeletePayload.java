package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceRuleDelete` mutation.
 */
public class PriceRuleDeletePayload {
  /**
   * The ID price of the deleted price rule.
   */
  private String deletedPriceRuleId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceRuleUserError> priceRuleUserErrors;

  /**
   * The shop of the deleted price rule.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PriceRuleDeletePayload() {
  }

  /**
   * The ID price of the deleted price rule.
   */
  public String getDeletedPriceRuleId() {
    return deletedPriceRuleId;
  }

  public void setDeletedPriceRuleId(String deletedPriceRuleId) {
    this.deletedPriceRuleId = deletedPriceRuleId;
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
   * The shop of the deleted price rule.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
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
    return "PriceRuleDeletePayload{deletedPriceRuleId='" + deletedPriceRuleId + "', priceRuleUserErrors='" + priceRuleUserErrors + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleDeletePayload that = (PriceRuleDeletePayload) o;
    return Objects.equals(deletedPriceRuleId, that.deletedPriceRuleId) &&
        Objects.equals(priceRuleUserErrors, that.priceRuleUserErrors) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPriceRuleId, priceRuleUserErrors, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID price of the deleted price rule.
     */
    private String deletedPriceRuleId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceRuleUserError> priceRuleUserErrors;

    /**
     * The shop of the deleted price rule.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PriceRuleDeletePayload build() {
      PriceRuleDeletePayload result = new PriceRuleDeletePayload();
      result.deletedPriceRuleId = this.deletedPriceRuleId;
      result.priceRuleUserErrors = this.priceRuleUserErrors;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID price of the deleted price rule.
     */
    public Builder deletedPriceRuleId(String deletedPriceRuleId) {
      this.deletedPriceRuleId = deletedPriceRuleId;
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
     * The shop of the deleted price rule.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
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
