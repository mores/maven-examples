package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a product asynchronously, including all associated variants and media.
 */
public class ProductDeleteAsyncGraphQLQuery extends GraphQLQuery {
  public ProductDeleteAsyncGraphQLQuery(String productId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }
  }

  public ProductDeleteAsyncGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDeleteAsync";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private String queryName;

    public ProductDeleteAsyncGraphQLQuery build() {
      return new ProductDeleteAsyncGraphQLQuery(productId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product to be deleted.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
