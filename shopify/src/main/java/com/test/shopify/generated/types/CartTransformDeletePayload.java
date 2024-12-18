package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartTransformDelete` mutation.
 */
public class CartTransformDeletePayload {
  /**
   * The globally-unique ID for the deleted cart transform.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CartTransformDeleteUserError> userErrors;

  public CartTransformDeletePayload() {
  }

  /**
   * The globally-unique ID for the deleted cart transform.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CartTransformDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CartTransformDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartTransformDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformDeletePayload that = (CartTransformDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The globally-unique ID for the deleted cart transform.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CartTransformDeleteUserError> userErrors;

    public CartTransformDeletePayload build() {
      CartTransformDeletePayload result = new CartTransformDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The globally-unique ID for the deleted cart transform.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CartTransformDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
