package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.InventoryAdjustQuantityInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adjusts the inventory by a certain quantity.
 */
public class InventoryAdjustQuantityGraphQLQuery extends GraphQLQuery {
  public InventoryAdjustQuantityGraphQLQuery(InventoryAdjustQuantityInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryAdjustQuantityGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryAdjustQuantity";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryAdjustQuantityInput input;

    private String queryName;

    public InventoryAdjustQuantityGraphQLQuery build() {
      return new InventoryAdjustQuantityGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Provides the input fields required to update an inventory level.
     */
    public Builder input(InventoryAdjustQuantityInput input) {
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
