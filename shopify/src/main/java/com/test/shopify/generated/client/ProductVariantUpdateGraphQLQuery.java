package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductVariantInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a product variant.
 */
public class ProductVariantUpdateGraphQLQuery extends GraphQLQuery {
  public ProductVariantUpdateGraphQLQuery(ProductVariantInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductVariantUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductVariantInput input;

    private String queryName;

    public ProductVariantUpdateGraphQLQuery build() {
      return new ProductVariantUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The updated properties for the product variant.
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
