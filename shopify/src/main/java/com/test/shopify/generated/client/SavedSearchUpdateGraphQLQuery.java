package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.SavedSearchUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a saved search.
 */
public class SavedSearchUpdateGraphQLQuery extends GraphQLQuery {
  public SavedSearchUpdateGraphQLQuery(SavedSearchUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SavedSearchUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "savedSearchUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SavedSearchUpdateInput input;

    private String queryName;

    public SavedSearchUpdateGraphQLQuery build() {
      return new SavedSearchUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to update a saved search.
     */
    public Builder input(SavedSearchUpdateInput input) {
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
