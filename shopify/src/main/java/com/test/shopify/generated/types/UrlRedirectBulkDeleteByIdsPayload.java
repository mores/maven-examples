package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `urlRedirectBulkDeleteByIds` mutation.
 */
public class UrlRedirectBulkDeleteByIdsPayload {
  /**
   * The asynchronous job removing the redirects.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UrlRedirectBulkDeleteByIdsUserError> userErrors;

  public UrlRedirectBulkDeleteByIdsPayload() {
  }

  /**
   * The asynchronous job removing the redirects.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UrlRedirectBulkDeleteByIdsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectBulkDeleteByIdsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectBulkDeleteByIdsPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectBulkDeleteByIdsPayload that = (UrlRedirectBulkDeleteByIdsPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job removing the redirects.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UrlRedirectBulkDeleteByIdsUserError> userErrors;

    public UrlRedirectBulkDeleteByIdsPayload build() {
      UrlRedirectBulkDeleteByIdsPayload result = new UrlRedirectBulkDeleteByIdsPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job removing the redirects.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UrlRedirectBulkDeleteByIdsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
