package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductUnpublishInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Unpublishes a product.
 */
public class ProductUnpublishGraphQLQuery extends GraphQLQuery {
  public ProductUnpublishGraphQLQuery(ProductUnpublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductUnpublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productUnpublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductUnpublishInput input;

    private String queryName;

    public ProductUnpublishGraphQLQuery build() {
      return new ProductUnpublishGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product to unpublish and the channel to unpublish it from.
     */
    public Builder input(ProductUnpublishInput input) {
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
