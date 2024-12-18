package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A resource that has translatable fields.
 */
public class TranslatableResource {
  /**
   * GID of the resource.
   */
  private String resourceId;

  /**
   * Translatable content.
   */
  private List<TranslatableContent> translatableContent;

  /**
   * Translatable content translations (includes unpublished locales).
   */
  private List<Translation> translations;

  public TranslatableResource() {
  }

  /**
   * GID of the resource.
   */
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Translatable content.
   */
  public List<TranslatableContent> getTranslatableContent() {
    return translatableContent;
  }

  public void setTranslatableContent(List<TranslatableContent> translatableContent) {
    this.translatableContent = translatableContent;
  }

  /**
   * Translatable content translations (includes unpublished locales).
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "TranslatableResource{resourceId='" + resourceId + "', translatableContent='" + translatableContent + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslatableResource that = (TranslatableResource) o;
    return Objects.equals(resourceId, that.resourceId) &&
        Objects.equals(translatableContent, that.translatableContent) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, translatableContent, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * GID of the resource.
     */
    private String resourceId;

    /**
     * Translatable content.
     */
    private List<TranslatableContent> translatableContent;

    /**
     * Translatable content translations (includes unpublished locales).
     */
    private List<Translation> translations;

    public TranslatableResource build() {
      TranslatableResource result = new TranslatableResource();
      result.resourceId = this.resourceId;
      result.translatableContent = this.translatableContent;
      result.translations = this.translations;
      return result;
    }

    /**
     * GID of the resource.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Translatable content.
     */
    public Builder translatableContent(List<TranslatableContent> translatableContent) {
      this.translatableContent = translatableContent;
      return this;
    }

    /**
     * Translatable content translations (includes unpublished locales).
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
