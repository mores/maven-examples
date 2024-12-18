package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for approving a customer's return request.
 */
public class ReturnApproveRequestInput {
  /**
   * The ID of the return that's being approved.
   */
  private String id;

  public ReturnApproveRequestInput() {
  }

  /**
   * The ID of the return that's being approved.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ReturnApproveRequestInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnApproveRequestInput that = (ReturnApproveRequestInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return that's being approved.
     */
    private String id;

    public ReturnApproveRequestInput build() {
      ReturnApproveRequestInput result = new ReturnApproveRequestInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the return that's being approved.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
