package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountCodeBasicInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a basic code discount.
 */
public class DiscountCodeBasicCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBasicCreateGraphQLQuery(DiscountCodeBasicInput basicCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (basicCodeDiscount != null || fieldsSet.contains("basicCodeDiscount")) {
        getInput().put("basicCodeDiscount", basicCodeDiscount);
    }
  }

  public DiscountCodeBasicCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBasicCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeBasicInput basicCodeDiscount;

    private String queryName;

    public DiscountCodeBasicCreateGraphQLQuery build() {
      return new DiscountCodeBasicCreateGraphQLQuery(basicCodeDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the code discount.
     */
    public Builder basicCodeDiscount(DiscountCodeBasicInput basicCodeDiscount) {
      this.basicCodeDiscount = basicCodeDiscount;
      this.fieldsSet.add("basicCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
