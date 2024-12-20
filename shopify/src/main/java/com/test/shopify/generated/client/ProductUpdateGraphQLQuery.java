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
 * Updates a product.
 *   
 * For versions `2024-01` and older:
 * If you update a product and only include some variants in the update,
 * then any variants not included will be deleted.
 *   
 * To safely manage variants without the risk of
 * deleting excluded variants, use
 * [productVariantsBulkUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/productvariantsbulkupdate).
 *   
 * If you want to update a single variant, then use
 * [productVariantUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/productvariantupdate).
 */
public class ProductUpdateGraphQLQuery extends GraphQLQuery {
  public ProductUpdateGraphQLQuery(ProductInput input, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductInput input;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductUpdateGraphQLQuery build() {
      return new ProductUpdateGraphQLQuery(input, media, queryName, fieldsSet);
               
    }

    /**
     * The updated properties for a product.
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
