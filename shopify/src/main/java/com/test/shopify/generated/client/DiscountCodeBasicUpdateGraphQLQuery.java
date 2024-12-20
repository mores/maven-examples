package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountCodeBasicInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a basic code discount.
 */
public class DiscountCodeBasicUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBasicUpdateGraphQLQuery(String id, DiscountCodeBasicInput basicCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (basicCodeDiscount != null || fieldsSet.contains("basicCodeDiscount")) {
        getInput().put("basicCodeDiscount", basicCodeDiscount);
    }
  }

  public DiscountCodeBasicUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBasicUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeBasicInput basicCodeDiscount;

    private String queryName;

    public DiscountCodeBasicUpdateGraphQLQuery build() {
      return new DiscountCodeBasicUpdateGraphQLQuery(id, basicCodeDiscount, queryName, fieldsSet);
               
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
