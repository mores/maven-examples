package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Completes a draft order and creates an order.
 */
public class DraftOrderCompleteGraphQLQuery extends GraphQLQuery {
  public DraftOrderCompleteGraphQLQuery(String id, String paymentGatewayId, String sourceName,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentGatewayId != null || fieldsSet.contains("paymentGatewayId")) {
        getInput().put("paymentGatewayId", paymentGatewayId);
    }if (sourceName != null || fieldsSet.contains("sourceName")) {
        getInput().put("sourceName", sourceName);
    }
  }

  public DraftOrderCompleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderComplete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String paymentGatewayId;

    private String sourceName;

    private String queryName;

    public DraftOrderCompleteGraphQLQuery build() {
      return new DraftOrderCompleteGraphQLQuery(id, paymentGatewayId, sourceName, queryName, fieldsSet);
               
    }

    /**
     * The draft order to complete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The gateway for the completed draft order.
     */
    public Builder paymentGatewayId(String paymentGatewayId) {
      this.paymentGatewayId = paymentGatewayId;
      this.fieldsSet.add("paymentGatewayId");
      return this;
    }

    /**
     * A channel definition handle used for sales channel attribution.
     */
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      this.fieldsSet.add("sourceName");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
