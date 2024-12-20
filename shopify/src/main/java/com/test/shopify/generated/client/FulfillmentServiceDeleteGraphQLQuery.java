package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a fulfillment service.
 */
public class FulfillmentServiceDeleteGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceDeleteGraphQLQuery(String id, String destinationLocationId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (destinationLocationId != null || fieldsSet.contains("destinationLocationId")) {
        getInput().put("destinationLocationId", destinationLocationId);
    }
  }

  public FulfillmentServiceDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String destinationLocationId;

    private String queryName;

    public FulfillmentServiceDeleteGraphQLQuery build() {
      return new FulfillmentServiceDeleteGraphQLQuery(id, destinationLocationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment service to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the location where inventory and commitments will be relocated
     * after the fulfillment service is deleted.
     */
    public Builder destinationLocationId(String destinationLocationId) {
      this.destinationLocationId = destinationLocationId;
      this.fieldsSet.add("destinationLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
