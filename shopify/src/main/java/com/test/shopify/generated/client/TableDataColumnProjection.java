package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TableDataColumnProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TableDataColumnProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TableDataColumn"));
  }

  public TableDataColumnProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TableDataColumnProjection<PARENT, ROOT> comparedTo() {
    getFields().put("comparedTo", null);
    return this;
  }

  public TableDataColumnProjection<PARENT, ROOT> dataType() {
    getFields().put("dataType", null);
    return this;
  }

  public TableDataColumnProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public TableDataColumnProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
