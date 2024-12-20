package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PolarisVizResponseFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PolarisVizResponseFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PolarisVizResponse"));
  }

  public PolarisVizResponseFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PolarisVizDataSeriesProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> data(
      ) {
     PolarisVizDataSeriesProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new PolarisVizDataSeriesProjection<>(this, getRoot());
     getFields().put("data", projection);
     return projection;
  }

  public ParseErrorProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> parseErrors(
      ) {
     ParseErrorProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new ParseErrorProjection<>(this, getRoot());
     getFields().put("parseErrors", projection);
     return projection;
  }

  public TableDataProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> tableData() {
     TableDataProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new TableDataProjection<>(this, getRoot());
     getFields().put("tableData", projection);
     return projection;
  }

  public VisualizationTypeProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> vizType(
      ) {
     VisualizationTypeProjection<PolarisVizResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new VisualizationTypeProjection<>(this, getRoot());
     getFields().put("vizType", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PolarisVizResponse {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
