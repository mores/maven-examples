package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activate a price rule.
 */
public class PriceRuleActivateGraphQLQuery extends GraphQLQuery {
  public PriceRuleActivateGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PriceRuleActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceRuleActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PriceRuleActivateGraphQLQuery build() {
      return new PriceRuleActivateGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * ID of the price rule to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
