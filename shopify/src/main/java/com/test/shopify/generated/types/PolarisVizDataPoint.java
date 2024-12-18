package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A PolarisViz data point structure for ShopifyQL query.
 */
public class PolarisVizDataPoint {
  /**
   * The data key. Typically a category, dimension, or other qualitative data.
   */
  private String key;

  /**
   * The data value is numeric and quantitative.
   */
  private String value;

  public PolarisVizDataPoint() {
  }

  /**
   * The data key. Typically a category, dimension, or other qualitative data.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The data value is numeric and quantitative.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "PolarisVizDataPoint{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolarisVizDataPoint that = (PolarisVizDataPoint) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The data key. Typically a category, dimension, or other qualitative data.
     */
    private String key;

    /**
     * The data value is numeric and quantitative.
     */
    private String value;

    public PolarisVizDataPoint build() {
      PolarisVizDataPoint result = new PolarisVizDataPoint();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The data key. Typically a category, dimension, or other qualitative data.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The data value is numeric and quantitative.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
