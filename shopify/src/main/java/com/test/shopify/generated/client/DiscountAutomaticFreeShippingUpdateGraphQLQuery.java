package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountAutomaticFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a free shipping automatic discount.
 */
public class DiscountAutomaticFreeShippingUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticFreeShippingUpdateGraphQLQuery(String id,
      DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (freeShippingAutomaticDiscount != null || fieldsSet.contains("freeShippingAutomaticDiscount")) {
        getInput().put("freeShippingAutomaticDiscount", freeShippingAutomaticDiscount);
    }
  }

  public DiscountAutomaticFreeShippingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticFreeShippingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount;

    private String queryName;

    public DiscountAutomaticFreeShippingUpdateGraphQLQuery build() {
      return new DiscountAutomaticFreeShippingUpdateGraphQLQuery(id, freeShippingAutomaticDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the automatic discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the automatic discount.
     */
    public Builder freeShippingAutomaticDiscount(
        DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount) {
      this.freeShippingAutomaticDiscount = freeShippingAutomaticDiscount;
      this.fieldsSet.add("freeShippingAutomaticDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}