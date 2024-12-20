package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MetafieldInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a fulfillment constraint rule and its metafield.
 */
public class FulfillmentConstraintRuleCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRuleCreateGraphQLQuery(String functionId,
      List<MetafieldInput> metafields, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public FulfillmentConstraintRuleCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRuleCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String functionId;

    private List<MetafieldInput> metafields;

    private String queryName;

    public FulfillmentConstraintRuleCreateGraphQLQuery build() {
      return new FulfillmentConstraintRuleCreateGraphQLQuery(functionId, metafields, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the function providing the constraint rule.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      this.fieldsSet.add("functionId");
      return this;
    }

    /**
     * Metafields to associate to the fulfillment constraint rule.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
