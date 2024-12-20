package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Disable a gift card. A disabled gift card cannot be used by a customer. A disabled gift card cannot be re-enabled.
 */
public class GiftCardDisableGraphQLQuery extends GraphQLQuery {
  public GiftCardDisableGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public GiftCardDisableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardDisable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public GiftCardDisableGraphQLQuery build() {
      return new GiftCardDisableGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the gift card to disable.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
