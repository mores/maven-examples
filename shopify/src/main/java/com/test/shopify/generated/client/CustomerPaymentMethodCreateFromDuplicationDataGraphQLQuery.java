package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a vaulted payment method for a customer from duplication data.
 *   
 * This data must be obtained from another shop within the same organization.
 *   
 * Currently, this only supports Shop Pay payment methods. This is only available for selected partner apps.
 */
public class CustomerPaymentMethodCreateFromDuplicationDataGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodCreateFromDuplicationDataGraphQLQuery(String customerId,
      MailingAddressInput billingAddress, String encryptedDuplicationData, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (encryptedDuplicationData != null || fieldsSet.contains("encryptedDuplicationData")) {
        getInput().put("encryptedDuplicationData", encryptedDuplicationData);
    }
  }

  public CustomerPaymentMethodCreateFromDuplicationDataGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodCreateFromDuplicationData";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private MailingAddressInput billingAddress;

    private String encryptedDuplicationData;

    private String queryName;

    public CustomerPaymentMethodCreateFromDuplicationDataGraphQLQuery build() {
      return new CustomerPaymentMethodCreateFromDuplicationDataGraphQLQuery(customerId, billingAddress, encryptedDuplicationData, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
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
     * The encrypted payment method data.
     */
    public Builder encryptedDuplicationData(String encryptedDuplicationData) {
      this.encryptedDuplicationData = encryptedDuplicationData;
      this.fieldsSet.add("encryptedDuplicationData");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
