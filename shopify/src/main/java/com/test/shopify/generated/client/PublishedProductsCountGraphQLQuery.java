package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a count of published products by publication ID.
 */
public class PublishedProductsCountGraphQLQuery extends GraphQLQuery {
  public PublishedProductsCountGraphQLQuery(String publicationId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (publicationId != null || fieldsSet.contains("publicationId")) {
        getInput().put("publicationId", publicationId);
    }
  }

  public PublishedProductsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "publishedProductsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String publicationId;

    private String queryName;

    public PublishedProductsCountGraphQLQuery build() {
      return new PublishedProductsCountGraphQLQuery(publicationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the publication that the products are published to.
     */
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      this.fieldsSet.add("publicationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
