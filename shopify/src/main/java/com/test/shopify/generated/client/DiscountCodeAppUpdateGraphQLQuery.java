package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.DiscountCodeAppInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a code app discount.
 */
public class DiscountCodeAppUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeAppUpdateGraphQLQuery(String id, DiscountCodeAppInput codeAppDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (codeAppDiscount != null || fieldsSet.contains("codeAppDiscount")) {
        getInput().put("codeAppDiscount", codeAppDiscount);
    }
  }

  public DiscountCodeAppUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeAppUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeAppInput codeAppDiscount;

    private String queryName;

    public DiscountCodeAppUpdateGraphQLQuery build() {
      return new DiscountCodeAppUpdateGraphQLQuery(id, codeAppDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code app discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields required to update the code app discount.
     */
    public Builder codeAppDiscount(DiscountCodeAppInput codeAppDiscount) {
      this.codeAppDiscount = codeAppDiscount;
      this.fieldsSet.add("codeAppDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
