package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns dispute details based on ID.
 */
public class DisputeGraphQLQuery extends GraphQLQuery {
  public DisputeGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DisputeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "dispute";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DisputeGraphQLQuery build() {
      return new DisputeGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ShopifyPaymentsDispute` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
