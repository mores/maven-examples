package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MarketingActivityUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a marketing activity with the latest information.
 */
public class MarketingActivityUpdateGraphQLQuery extends GraphQLQuery {
  public MarketingActivityUpdateGraphQLQuery(MarketingActivityUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketingActivityUpdateInput input;

    private String queryName;

    public MarketingActivityUpdateGraphQLQuery build() {
      return new MarketingActivityUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The Input of the marketing activity.
     */
    public Builder input(MarketingActivityUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
