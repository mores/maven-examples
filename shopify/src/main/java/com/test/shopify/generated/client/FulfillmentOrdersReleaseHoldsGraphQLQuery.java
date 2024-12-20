package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Releases the fulfillment holds on a list of fulfillment orders.
 */
public class FulfillmentOrdersReleaseHoldsGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersReleaseHoldsGraphQLQuery(List<String> ids, String externalId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }if (externalId != null || fieldsSet.contains("externalId")) {
        getInput().put("externalId", externalId);
    }
  }

  public FulfillmentOrdersReleaseHoldsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrdersReleaseHolds";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private String externalId;

    private String queryName;

    public FulfillmentOrdersReleaseHoldsGraphQLQuery build() {
      return new FulfillmentOrdersReleaseHoldsGraphQLQuery(ids, externalId, queryName, fieldsSet);
               
    }

    /**
     * The IDs of the fulfillment orders for which to release the fulfillment holds.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * A configurable ID used to track the automation system releasing these holds.
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
