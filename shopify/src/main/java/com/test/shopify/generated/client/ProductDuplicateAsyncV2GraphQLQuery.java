package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductDuplicateAsyncInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously duplicate a single product.
 *   
 * For API version 2024-10 and higher, use the `productDuplicate` mutation with the `synchronous: false` argument instead.
 */
public class ProductDuplicateAsyncV2GraphQLQuery extends GraphQLQuery {
  public ProductDuplicateAsyncV2GraphQLQuery(ProductDuplicateAsyncInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductDuplicateAsyncV2GraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDuplicateAsyncV2";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductDuplicateAsyncInput input;

    private String queryName;

    public ProductDuplicateAsyncV2GraphQLQuery build() {
      return new ProductDuplicateAsyncV2GraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The params for duplicating the product.
     */
    public Builder input(ProductDuplicateAsyncInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
