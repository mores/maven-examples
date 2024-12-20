package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes product images from the product.
 */
public class ProductDeleteImagesGraphQLQuery extends GraphQLQuery {
  public ProductDeleteImagesGraphQLQuery(String id, List<String> imageIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (imageIds != null || fieldsSet.contains("imageIds")) {
        getInput().put("imageIds", imageIds);
    }
  }

  public ProductDeleteImagesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDeleteImages";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> imageIds;

    private String queryName;

    public ProductDeleteImagesGraphQLQuery build() {
      return new ProductDeleteImagesGraphQLQuery(id, imageIds, queryName, fieldsSet);
               
    }

    /**
     * This is the ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * This is the array of image IDs to delete from the product.
     */
    public Builder imageIds(List<String> imageIds) {
      this.imageIds = imageIds;
      this.fieldsSet.add("imageIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
