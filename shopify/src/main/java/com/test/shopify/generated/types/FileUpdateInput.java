package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that are required to update a file object.
 */
public class FileUpdateInput {
  /**
   * The ID of the file to be updated.
   */
  private String id;

  /**
   * The alternative text description of the file.
   */
  private String alt;

  /**
   * The source from which to update a media image or generic file.
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  private String originalSource;

  /**
   * The source from which to update the media preview image.
   * May be an external URL or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  private String previewImageSource;

  /**
   * The name of the file including its extension.
   */
  private String filename;

  public FileUpdateInput() {
  }

  /**
   * The ID of the file to be updated.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The alternative text description of the file.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * The source from which to update a media image or generic file.
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  /**
   * The source from which to update the media preview image.
   * May be an external URL or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  public String getPreviewImageSource() {
    return previewImageSource;
  }

  public void setPreviewImageSource(String previewImageSource) {
    this.previewImageSource = previewImageSource;
  }

  /**
   * The name of the file including its extension.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public String toString() {
    return "FileUpdateInput{id='" + id + "', alt='" + alt + "', originalSource='" + originalSource + "', previewImageSource='" + previewImageSource + "', filename='" + filename + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileUpdateInput that = (FileUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(previewImageSource, that.previewImageSource) &&
        Objects.equals(filename, that.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alt, originalSource, previewImageSource, filename);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the file to be updated.
     */
    private String id;

    /**
     * The alternative text description of the file.
     */
    private String alt;

    /**
     * The source from which to update a media image or generic file.
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    private String originalSource;

    /**
     * The source from which to update the media preview image.
     * May be an external URL or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    private String previewImageSource;

    /**
     * The name of the file including its extension.
     */
    private String filename;

    public FileUpdateInput build() {
      FileUpdateInput result = new FileUpdateInput();
      result.id = this.id;
      result.alt = this.alt;
      result.originalSource = this.originalSource;
      result.previewImageSource = this.previewImageSource;
      result.filename = this.filename;
      return result;
    }

    /**
     * The ID of the file to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The alternative text description of the file.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * The source from which to update a media image or generic file.
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    /**
     * The source from which to update the media preview image.
     * May be an external URL or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    public Builder previewImageSource(String previewImageSource) {
      this.previewImageSource = previewImageSource;
      return this;
    }

    /**
     * The name of the file including its extension.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }
  }
}
