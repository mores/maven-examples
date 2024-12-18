package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `bulkOperationRunQuery` mutation.
 */
public class BulkOperationRunQueryPayload {
  /**
   * The newly created bulk operation.
   */
  private BulkOperation bulkOperation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public BulkOperationRunQueryPayload() {
  }

  /**
   * The newly created bulk operation.
   */
  public BulkOperation getBulkOperation() {
    return bulkOperation;
  }

  public void setBulkOperation(BulkOperation bulkOperation) {
    this.bulkOperation = bulkOperation;
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
    return "BulkOperationRunQueryPayload{bulkOperation='" + bulkOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BulkOperationRunQueryPayload that = (BulkOperationRunQueryPayload) o;
    return Objects.equals(bulkOperation, that.bulkOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created bulk operation.
     */
    private BulkOperation bulkOperation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public BulkOperationRunQueryPayload build() {
      BulkOperationRunQueryPayload result = new BulkOperationRunQueryPayload();
      result.bulkOperation = this.bulkOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created bulk operation.
     */
    public Builder bulkOperation(BulkOperation bulkOperation) {
      this.bulkOperation = bulkOperation;
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
