package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.LocationAddInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a new location.
 */
public class LocationAddGraphQLQuery extends GraphQLQuery {
  public LocationAddGraphQLQuery(LocationAddInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public LocationAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private LocationAddInput input;

    private String queryName;

    public LocationAddGraphQLQuery build() {
      return new LocationAddGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the location to add.
     */
    public Builder input(LocationAddInput input) {
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
