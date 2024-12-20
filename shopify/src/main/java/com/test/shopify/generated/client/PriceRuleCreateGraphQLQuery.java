package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.PriceRuleDiscountCodeInput;
import com.test.shopify.generated.types.PriceRuleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a price rule using the input.
 */
public class PriceRuleCreateGraphQLQuery extends GraphQLQuery {
  public PriceRuleCreateGraphQLQuery(PriceRuleInput priceRule,
      PriceRuleDiscountCodeInput priceRuleDiscountCode, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceRule != null || fieldsSet.contains("priceRule")) {
        getInput().put("priceRule", priceRule);
    }if (priceRuleDiscountCode != null || fieldsSet.contains("priceRuleDiscountCode")) {
        getInput().put("priceRuleDiscountCode", priceRuleDiscountCode);
    }
  }

  public PriceRuleCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceRuleCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PriceRuleInput priceRule;

    private PriceRuleDiscountCodeInput priceRuleDiscountCode;

    private String queryName;

    public PriceRuleCreateGraphQLQuery build() {
      return new PriceRuleCreateGraphQLQuery(priceRule, priceRuleDiscountCode, queryName, fieldsSet);
               
    }

    /**
     * The input fields to create a price rule.
     */
    public Builder priceRule(PriceRuleInput priceRule) {
      this.priceRule = priceRule;
      this.fieldsSet.add("priceRule");
      return this;
    }

    /**
     * The input fields to create a discount code for the price rule.
     */
    public Builder priceRuleDiscountCode(PriceRuleDiscountCodeInput priceRuleDiscountCode) {
      this.priceRuleDiscountCode = priceRuleDiscountCode;
      this.fieldsSet.add("priceRuleDiscountCode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
