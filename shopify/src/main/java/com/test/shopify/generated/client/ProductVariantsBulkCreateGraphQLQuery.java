package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.CreateMediaInput;
import com.test.shopify.generated.types.ProductVariantsBulkInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates multiple variants in a single product. This mutation can be called directly or via the bulkOperation.
 */
public class ProductVariantsBulkCreateGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkCreateGraphQLQuery(List<ProductVariantsBulkInput> variants,
      String productId, List<CreateMediaInput> media, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variants != null || fieldsSet.contains("variants")) {
        getInput().put("variants", variants);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductVariantsBulkCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantsBulkInput> variants;

    private String productId;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductVariantsBulkCreateGraphQLQuery build() {
      return new ProductVariantsBulkCreateGraphQLQuery(variants, productId, media, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants to be created.
     */
    public Builder variants(List<ProductVariantsBulkInput> variants) {
      this.variants = variants;
      this.fieldsSet.add("variants");
      return this;
    }

    /**
     * The ID of the product on which to create the variants.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
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
