package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductDuplicateAsyncInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously duplicate a single product.
 */
public class ProductDuplicateAsyncGraphQLQuery extends GraphQLQuery {
  public ProductDuplicateAsyncGraphQLQuery(ProductDuplicateAsyncInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductDuplicateAsyncGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDuplicateAsync";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductDuplicateAsyncInput input;

    private String queryName;

    public ProductDuplicateAsyncGraphQLQuery build() {
      return new ProductDuplicateAsyncGraphQLQuery(input, queryName, fieldsSet);
               
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
