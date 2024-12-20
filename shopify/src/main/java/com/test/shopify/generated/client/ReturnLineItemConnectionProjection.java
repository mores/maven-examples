package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItemConnection"));
  }

  public ReturnLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnLineItemEdgeProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnLineItemEdgeProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnLineItemProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ReturnLineItemProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ReturnLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
