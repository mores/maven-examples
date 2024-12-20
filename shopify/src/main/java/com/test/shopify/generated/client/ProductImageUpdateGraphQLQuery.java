package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.ImageInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates an image of a product.
 */
public class ProductImageUpdateGraphQLQuery extends GraphQLQuery {
  public ProductImageUpdateGraphQLQuery(String productId, ImageInput image, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (image != null || fieldsSet.contains("image")) {
        getInput().put("image", image);
    }
  }

  public ProductImageUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productImageUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private ImageInput image;

    private String queryName;

    public ProductImageUpdateGraphQLQuery build() {
      return new ProductImageUpdateGraphQLQuery(productId, image, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product on which to update the image.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Image to be updated.
     */
    public Builder image(ImageInput image) {
      this.image = image;
      this.fieldsSet.add("image");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
