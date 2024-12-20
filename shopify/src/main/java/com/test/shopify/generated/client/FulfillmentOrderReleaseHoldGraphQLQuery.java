package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Releases the fulfillment hold on a fulfillment order.
 */
public class FulfillmentOrderReleaseHoldGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderReleaseHoldGraphQLQuery(String id, String externalId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (externalId != null || fieldsSet.contains("externalId")) {
        getInput().put("externalId", externalId);
    }
  }

  public FulfillmentOrderReleaseHoldGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderReleaseHold";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String externalId;

    private String queryName;

    public FulfillmentOrderReleaseHoldGraphQLQuery build() {
      return new FulfillmentOrderReleaseHoldGraphQLQuery(id, externalId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order for which to release the fulfillment hold.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A configurable ID used to track the automation system releasing this hold.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      this.fieldsSet.add("externalId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
