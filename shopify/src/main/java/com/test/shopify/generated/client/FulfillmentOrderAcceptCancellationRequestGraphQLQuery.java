package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Accept a cancellation request sent to a fulfillment service for a fulfillment order.
 */
public class FulfillmentOrderAcceptCancellationRequestGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderAcceptCancellationRequestGraphQLQuery(String id, String message,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentOrderAcceptCancellationRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderAcceptCancellationRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String message;

    private String queryName;

    public FulfillmentOrderAcceptCancellationRequestGraphQLQuery build() {
      return new FulfillmentOrderAcceptCancellationRequestGraphQLQuery(id, message, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order associated with the cancellation request.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * An optional reason for accepting the cancellation request.
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
