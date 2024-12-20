package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ProductAppendImagesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Appends images to a product.
 */
public class ProductAppendImagesGraphQLQuery extends GraphQLQuery {
  public ProductAppendImagesGraphQLQuery(ProductAppendImagesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductAppendImagesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productAppendImages";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductAppendImagesInput input;

    private String queryName;

    public ProductAppendImagesGraphQLQuery build() {
      return new ProductAppendImagesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the new images and the product that they're being added to.
     */
    public Builder input(ProductAppendImagesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
