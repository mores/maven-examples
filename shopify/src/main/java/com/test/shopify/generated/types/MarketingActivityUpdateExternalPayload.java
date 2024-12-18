package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingActivityUpdateExternal` mutation.
 */
public class MarketingActivityUpdateExternalPayload {
  /**
   * The updated marketing activity.
   */
  private MarketingActivity marketingActivity;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketingActivityUserError> userErrors;

  public MarketingActivityUpdateExternalPayload() {
  }

  /**
   * The updated marketing activity.
   */
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateExternalPayload{marketingActivity='" + marketingActivity + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateExternalPayload that = (MarketingActivityUpdateExternalPayload) o;
    return Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivity, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated marketing activity.
     */
    private MarketingActivity marketingActivity;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketingActivityUserError> userErrors;

    public MarketingActivityUpdateExternalPayload build() {
      MarketingActivityUpdateExternalPayload result = new MarketingActivityUpdateExternalPayload();
      result.marketingActivity = this.marketingActivity;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated marketing activity.
     */
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
