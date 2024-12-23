package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.SubscriptionBillingCycleBulkFilters;
import com.test.shopify.generated.types.SubscriptionBillingCyclesDateRangeSelector;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously queries and charges all subscription billing cycles whose [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-billingattemptexpecteddate)
 * values fall within a specified date range and meet additional filtering
 * criteria. The results of this action can be retrieved using the [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscriptionBillingCycleBulkResults) query.
 */
public class SubscriptionBillingCycleBulkChargeGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleBulkChargeGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }
  }

  public SubscriptionBillingCycleBulkChargeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleBulkCharge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange;

    private SubscriptionBillingCycleBulkFilters filters;

    private String queryName;

    public SubscriptionBillingCycleBulkChargeGraphQLQuery build() {
      return new SubscriptionBillingCycleBulkChargeGraphQLQuery(billingAttemptExpectedDateRange, filters, queryName, fieldsSet);
               
    }

    /**
     * Specifies the date range within which the `billingAttemptExpectedDate` values of the billing cycles should fall.
     */
    public Builder billingAttemptExpectedDateRange(
        SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange) {
      this.billingAttemptExpectedDateRange = billingAttemptExpectedDateRange;
      this.fieldsSet.add("billingAttemptExpectedDateRange");
      return this;
    }

    /**
     * Criteria to filter the billing cycles on which the action is executed.
     */
    public Builder filters(SubscriptionBillingCycleBulkFilters filters) {
      this.filters = filters;
      this.fieldsSet.add("filters");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
