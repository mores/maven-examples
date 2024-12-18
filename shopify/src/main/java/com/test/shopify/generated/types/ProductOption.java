package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The product property names. For example, "Size", "Color", and "Material".
 * Variants are selected based on permutations of these options.
 * The limit for each product property name is 255 characters.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOption implements com.test.shopify.generated.types.HasPublishedTranslations, com.test.shopify.generated.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The product option’s name.
   */
  private String name;

  /**
   * The product option's position.
   */
  private int position;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The corresponding value to the product option name.
   */
  private List<String> values;

  public ProductOption() {
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
   * The product option’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The product option's position.
   */
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
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
   * The corresponding value to the product option name.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductOption{id='" + id + "', name='" + name + "', position='" + position + "', translations='" + translations + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOption that = (ProductOption) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        position == that.position &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, translations, values);
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
     * The product option’s name.
     */
    private String name;

    /**
     * The product option's position.
     */
    private int position;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The corresponding value to the product option name.
     */
    private List<String> values;

    public ProductOption build() {
      ProductOption result = new ProductOption();
      result.id = this.id;
      result.name = this.name;
      result.position = this.position;
      result.translations = this.translations;
      result.values = this.values;
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
     * The product option’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The product option's position.
     */
    public Builder position(int position) {
      this.position = position;
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
     * The corresponding value to the product option name.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
