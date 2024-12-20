package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountCodeFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a free shipping code discount.
 */
public class DiscountCodeFreeShippingUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeFreeShippingUpdateGraphQLQuery(String id,
      DiscountCodeFreeShippingInput freeShippingCodeDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (freeShippingCodeDiscount != null || fieldsSet.contains("freeShippingCodeDiscount")) {
        getInput().put("freeShippingCodeDiscount", freeShippingCodeDiscount);
    }
  }

  public DiscountCodeFreeShippingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeFreeShippingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeFreeShippingInput freeShippingCodeDiscount;

    private String queryName;

    public DiscountCodeFreeShippingUpdateGraphQLQuery build() {
      return new DiscountCodeFreeShippingUpdateGraphQLQuery(id, freeShippingCodeDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the code discount.
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
