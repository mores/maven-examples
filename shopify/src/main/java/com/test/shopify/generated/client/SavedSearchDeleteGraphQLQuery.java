package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.SavedSearchDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete a saved search.
 */
public class SavedSearchDeleteGraphQLQuery extends GraphQLQuery {
  public SavedSearchDeleteGraphQLQuery(SavedSearchDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SavedSearchDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "savedSearchDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SavedSearchDeleteInput input;

    private String queryName;

    public SavedSearchDeleteGraphQLQuery build() {
      return new SavedSearchDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to delete a saved search.
     */
    public Builder input(SavedSearchDeleteInput input) {
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
