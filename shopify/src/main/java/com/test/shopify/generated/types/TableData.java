package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The result in a tabular format with schema information and formatted and unformatted row data.
 */
public class TableData {
  /**
   * The data table columns.
   */
  private List<TableDataColumn> columns;

  /**
   * The formatted data values.
   */
  private List<List<String>> rowData;

  /**
   * The unformatted data values.
   */
  private String unformattedData;

  public TableData() {
  }

  /**
   * The data table columns.
   */
  public List<TableDataColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TableDataColumn> columns) {
    this.columns = columns;
  }

  /**
   * The formatted data values.
   */
  public List<List<String>> getRowData() {
    return rowData;
  }

  public void setRowData(List<List<String>> rowData) {
    this.rowData = rowData;
  }

  /**
   * The unformatted data values.
   */
  public String getUnformattedData() {
    return unformattedData;
  }

  public void setUnformattedData(String unformattedData) {
    this.unformattedData = unformattedData;
  }

  @Override
  public String toString() {
    return "TableData{columns='" + columns + "', rowData='" + rowData + "', unformattedData='" + unformattedData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableData that = (TableData) o;
    return Objects.equals(columns, that.columns) &&
        Objects.equals(rowData, that.rowData) &&
        Objects.equals(unformattedData, that.unformattedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, rowData, unformattedData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The data table columns.
     */
    private List<TableDataColumn> columns;

    /**
     * The formatted data values.
     */
    private List<List<String>> rowData;

    /**
     * The unformatted data values.
     */
    private String unformattedData;

    public TableData build() {
      TableData result = new TableData();
      result.columns = this.columns;
      result.rowData = this.rowData;
      result.unformattedData = this.unformattedData;
      return result;
    }

    /**
     * The data table columns.
     */
    public Builder columns(List<TableDataColumn> columns) {
      this.columns = columns;
      return this;
    }

    /**
     * The formatted data values.
     */
    public Builder rowData(List<List<String>> rowData) {
      this.rowData = rowData;
      return this;
    }

    /**
     * The unformatted data values.
     */
    public Builder unformattedData(String unformattedData) {
      this.unformattedData = unformattedData;
      return this;
    }
  }
}
