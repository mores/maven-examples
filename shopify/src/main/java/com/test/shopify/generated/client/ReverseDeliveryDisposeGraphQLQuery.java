package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ReverseDeliveryDisposeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Disposes reverse delivery line items for a reverse delivery on the same shop.
 */
public class ReverseDeliveryDisposeGraphQLQuery extends GraphQLQuery {
  public ReverseDeliveryDisposeGraphQLQuery(List<ReverseDeliveryDisposeInput> dispositionInputs,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (dispositionInputs != null || fieldsSet.contains("dispositionInputs")) {
        getInput().put("dispositionInputs", dispositionInputs);
    }
  }

  public ReverseDeliveryDisposeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "reverseDeliveryDispose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ReverseDeliveryDisposeInput> dispositionInputs;

    private String queryName;

    public ReverseDeliveryDisposeGraphQLQuery build() {
      return new ReverseDeliveryDisposeGraphQLQuery(dispositionInputs, queryName, fieldsSet);
               
    }

    /**
     * The input parameters required to dispose reverse delivery line items.
     */
    public Builder dispositionInputs(List<ReverseDeliveryDisposeInput> dispositionInputs) {
      this.dispositionInputs = dispositionInputs;
      this.fieldsSet.add("dispositionInputs");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
