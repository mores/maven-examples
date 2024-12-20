package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TableDataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TableDataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TableData"));
  }

  public TableDataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TableDataColumnProjection<TableDataProjection<PARENT, ROOT>, ROOT> columns() {
     TableDataColumnProjection<TableDataProjection<PARENT, ROOT>, ROOT> projection = new TableDataColumnProjection<>(this, getRoot());
     getFields().put("columns", projection);
     return projection;
  }

  public TableDataProjection<PARENT, ROOT> rowData() {
    getFields().put("rowData", null);
    return this;
  }

  public TableDataProjection<PARENT, ROOT> unformattedData() {
    getFields().put("unformattedData", null);
    return this;
  }
}
