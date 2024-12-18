package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.List;

/**
 * A response to a ShopifyQL query.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = PolarisVizResponse.class, name = "PolarisVizResponse"),
    @JsonSubTypes.Type(value = TableResponse.class, name = "TableResponse")
})
public interface ShopifyqlResponse {
  /**
   * A list of parse errors, if parsing fails.
   */
  List<ParseError> getParseErrors();

  /**
   * The result in a tabular format with schema and row data.
   *           To be used as a raw 2-dimensional response of the query.
   *           It's always present even if query has a `VISUALIZE` keyword.
   */
  TableData getTableData();
}
