package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.CreateMediaInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates media for a product.
 */
public class ProductCreateMediaGraphQLQuery extends GraphQLQuery {
  public ProductCreateMediaGraphQLQuery(String productId, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductCreateMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productCreateMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductCreateMediaGraphQLQuery build() {
      return new ProductCreateMediaGraphQLQuery(productId, media, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product associated with the media.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * List of new media to be added to a product.
     */
    public Builder media(List<CreateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
