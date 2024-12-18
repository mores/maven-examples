package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Shopify stores come with a built-in blogging engine, allowing a shop to have one or more blogs.  Blogs are meant
 * to be used as a type of magazine or newsletter for the shop, with content that changes over time.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreBlog implements MetafieldReferencer, com.test.shopify.generated.types.HasPublishedTranslations, com.test.shopify.generated.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public OnlineStoreBlog() {
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
    return "OnlineStoreBlog{id='" + id + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreBlog that = (OnlineStoreBlog) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public OnlineStoreBlog build() {
      OnlineStoreBlog result = new OnlineStoreBlog();
      result.id = this.id;
      result.translations = this.translations;
      return result;
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
