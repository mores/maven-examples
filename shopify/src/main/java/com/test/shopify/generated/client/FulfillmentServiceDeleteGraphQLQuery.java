package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.FulfillmentServiceDeleteInventoryAction;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a fulfillment service.
 */
public class FulfillmentServiceDeleteGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceDeleteGraphQLQuery(String id, String destinationLocationId,
      FulfillmentServiceDeleteInventoryAction inventoryAction, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (destinationLocationId != null || fieldsSet.contains("destinationLocationId")) {
        getInput().put("destinationLocationId", destinationLocationId);
    }if (inventoryAction != null || fieldsSet.contains("inventoryAction")) {
        getInput().put("inventoryAction", inventoryAction);
    }
  }

  public FulfillmentServiceDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String destinationLocationId;

    private FulfillmentServiceDeleteInventoryAction inventoryAction;

    private String queryName;

    public FulfillmentServiceDeleteGraphQLQuery build() {
      return new FulfillmentServiceDeleteGraphQLQuery(id, destinationLocationId, inventoryAction, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment service to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of an active merchant managed location where inventory and commitments will be relocated
     * after the fulfillment service is deleted.
     *     
     * Inventory will only be transferred if the
     * [`TRANSFER`](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentServiceDeleteInventoryAction#value-transfer)
     * inventory action has been chosen.
     */
    public Builder destinationLocationId(String destinationLocationId) {
      this.destinationLocationId = destinationLocationId;
      this.fieldsSet.add("destinationLocationId");
      return this;
    }

    /**
     * The action to take with the location after the fulfillment service is deleted.
     */
    public Builder inventoryAction(FulfillmentServiceDeleteInventoryAction inventoryAction) {
      this.inventoryAction = inventoryAction;
      this.fieldsSet.add("inventoryAction");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
