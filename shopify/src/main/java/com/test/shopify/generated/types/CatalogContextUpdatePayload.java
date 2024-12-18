package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `catalogContextUpdate` mutation.
 */
public class CatalogContextUpdatePayload {
  /**
   * The updated catalog.
   */
  private Catalog catalog;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CatalogUserError> userErrors;

  public CatalogContextUpdatePayload() {
  }

  /**
   * The updated catalog.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CatalogUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CatalogUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CatalogContextUpdatePayload{catalog='" + catalog + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogContextUpdatePayload that = (CatalogContextUpdatePayload) o;
    return Objects.equals(catalog, that.catalog) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated catalog.
     */
    private Catalog catalog;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CatalogUserError> userErrors;

    public CatalogContextUpdatePayload build() {
      CatalogContextUpdatePayload result = new CatalogContextUpdatePayload();
      result.catalog = this.catalog;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated catalog.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CatalogUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
