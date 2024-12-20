package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PolarisVizDataSeriesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PolarisVizDataSeriesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PolarisVizDataSeries"));
  }

  public PolarisVizDataSeriesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PolarisVizDataPointProjection<PolarisVizDataSeriesProjection<PARENT, ROOT>, ROOT> data() {
     PolarisVizDataPointProjection<PolarisVizDataSeriesProjection<PARENT, ROOT>, ROOT> projection = new PolarisVizDataPointProjection<>(this, getRoot());
     getFields().put("data", projection);
     return projection;
  }

  public PolarisVizDataSeriesProjection<PARENT, ROOT> isComparison() {
    getFields().put("isComparison", null);
    return this;
  }

  public PolarisVizDataSeriesProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
