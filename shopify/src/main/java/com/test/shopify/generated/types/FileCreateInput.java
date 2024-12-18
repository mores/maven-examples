package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that are required to create a file object.
 */
public class FileCreateInput {
  /**
   * When provided, the file will be created with the given filename,
   * otherwise the filename in the originalSource will be used.
   */
  private String filename;

  /**
   * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
   */
  private FileContentType contentType;

  /**
   * The alternative text description of the file.
   */
  private String alt;

  /**
   * How to handle if filename is already in use.
   */
  private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

  /**
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  private String originalSource;

  public FileCreateInput() {
  }

  /**
   * When provided, the file will be created with the given filename,
   * otherwise the filename in the originalSource will be used.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
   */
  public FileContentType getContentType() {
    return contentType;
  }

  public void setContentType(FileContentType contentType) {
    this.contentType = contentType;
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
   * How to handle if filename is already in use.
   */
  public FileCreateInputDuplicateResolutionMode getDuplicateResolutionMode() {
    return duplicateResolutionMode;
  }

  public void setDuplicateResolutionMode(
      FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
    this.duplicateResolutionMode = duplicateResolutionMode;
  }

  /**
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  @Override
  public String toString() {
    return "FileCreateInput{filename='" + filename + "', contentType='" + contentType + "', alt='" + alt + "', duplicateResolutionMode='" + duplicateResolutionMode + "', originalSource='" + originalSource + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileCreateInput that = (FileCreateInput) o;
    return Objects.equals(filename, that.filename) &&
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(duplicateResolutionMode, that.duplicateResolutionMode) &&
        Objects.equals(originalSource, that.originalSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, contentType, alt, duplicateResolutionMode, originalSource);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * When provided, the file will be created with the given filename,
     * otherwise the filename in the originalSource will be used.
     */
    private String filename;

    /**
     * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
     */
    private FileContentType contentType;

    /**
     * The alternative text description of the file.
     */
    private String alt;

    /**
     * How to handle if filename is already in use.
     */
    private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

    /**
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    private String originalSource;

    public FileCreateInput build() {
      FileCreateInput result = new FileCreateInput();
      result.filename = this.filename;
      result.contentType = this.contentType;
      result.alt = this.alt;
      result.duplicateResolutionMode = this.duplicateResolutionMode;
      result.originalSource = this.originalSource;
      return result;
    }

    /**
     * When provided, the file will be created with the given filename,
     * otherwise the filename in the originalSource will be used.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
     */
    public Builder contentType(FileContentType contentType) {
      this.contentType = contentType;
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
     * How to handle if filename is already in use.
     */
    public Builder duplicateResolutionMode(
        FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
      this.duplicateResolutionMode = duplicateResolutionMode;
      return this;
    }

    /**
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }
  }
}
