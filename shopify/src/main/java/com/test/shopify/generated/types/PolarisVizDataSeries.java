package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The data series used for PolarisViz visualization.
 */
public class PolarisVizDataSeries {
  /**
   * An array of data points.
   */
  private List<PolarisVizDataPoint> data;

  /**
   * Whether the series represents comparison data.
   */
  private boolean isComparison;

  /**
   * The name of the series.
   */
  private String name;

  public PolarisVizDataSeries() {
  }

  /**
   * An array of data points.
   */
  public List<PolarisVizDataPoint> getData() {
    return data;
  }

  public void setData(List<PolarisVizDataPoint> data) {
    this.data = data;
  }

  /**
   * Whether the series represents comparison data.
   */
  public boolean getIsComparison() {
    return isComparison;
  }

  public void setIsComparison(boolean isComparison) {
    this.isComparison = isComparison;
  }

  /**
   * The name of the series.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "PolarisVizDataSeries{data='" + data + "', isComparison='" + isComparison + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolarisVizDataSeries that = (PolarisVizDataSeries) o;
    return Objects.equals(data, that.data) &&
        isComparison == that.isComparison &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, isComparison, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An array of data points.
     */
    private List<PolarisVizDataPoint> data;

    /**
     * Whether the series represents comparison data.
     */
    private boolean isComparison;

    /**
     * The name of the series.
     */
    private String name;

    public PolarisVizDataSeries build() {
      PolarisVizDataSeries result = new PolarisVizDataSeries();
      result.data = this.data;
      result.isComparison = this.isComparison;
      result.name = this.name;
      return result;
    }

    /**
     * An array of data points.
     */
    public Builder data(List<PolarisVizDataPoint> data) {
      this.data = data;
      return this;
    }

    /**
     * Whether the series represents comparison data.
     */
    public Builder isComparison(boolean isComparison) {
      this.isComparison = isComparison;
      return this;
    }

    /**
     * The name of the series.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
