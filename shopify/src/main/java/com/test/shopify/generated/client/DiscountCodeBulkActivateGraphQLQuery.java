package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously activate code discounts in bulk using a search query, a saved search ID, or a list of code discount IDs.
 */
public class DiscountCodeBulkActivateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBulkActivateGraphQLQuery(String search, String savedSearchId, List<String> ids,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public DiscountCodeBulkActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBulkActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private String savedSearchId;

    private List<String> ids;

    private String queryName;

    public DiscountCodeBulkActivateGraphQLQuery build() {
      return new DiscountCodeBulkActivateGraphQLQuery(search, savedSearchId, ids, queryName, fieldsSet);
               
    }

    /**
     * The search query for filtering code discounts.
     *     
     * For more information on the list of supported fields and search syntax,
     * refer to the [CodeDiscountNodes query section](https://shopify.dev/api/admin-graphql/latest/queries/codeDiscountNodes#argument-codediscountnodes-query).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the code discounts to activate.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
