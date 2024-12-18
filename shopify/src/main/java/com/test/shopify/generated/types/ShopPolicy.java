package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Policy that a merchant has configured for their store, such as their refund or privacy policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPolicy implements com.test.shopify.generated.types.HasPublishedTranslations, com.test.shopify.generated.types.Node {
  /**
   * The text of the policy. The maximum size is 512kb.
   */
  private String body;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The shop policy type.
   */
  private ShopPolicyType type;

  /**
   * The public URL of the policy.
   */
  private String url;

  public ShopPolicy() {
  }

  /**
   * The text of the policy. The maximum size is 512kb.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
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

  /**
   * The shop policy type.
   */
  public ShopPolicyType getType() {
    return type;
  }

  public void setType(ShopPolicyType type) {
    this.type = type;
  }

  /**
   * The public URL of the policy.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopPolicy{body='" + body + "', id='" + id + "', translations='" + translations + "', type='" + type + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicy that = (ShopPolicy) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(id, that.id) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(type, that.type) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, id, translations, type, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The text of the policy. The maximum size is 512kb.
     */
    private String body;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The shop policy type.
     */
    private ShopPolicyType type;

    /**
     * The public URL of the policy.
     */
    private String url;

    public ShopPolicy build() {
      ShopPolicy result = new ShopPolicy();
      result.body = this.body;
      result.id = this.id;
      result.translations = this.translations;
      result.type = this.type;
      result.url = this.url;
      return result;
    }

    /**
     * The text of the policy. The maximum size is 512kb.
     */
    public Builder body(String body) {
      this.body = body;
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

    /**
     * The shop policy type.
     */
    public Builder type(ShopPolicyType type) {
      this.type = type;
      return this;
    }

    /**
     * The public URL of the policy.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
