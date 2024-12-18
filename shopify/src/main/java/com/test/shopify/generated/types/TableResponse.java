package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The default table response structure for a ShopifyQL query.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TableResponse implements com.test.shopify.generated.types.ShopifyqlResponse {
  /**
   * A list of parse errors, if parsing fails.
   */
  private List<ParseError> parseErrors;

  /**
   * The result in a tabular format with schema and row data.
   */
  private TableData tableData;

  public TableResponse() {
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
   */
  public TableData getTableData() {
    return tableData;
  }

  public void setTableData(TableData tableData) {
    this.tableData = tableData;
  }

  @Override
  public String toString() {
    return "TableResponse{parseErrors='" + parseErrors + "', tableData='" + tableData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableResponse that = (TableResponse) o;
    return Objects.equals(parseErrors, that.parseErrors) &&
        Objects.equals(tableData, that.tableData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseErrors, tableData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of parse errors, if parsing fails.
     */
    private List<ParseError> parseErrors;

    /**
     * The result in a tabular format with schema and row data.
     */
    private TableData tableData;

    public TableResponse build() {
      TableResponse result = new TableResponse();
      result.parseErrors = this.parseErrors;
      result.tableData = this.tableData;
      return result;
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
     */
    public Builder tableData(TableData tableData) {
      this.tableData = tableData;
      return this;
    }
  }
}
