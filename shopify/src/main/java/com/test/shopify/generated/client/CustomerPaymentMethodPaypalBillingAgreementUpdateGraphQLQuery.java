package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a PayPal billing agreement for a customer.
 */
public class CustomerPaymentMethodPaypalBillingAgreementUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodPaypalBillingAgreementUpdateGraphQLQuery(String id,
      MailingAddressInput billingAddress, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }
  }

  public CustomerPaymentMethodPaypalBillingAgreementUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodPaypalBillingAgreementUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MailingAddressInput billingAddress;

    private String queryName;

    public CustomerPaymentMethodPaypalBillingAgreementUpdateGraphQLQuery build() {
      return new CustomerPaymentMethodPaypalBillingAgreementUpdateGraphQLQuery(id, billingAddress, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer payment method.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The billing address.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      this.fieldsSet.add("billingAddress");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
