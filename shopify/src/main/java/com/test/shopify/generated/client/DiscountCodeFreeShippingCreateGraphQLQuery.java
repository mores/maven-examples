package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountCodeFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a free shipping code discount.
 */
public class DiscountCodeFreeShippingCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeFreeShippingCreateGraphQLQuery(
      DiscountCodeFreeShippingInput freeShippingCodeDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (freeShippingCodeDiscount != null || fieldsSet.contains("freeShippingCodeDiscount")) {
        getInput().put("freeShippingCodeDiscount", freeShippingCodeDiscount);
    }
  }

  public DiscountCodeFreeShippingCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeFreeShippingCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeFreeShippingInput freeShippingCodeDiscount;

    private String queryName;

    public DiscountCodeFreeShippingCreateGraphQLQuery build() {
      return new DiscountCodeFreeShippingCreateGraphQLQuery(freeShippingCodeDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the code discount.
     */
    public Builder freeShippingCodeDiscount(
        DiscountCodeFreeShippingInput freeShippingCodeDiscount) {
      this.freeShippingCodeDiscount = freeShippingCodeDiscount;
      this.fieldsSet.add("freeShippingCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
