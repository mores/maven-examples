package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ErrorPositionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ErrorPositionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ErrorPosition"));
  }

  public ErrorPositionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorPositionProjection<PARENT, ROOT> character() {
    getFields().put("character", null);
    return this;
  }

  public ErrorPositionProjection<PARENT, ROOT> line() {
    getFields().put("line", null);
    return this;
  }
}
