package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountAutomaticBxgyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates an existing Buy X, Get Y (BXGY) automatic discount.
 */
public class DiscountAutomaticBxgyUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBxgyUpdateGraphQLQuery(String id,
      DiscountAutomaticBxgyInput automaticBxgyDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
  }

  public DiscountAutomaticBxgyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBxgyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountAutomaticBxgyInput automaticBxgyDiscount;

    private String queryName;

    public DiscountAutomaticBxgyUpdateGraphQLQuery build() {
      return new DiscountAutomaticBxgyUpdateGraphQLQuery(id, automaticBxgyDiscount, queryName, fieldsSet);
               
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
