package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends a cancellation request to the fulfillment service of a fulfillment order.
 */
public class FulfillmentOrderSubmitCancellationRequestGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderSubmitCancellationRequestGraphQLQuery(String id, String message,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentOrderSubmitCancellationRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderSubmitCancellationRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String message;

    private String queryName;

    public FulfillmentOrderSubmitCancellationRequestGraphQLQuery build() {
      return new FulfillmentOrderSubmitCancellationRequestGraphQLQuery(id, message, queryName, fieldsSet);
               
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
     * An optional reason for the cancellation request.
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
