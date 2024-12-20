package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LineItemMutableConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemMutableConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemMutableConnection"));
  }

  public LineItemMutableConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemMutableEdgeProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     LineItemMutableEdgeProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> projection = new LineItemMutableEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public LineItemMutableProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     LineItemMutableProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> projection = new LineItemMutableProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<LineItemMutableConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
