package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductVariantInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a product variant.
 */
public class ProductVariantCreateGraphQLQuery extends GraphQLQuery {
  public ProductVariantCreateGraphQLQuery(ProductVariantInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductVariantCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductVariantInput input;

    private String queryName;

    public ProductVariantCreateGraphQLQuery build() {
      return new ProductVariantCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties for the new product variant.
     */
    public Builder input(ProductVariantInput input) {
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
