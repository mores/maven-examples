package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the url of the body of a theme file.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OnlineStoreThemeFileBodyUrl implements OnlineStoreThemeFileBody {
  /**
   * The url for the body of the theme file.
   */
  private String url;

  public OnlineStoreThemeFileBodyUrl() {
  }

  /**
   * The url for the body of the theme file.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileBodyUrl{url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileBodyUrl that = (OnlineStoreThemeFileBodyUrl) o;
    return Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The url for the body of the theme file.
     */
    private String url;

    public OnlineStoreThemeFileBodyUrl build() {
      OnlineStoreThemeFileBodyUrl result = new OnlineStoreThemeFileBodyUrl();
      result.url = this.url;
      return result;
    }

    /**
     * The url for the body of the theme file.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
