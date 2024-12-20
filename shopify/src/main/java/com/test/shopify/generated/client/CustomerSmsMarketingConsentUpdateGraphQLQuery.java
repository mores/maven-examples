package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.CustomerSmsMarketingConsentUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a customer's SMS marketing consent information.
 */
public class CustomerSmsMarketingConsentUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerSmsMarketingConsentUpdateGraphQLQuery(CustomerSmsMarketingConsentUpdateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerSmsMarketingConsentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSmsMarketingConsentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerSmsMarketingConsentUpdateInput input;

    private String queryName;

    public CustomerSmsMarketingConsentUpdateGraphQLQuery build() {
      return new CustomerSmsMarketingConsentUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields to update a customer's SMS marketing consent information.
     */
    public Builder input(CustomerSmsMarketingConsentUpdateInput input) {
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
