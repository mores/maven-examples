package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaHostProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaHostProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaHost"));
  }

  public MediaHostProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
