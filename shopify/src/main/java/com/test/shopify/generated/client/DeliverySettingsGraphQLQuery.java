package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the shop-wide shipping settings.
 */
public class DeliverySettingsGraphQLQuery extends GraphQLQuery {
  public DeliverySettingsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public DeliverySettingsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "deliverySettings";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public DeliverySettingsGraphQLQuery build() {
      return new DeliverySettingsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
