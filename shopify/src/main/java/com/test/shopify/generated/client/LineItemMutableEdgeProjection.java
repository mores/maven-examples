package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LineItemMutableEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemMutableEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemMutableEdge"));
  }

  public LineItemMutableEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemMutableProjection<LineItemMutableEdgeProjection<PARENT, ROOT>, ROOT> node() {
     LineItemMutableProjection<LineItemMutableEdgeProjection<PARENT, ROOT>, ROOT> projection = new LineItemMutableProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public LineItemMutableEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
