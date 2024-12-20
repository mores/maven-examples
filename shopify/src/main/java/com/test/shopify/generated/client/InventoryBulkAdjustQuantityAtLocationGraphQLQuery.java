package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.InventoryAdjustItemInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adjusts the inventory at a location for multiple inventory items.
 */
public class InventoryBulkAdjustQuantityAtLocationGraphQLQuery extends GraphQLQuery {
  public InventoryBulkAdjustQuantityAtLocationGraphQLQuery(
      List<InventoryAdjustItemInput> inventoryItemAdjustments, String locationId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryItemAdjustments != null || fieldsSet.contains("inventoryItemAdjustments")) {
        getInput().put("inventoryItemAdjustments", inventoryItemAdjustments);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public InventoryBulkAdjustQuantityAtLocationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryBulkAdjustQuantityAtLocation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<InventoryAdjustItemInput> inventoryItemAdjustments;

    private String locationId;

    private String queryName;

    public InventoryBulkAdjustQuantityAtLocationGraphQLQuery build() {
      return new InventoryBulkAdjustQuantityAtLocationGraphQLQuery(inventoryItemAdjustments, locationId, queryName, fieldsSet);
               
    }

    /**
     * Specifies adjustments for items.
     */
    public Builder inventoryItemAdjustments(
        List<InventoryAdjustItemInput> inventoryItemAdjustments) {
      this.inventoryItemAdjustments = inventoryItemAdjustments;
      this.fieldsSet.add("inventoryItemAdjustments");
      return this;
    }

    /**
     * Specifies where the item should be adjusted.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
