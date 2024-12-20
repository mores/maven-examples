package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItemEdge"));
  }

  public ReturnLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnLineItemProjection<ReturnLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ReturnLineItemProjection<ReturnLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
