package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the credit card payment method for a customer.
 */
public class CustomerPaymentMethodCreditCardUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodCreditCardUpdateGraphQLQuery(String id,
      MailingAddressInput billingAddress, String sessionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (sessionId != null || fieldsSet.contains("sessionId")) {
        getInput().put("sessionId", sessionId);
    }
  }

  public CustomerPaymentMethodCreditCardUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodCreditCardUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MailingAddressInput billingAddress;

    private String sessionId;

    private String queryName;

    public CustomerPaymentMethodCreditCardUpdateGraphQLQuery build() {
      return new CustomerPaymentMethodCreditCardUpdateGraphQLQuery(id, billingAddress, sessionId, queryName, fieldsSet);
               
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

    /**
     * The Cardserver session ID.
     */
    public Builder sessionId(String sessionId) {
      this.sessionId = sessionId;
      this.fieldsSet.add("sessionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
