package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activate an inventory item at a location.
 */
public class InventoryActivateGraphQLQuery extends GraphQLQuery {
  public InventoryActivateGraphQLQuery(String inventoryItemId, String locationId, Integer available,
      Integer onHand, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryItemId != null || fieldsSet.contains("inventoryItemId")) {
        getInput().put("inventoryItemId", inventoryItemId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (available != null || fieldsSet.contains("available")) {
        getInput().put("available", available);
    }if (onHand != null || fieldsSet.contains("onHand")) {
        getInput().put("onHand", onHand);
    }
  }

  public InventoryActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String inventoryItemId;

    private String locationId;

    private Integer available;

    private Integer onHand;

    private String queryName;

    public InventoryActivateGraphQLQuery build() {
      return new InventoryActivateGraphQLQuery(inventoryItemId, locationId, available, onHand, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory item to activate.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      this.fieldsSet.add("inventoryItemId");
      return this;
    }

    /**
     * The ID of the location of the inventory item being activated.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The initial available quantity of the inventory item being activated at the location.
     */
    public Builder available(Integer available) {
      this.available = available;
      this.fieldsSet.add("available");
      return this;
    }

    /**
     * The initial on_hand quantity of the inventory item being activated at the location.
     */
    public Builder onHand(Integer onHand) {
      this.onHand = onHand;
      this.fieldsSet.add("onHand");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
