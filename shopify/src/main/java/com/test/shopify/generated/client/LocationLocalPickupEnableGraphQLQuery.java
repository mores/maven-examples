package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DeliveryLocationLocalPickupEnableInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Enables local pickup for a location.
 */
public class LocationLocalPickupEnableGraphQLQuery extends GraphQLQuery {
  public LocationLocalPickupEnableGraphQLQuery(
      DeliveryLocationLocalPickupEnableInput localPickupSettings, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (localPickupSettings != null || fieldsSet.contains("localPickupSettings")) {
        getInput().put("localPickupSettings", localPickupSettings);
    }
  }

  public LocationLocalPickupEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationLocalPickupEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryLocationLocalPickupEnableInput localPickupSettings;

    private String queryName;

    public LocationLocalPickupEnableGraphQLQuery build() {
      return new LocationLocalPickupEnableGraphQLQuery(localPickupSettings, queryName, fieldsSet);
               
    }

    /**
     * The settings required to enable local pickup for a location.
     */
    public Builder localPickupSettings(DeliveryLocationLocalPickupEnableInput localPickupSettings) {
      this.localPickupSettings = localPickupSettings;
      this.fieldsSet.add("localPickupSettings");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
