package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketLocalizationsRegister` mutation.
 */
public class MarketLocalizationsRegisterPayload {
  /**
   * The market localizations that were created or updated.
   */
  private List<MarketLocalization> marketLocalizations;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<TranslationUserError> userErrors;

  public MarketLocalizationsRegisterPayload() {
  }

  /**
   * The market localizations that were created or updated.
   */
  public List<MarketLocalization> getMarketLocalizations() {
    return marketLocalizations;
  }

  public void setMarketLocalizations(List<MarketLocalization> marketLocalizations) {
    this.marketLocalizations = marketLocalizations;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<TranslationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TranslationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketLocalizationsRegisterPayload{marketLocalizations='" + marketLocalizations + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizationsRegisterPayload that = (MarketLocalizationsRegisterPayload) o;
    return Objects.equals(marketLocalizations, that.marketLocalizations) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketLocalizations, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The market localizations that were created or updated.
     */
    private List<MarketLocalization> marketLocalizations;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<TranslationUserError> userErrors;

    public MarketLocalizationsRegisterPayload build() {
      MarketLocalizationsRegisterPayload result = new MarketLocalizationsRegisterPayload();
      result.marketLocalizations = this.marketLocalizations;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The market localizations that were created or updated.
     */
    public Builder marketLocalizations(List<MarketLocalization> marketLocalizations) {
      this.marketLocalizations = marketLocalizations;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<TranslationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
