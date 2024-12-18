package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A page on the Online Store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStorePage implements MetafieldReference, MetafieldReferencer, com.test.shopify.generated.types.HasPublishedTranslations, com.test.shopify.generated.types.Navigable, com.test.shopify.generated.types.Node {
  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public OnlineStorePage() {
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "OnlineStorePage{defaultCursor='" + defaultCursor + "', id='" + id + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStorePage that = (OnlineStorePage) o;
    return Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(id, that.id) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCursor, id, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public OnlineStorePage build() {
      OnlineStorePage result = new OnlineStorePage();
      result.defaultCursor = this.defaultCursor;
      result.id = this.id;
      result.translations = this.translations;
      return result;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
