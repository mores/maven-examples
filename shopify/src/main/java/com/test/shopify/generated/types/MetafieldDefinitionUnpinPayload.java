package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldDefinitionUnpin` mutation.
 */
public class MetafieldDefinitionUnpinPayload {
  /**
   * The metafield definition that was unpinned.
   */
  private MetafieldDefinition unpinnedDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDefinitionUnpinUserError> userErrors;

  public MetafieldDefinitionUnpinPayload() {
  }

  /**
   * The metafield definition that was unpinned.
   */
  public MetafieldDefinition getUnpinnedDefinition() {
    return unpinnedDefinition;
  }

  public void setUnpinnedDefinition(MetafieldDefinition unpinnedDefinition) {
    this.unpinnedDefinition = unpinnedDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldDefinitionUnpinUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionUnpinUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionUnpinPayload{unpinnedDefinition='" + unpinnedDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionUnpinPayload that = (MetafieldDefinitionUnpinPayload) o;
    return Objects.equals(unpinnedDefinition, that.unpinnedDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unpinnedDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition that was unpinned.
     */
    private MetafieldDefinition unpinnedDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDefinitionUnpinUserError> userErrors;

    public MetafieldDefinitionUnpinPayload build() {
      MetafieldDefinitionUnpinPayload result = new MetafieldDefinitionUnpinPayload();
      result.unpinnedDefinition = this.unpinnedDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The metafield definition that was unpinned.
     */
    public Builder unpinnedDefinition(MetafieldDefinition unpinnedDefinition) {
      this.unpinnedDefinition = unpinnedDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDefinitionUnpinUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
