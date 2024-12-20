package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnStatus"));
  }

  public ReturnStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
