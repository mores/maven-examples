package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardSendNotificationToRecipient` mutation.
 */
public class GiftCardSendNotificationToRecipientPayload {
  /**
   * The gift card that was sent.
   */
  private GiftCard giftCard;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardSendNotificationToRecipientUserError> userErrors;

  public GiftCardSendNotificationToRecipientPayload() {
  }

  /**
   * The gift card that was sent.
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
  public List<GiftCardSendNotificationToRecipientUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardSendNotificationToRecipientUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardSendNotificationToRecipientPayload{giftCard='" + giftCard + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardSendNotificationToRecipientPayload that = (GiftCardSendNotificationToRecipientPayload) o;
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
     * The gift card that was sent.
     */
    private GiftCard giftCard;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardSendNotificationToRecipientUserError> userErrors;

    public GiftCardSendNotificationToRecipientPayload build() {
      GiftCardSendNotificationToRecipientPayload result = new GiftCardSendNotificationToRecipientPayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The gift card that was sent.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardSendNotificationToRecipientUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
