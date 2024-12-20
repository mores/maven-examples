package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PolarisVizDataPointProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PolarisVizDataPointProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PolarisVizDataPoint"));
  }

  public PolarisVizDataPointProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PolarisVizDataPointProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public PolarisVizDataPointProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
