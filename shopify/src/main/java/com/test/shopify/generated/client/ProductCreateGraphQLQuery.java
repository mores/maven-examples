package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.CreateMediaInput;
import com.test.shopify.generated.types.ProductInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a product.
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductCreateGraphQLQuery extends GraphQLQuery {
  public ProductCreateGraphQLQuery(ProductInput input, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductInput input;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductCreateGraphQLQuery build() {
      return new ProductCreateGraphQLQuery(input, media, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new product.
     */
    public Builder input(ProductInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * List of new media to be added to the product.
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
