package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a discount code for a price rule.
 */
public class PriceRuleDiscountCodeUpdateGraphQLQuery extends GraphQLQuery {
  public PriceRuleDiscountCodeUpdateGraphQLQuery(String priceRuleId, String code, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceRuleId != null || fieldsSet.contains("priceRuleId")) {
        getInput().put("priceRuleId", priceRuleId);
    }if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public PriceRuleDiscountCodeUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceRuleDiscountCodeUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceRuleId;

    private String code;

    private String queryName;

    public PriceRuleDiscountCodeUpdateGraphQLQuery build() {
      return new PriceRuleDiscountCodeUpdateGraphQLQuery(priceRuleId, code, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price rule object.
     */
    public Builder priceRuleId(String priceRuleId) {
      this.priceRuleId = priceRuleId;
      this.fieldsSet.add("priceRuleId");
      return this;
    }

    /**
     * The new code of a price rule.
     */
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
