package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionDraftCommit` mutation.
 */
public class SubscriptionDraftCommitPayload {
  /**
   * The updated Subscription Contract object.
   */
  private SubscriptionContract contract;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionDraftUserError> userErrors;

  public SubscriptionDraftCommitPayload() {
  }

  /**
   * The updated Subscription Contract object.
   */
  public SubscriptionContract getContract() {
    return contract;
  }

  public void setContract(SubscriptionContract contract) {
    this.contract = contract;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionDraftUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionDraftUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionDraftCommitPayload{contract='" + contract + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraftCommitPayload that = (SubscriptionDraftCommitPayload) o;
    return Objects.equals(contract, that.contract) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated Subscription Contract object.
     */
    private SubscriptionContract contract;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionDraftUserError> userErrors;

    public SubscriptionDraftCommitPayload build() {
      SubscriptionDraftCommitPayload result = new SubscriptionDraftCommitPayload();
      result.contract = this.contract;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated Subscription Contract object.
     */
    public Builder contract(SubscriptionContract contract) {
      this.contract = contract;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionDraftUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
