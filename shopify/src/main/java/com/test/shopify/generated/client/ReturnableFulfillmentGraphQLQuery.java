package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Lookup a returnable fulfillment by ID.
 */
public class ReturnableFulfillmentGraphQLQuery extends GraphQLQuery {
  public ReturnableFulfillmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ReturnableFulfillmentGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "returnableFulfillment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ReturnableFulfillmentGraphQLQuery build() {
      return new ReturnableFulfillmentGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ReturnableFulfillment` to return.
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
