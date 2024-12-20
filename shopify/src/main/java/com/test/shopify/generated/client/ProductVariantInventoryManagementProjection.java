package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantInventoryManagementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantInventoryManagementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantInventoryManagement"));
  }

  public ProductVariantInventoryManagementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
