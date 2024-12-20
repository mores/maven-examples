package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.PaymentTermsCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create payment terms on an order. To create payment terms on a draft order,
 * use a draft order mutation and include the request with the `DraftOrderInput`.
 */
public class PaymentTermsCreateGraphQLQuery extends GraphQLQuery {
  public PaymentTermsCreateGraphQLQuery(String referenceId,
      PaymentTermsCreateInput paymentTermsAttributes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (referenceId != null || fieldsSet.contains("referenceId")) {
        getInput().put("referenceId", referenceId);
    }if (paymentTermsAttributes != null || fieldsSet.contains("paymentTermsAttributes")) {
        getInput().put("paymentTermsAttributes", paymentTermsAttributes);
    }
  }

  public PaymentTermsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentTermsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String referenceId;

    private PaymentTermsCreateInput paymentTermsAttributes;

    private String queryName;

    public PaymentTermsCreateGraphQLQuery build() {
      return new PaymentTermsCreateGraphQLQuery(referenceId, paymentTermsAttributes, queryName, fieldsSet);
               
    }

    /**
     * Specifies the reference orderId to add the payment terms for.
     */
    public Builder referenceId(String referenceId) {
      this.referenceId = referenceId;
      this.fieldsSet.add("referenceId");
      return this;
    }

    /**
     * The attributes used to create the payment terms.
     */
    public Builder paymentTermsAttributes(PaymentTermsCreateInput paymentTermsAttributes) {
      this.paymentTermsAttributes = paymentTermsAttributes;
      this.fieldsSet.add("paymentTermsAttributes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
