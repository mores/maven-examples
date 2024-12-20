package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.PriceRuleDiscountCodeInput;
import com.test.shopify.generated.types.PriceRuleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a price rule using its ID and an input.
 */
public class PriceRuleUpdateGraphQLQuery extends GraphQLQuery {
  public PriceRuleUpdateGraphQLQuery(String id, PriceRuleInput priceRule,
      PriceRuleDiscountCodeInput priceRuleDiscountCode, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (priceRule != null || fieldsSet.contains("priceRule")) {
        getInput().put("priceRule", priceRule);
    }if (priceRuleDiscountCode != null || fieldsSet.contains("priceRuleDiscountCode")) {
        getInput().put("priceRuleDiscountCode", priceRuleDiscountCode);
    }
  }

  public PriceRuleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceRuleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private PriceRuleInput priceRule;

    private PriceRuleDiscountCodeInput priceRuleDiscountCode;

    private String queryName;

    public PriceRuleUpdateGraphQLQuery build() {
      return new PriceRuleUpdateGraphQLQuery(id, priceRule, priceRuleDiscountCode, queryName, fieldsSet);
               
    }

    /**
     * ID of the price rule to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to update a price rule.
     */
    public Builder priceRule(PriceRuleInput priceRule) {
      this.priceRule = priceRule;
      this.fieldsSet.add("priceRule");
      return this;
    }

    /**
     * The input fields to update the discount code of the price rule.
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
