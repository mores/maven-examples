package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a specific node (any object that implements the
 * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
 * interface) by ID, in accordance with the
 * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
 * This field is commonly used for refetching an object.
 */
public class NodeGraphQLQuery extends GraphQLQuery {
  public NodeGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public NodeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "node";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public NodeGraphQLQuery build() {
      return new NodeGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Node` to return.
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
