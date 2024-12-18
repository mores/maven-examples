package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for declining a customer's return request.
 */
public class ReturnDeclineRequestInput {
  /**
   * The ID of the return that's being declined.
   */
  private String id;

  /**
   * The reason why the merchant declined the customer's return request.
   */
  private ReturnDeclineReason declineReason;

  public ReturnDeclineRequestInput() {
  }

  /**
   * The ID of the return that's being declined.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The reason why the merchant declined the customer's return request.
   */
  public ReturnDeclineReason getDeclineReason() {
    return declineReason;
  }

  public void setDeclineReason(ReturnDeclineReason declineReason) {
    this.declineReason = declineReason;
  }

  @Override
  public String toString() {
    return "ReturnDeclineRequestInput{id='" + id + "', declineReason='" + declineReason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDeclineRequestInput that = (ReturnDeclineRequestInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(declineReason, that.declineReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, declineReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return that's being declined.
     */
    private String id;

    /**
     * The reason why the merchant declined the customer's return request.
     */
    private ReturnDeclineReason declineReason;

    public ReturnDeclineRequestInput build() {
      ReturnDeclineRequestInput result = new ReturnDeclineRequestInput();
      result.id = this.id;
      result.declineReason = this.declineReason;
      return result;
    }

    /**
     * The ID of the return that's being declined.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The reason why the merchant declined the customer's return request.
     */
    public Builder declineReason(ReturnDeclineReason declineReason) {
      this.declineReason = declineReason;
      return this;
    }
  }
}
