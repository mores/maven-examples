package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.SubscriptionContractProductChangeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Allows for the easy change of a Product in a Contract or a Product price change.
 */
public class SubscriptionContractProductChangeGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractProductChangeGraphQLQuery(String subscriptionContractId, String lineId,
      SubscriptionContractProductChangeInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionContractProductChangeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractProductChange";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String subscriptionContractId;

    private String lineId;

    private SubscriptionContractProductChangeInput input;

    private String queryName;

    public SubscriptionContractProductChangeGraphQLQuery build() {
      return new SubscriptionContractProductChangeGraphQLQuery(subscriptionContractId, lineId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the subscription contract.
     */
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    /**
     * The gid of the Subscription Line to update.
     */
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      this.fieldsSet.add("lineId");
      return this;
    }

    /**
     * The properties of the Product changes.
     */
    public Builder input(SubscriptionContractProductChangeInput input) {
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
