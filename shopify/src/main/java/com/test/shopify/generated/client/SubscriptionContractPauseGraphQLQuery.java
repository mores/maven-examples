package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Pauses a Subscription Contract.
 */
public class SubscriptionContractPauseGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractPauseGraphQLQuery(String subscriptionContractId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }
  }

  public SubscriptionContractPauseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractPause";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String subscriptionContractId;

    private String queryName;

    public SubscriptionContractPauseGraphQLQuery build() {
      return new SubscriptionContractPauseGraphQLQuery(subscriptionContractId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Subscription Contract.
     */
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
