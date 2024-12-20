package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlResponseProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlResponseProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlResponse"));
  }

  public ShopifyqlResponseProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ParseErrorProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> parseErrors() {
     ParseErrorProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> projection = new ParseErrorProjection<>(this, getRoot());
     getFields().put("parseErrors", projection);
     return projection;
  }

  public TableDataProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> tableData() {
     TableDataProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> projection = new TableDataProjection<>(this, getRoot());
     getFields().put("tableData", projection);
     return projection;
  }

  public PolarisVizResponseFragmentProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> onPolarisVizResponse(
      ) {
    PolarisVizResponseFragmentProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> fragment = new PolarisVizResponseFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TableResponseFragmentProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> onTableResponse(
      ) {
    TableResponseFragmentProjection<ShopifyqlResponseProjection<PARENT, ROOT>, ROOT> fragment = new TableResponseFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
