package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A PolarisViz response to a ShopifyQL query.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PolarisVizResponse implements com.test.shopify.generated.types.ShopifyqlResponse {
  /**
   * The PolarisViz visualization of data.
   */
  private List<PolarisVizDataSeries> data;

  /**
   * A list of parse errors, if parsing fails.
   */
  private List<ParseError> parseErrors;

  /**
   * The result in a tabular format with schema and row data.
   *                 It's always present even if query has a `VISUALIZE` keyword.
   */
  private TableData tableData;

  /**
   * The type of visualization. For example, a line chart.
   */
  private VisualizationType vizType;

  public PolarisVizResponse() {
  }

  /**
   * The PolarisViz visualization of data.
   */
  public List<PolarisVizDataSeries> getData() {
    return data;
  }

  public void setData(List<PolarisVizDataSeries> data) {
    this.data = data;
  }

  /**
   * A list of parse errors, if parsing fails.
   */
  public List<ParseError> getParseErrors() {
    return parseErrors;
  }

  public void setParseErrors(List<ParseError> parseErrors) {
    this.parseErrors = parseErrors;
  }

  /**
   * The result in a tabular format with schema and row data.
   *                 It's always present even if query has a `VISUALIZE` keyword.
   */
  public TableData getTableData() {
    return tableData;
  }

  public void setTableData(TableData tableData) {
    this.tableData = tableData;
  }

  /**
   * The type of visualization. For example, a line chart.
   */
  public VisualizationType getVizType() {
    return vizType;
  }

  public void setVizType(VisualizationType vizType) {
    this.vizType = vizType;
  }

  @Override
  public String toString() {
    return "PolarisVizResponse{data='" + data + "', parseErrors='" + parseErrors + "', tableData='" + tableData + "', vizType='" + vizType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolarisVizResponse that = (PolarisVizResponse) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(parseErrors, that.parseErrors) &&
        Objects.equals(tableData, that.tableData) &&
        Objects.equals(vizType, that.vizType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, parseErrors, tableData, vizType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The PolarisViz visualization of data.
     */
    private List<PolarisVizDataSeries> data;

    /**
     * A list of parse errors, if parsing fails.
     */
    private List<ParseError> parseErrors;

    /**
     * The result in a tabular format with schema and row data.
     *                 It's always present even if query has a `VISUALIZE` keyword.
     */
    private TableData tableData;

    /**
     * The type of visualization. For example, a line chart.
     */
    private VisualizationType vizType;

    public PolarisVizResponse build() {
      PolarisVizResponse result = new PolarisVizResponse();
      result.data = this.data;
      result.parseErrors = this.parseErrors;
      result.tableData = this.tableData;
      result.vizType = this.vizType;
      return result;
    }

    /**
     * The PolarisViz visualization of data.
     */
    public Builder data(List<PolarisVizDataSeries> data) {
      this.data = data;
      return this;
    }

    /**
     * A list of parse errors, if parsing fails.
     */
    public Builder parseErrors(List<ParseError> parseErrors) {
      this.parseErrors = parseErrors;
      return this;
    }

    /**
     * The result in a tabular format with schema and row data.
     *                 It's always present even if query has a `VISUALIZE` keyword.
     */
    public Builder tableData(TableData tableData) {
      this.tableData = tableData;
      return this;
    }

    /**
     * The type of visualization. For example, a line chart.
     */
    public Builder vizType(VisualizationType vizType) {
      this.vizType = vizType;
      return this;
    }
  }
}
