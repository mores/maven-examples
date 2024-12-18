package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A preview of a URL redirect import row.
 */
public class UrlRedirectImportPreview {
  /**
   * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
   */
  private String path;

  /**
   * The target location where the user will be redirected to.
   */
  private String target;

  public UrlRedirectImportPreview() {
  }

  /**
   * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
   */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  /**
   * The target location where the user will be redirected to.
   */
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "UrlRedirectImportPreview{path='" + path + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectImportPreview that = (UrlRedirectImportPreview) o;
    return Objects.equals(path, that.path) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
     */
    private String path;

    /**
     * The target location where the user will be redirected to.
     */
    private String target;

    public UrlRedirectImportPreview build() {
      UrlRedirectImportPreview result = new UrlRedirectImportPreview();
      result.path = this.path;
      result.target = this.target;
      return result;
    }

    /**
     * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * The target location where the user will be redirected to.
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }
}
