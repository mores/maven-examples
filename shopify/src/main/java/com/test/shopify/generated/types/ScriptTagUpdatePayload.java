package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `scriptTagUpdate` mutation.
 */
public class ScriptTagUpdatePayload {
  /**
   * The script tag that was updated.
   */
  private ScriptTag scriptTag;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ScriptTagUpdatePayload() {
  }

  /**
   * The script tag that was updated.
   */
  public ScriptTag getScriptTag() {
    return scriptTag;
  }

  public void setScriptTag(ScriptTag scriptTag) {
    this.scriptTag = scriptTag;
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
    return "ScriptTagUpdatePayload{scriptTag='" + scriptTag + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagUpdatePayload that = (ScriptTagUpdatePayload) o;
    return Objects.equals(scriptTag, that.scriptTag) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptTag, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The script tag that was updated.
     */
    private ScriptTag scriptTag;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ScriptTagUpdatePayload build() {
      ScriptTagUpdatePayload result = new ScriptTagUpdatePayload();
      result.scriptTag = this.scriptTag;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The script tag that was updated.
     */
    public Builder scriptTag(ScriptTag scriptTag) {
      this.scriptTag = scriptTag;
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
