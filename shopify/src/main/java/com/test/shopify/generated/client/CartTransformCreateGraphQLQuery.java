package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a CartTransform function to the Shop.
 */
public class CartTransformCreateGraphQLQuery extends GraphQLQuery {
  public CartTransformCreateGraphQLQuery(String functionId, Boolean blockOnFailure,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }if (blockOnFailure != null || fieldsSet.contains("blockOnFailure")) {
        getInput().put("blockOnFailure", blockOnFailure);
    }
  }

  public CartTransformCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartTransformCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String functionId;

    private Boolean blockOnFailure;

    private String queryName;

    public CartTransformCreateGraphQLQuery build() {
      return new CartTransformCreateGraphQLQuery(functionId, blockOnFailure, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the Function providing the cart transform.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      this.fieldsSet.add("functionId");
      return this;
    }

    /**
     * Whether a run failure should block cart and checkout operations.
     */
    public Builder blockOnFailure(Boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      this.fieldsSet.add("blockOnFailure");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
