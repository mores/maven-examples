package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes an external marketing activity.
 */
public class MarketingActivityDeleteExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityDeleteExternalGraphQLQuery(String marketingActivityId, String remoteId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }
  }

  public MarketingActivityDeleteExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityDeleteExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String marketingActivityId;

    private String remoteId;

    private String queryName;

    public MarketingActivityDeleteExternalGraphQLQuery build() {
      return new MarketingActivityDeleteExternalGraphQLQuery(marketingActivityId, remoteId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the marketing activity. A marketing activity ID or remote ID must be provided.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * The ID of an activity that's hosted outside of Shopify. A marketing activity ID or remote ID must be provided.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
