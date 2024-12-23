package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a DraftOrderTag resource by ID.
 */
public class DraftOrderTagGraphQLQuery extends GraphQLQuery {
  public DraftOrderTagGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DraftOrderTagGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "draftOrderTag";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DraftOrderTagGraphQLQuery build() {
      return new DraftOrderTagGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `DraftOrderTag` to return.
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
