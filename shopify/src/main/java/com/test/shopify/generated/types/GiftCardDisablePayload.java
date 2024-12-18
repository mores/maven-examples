package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardDisable` mutation.
 */
public class GiftCardDisablePayload {
  /**
   * The disabled gift card.
   */
  private GiftCard giftCard;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public GiftCardDisablePayload() {
  }

  /**
   * The disabled gift card.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
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
    return "GiftCardDisablePayload{giftCard='" + giftCard + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardDisablePayload that = (GiftCardDisablePayload) o;
    return Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCard, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The disabled gift card.
     */
    private GiftCard giftCard;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public GiftCardDisablePayload build() {
      GiftCardDisablePayload result = new GiftCardDisablePayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The disabled gift card.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
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
