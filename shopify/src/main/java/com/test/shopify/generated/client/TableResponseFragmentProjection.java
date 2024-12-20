package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TableResponseFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TableResponseFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TableResponse"));
  }

  public TableResponseFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ParseErrorProjection<TableResponseFragmentProjection<PARENT, ROOT>, ROOT> parseErrors() {
     ParseErrorProjection<TableResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new ParseErrorProjection<>(this, getRoot());
     getFields().put("parseErrors", projection);
     return projection;
  }

  public TableDataProjection<TableResponseFragmentProjection<PARENT, ROOT>, ROOT> tableData() {
     TableDataProjection<TableResponseFragmentProjection<PARENT, ROOT>, ROOT> projection = new TableDataProjection<>(this, getRoot());
     getFields().put("tableData", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TableResponse {");
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
