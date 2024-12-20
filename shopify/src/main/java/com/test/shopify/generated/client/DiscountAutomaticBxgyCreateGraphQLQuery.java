package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountAutomaticBxgyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a BXGY automatic discount.
 */
public class DiscountAutomaticBxgyCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBxgyCreateGraphQLQuery(DiscountAutomaticBxgyInput automaticBxgyDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
  }

  public DiscountAutomaticBxgyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBxgyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountAutomaticBxgyInput automaticBxgyDiscount;

    private String queryName;

    public DiscountAutomaticBxgyCreateGraphQLQuery build() {
      return new DiscountAutomaticBxgyCreateGraphQLQuery(automaticBxgyDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the automatic discount.
     */
    public Builder automaticBxgyDiscount(DiscountAutomaticBxgyInput automaticBxgyDiscount) {
      this.automaticBxgyDiscount = automaticBxgyDiscount;
      this.fieldsSet.add("automaticBxgyDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
