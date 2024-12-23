package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.FulfillmentInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a fulfillment for one or many fulfillment orders.
 * The fulfillment orders are associated with the same order and are assigned to the same location.
 */
public class FulfillmentCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentCreateGraphQLQuery(FulfillmentInput fulfillment, String message,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillment != null || fieldsSet.contains("fulfillment")) {
        getInput().put("fulfillment", fulfillment);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentInput fulfillment;

    private String message;

    private String queryName;

    public FulfillmentCreateGraphQLQuery build() {
      return new FulfillmentCreateGraphQLQuery(fulfillment, message, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to create a fulfillment from fulfillment orders.
     */
    public Builder fulfillment(FulfillmentInput fulfillment) {
      this.fulfillment = fulfillment;
      this.fieldsSet.add("fulfillment");
      return this;
    }

    /**
     * An optional message for the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
