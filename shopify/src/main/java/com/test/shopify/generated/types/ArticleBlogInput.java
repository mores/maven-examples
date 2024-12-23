package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields of a blog when an article is created or updated.
 */
public class ArticleBlogInput {
  /**
   * The title of the blog.
   */
  private String title;

  public ArticleBlogInput() {
  }

  /**
   * The title of the blog.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ArticleBlogInput{title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleBlogInput that = (ArticleBlogInput) o;
    return Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the blog.
     */
    private String title;

    public ArticleBlogInput build() {
      ArticleBlogInput result = new ArticleBlogInput();
      result.title = this.title;
      return result;
    }

    /**
     * The title of the blog.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
