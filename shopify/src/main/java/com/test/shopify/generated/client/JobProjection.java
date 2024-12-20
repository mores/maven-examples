package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class JobProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public JobProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Job"));
  }

  public JobProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QueryRootProjection<JobProjection<PARENT, ROOT>, ROOT> query() {
     QueryRootProjection<JobProjection<PARENT, ROOT>, ROOT> projection = new QueryRootProjection<>(this, getRoot());
     getFields().put("query", projection);
     return projection;
  }

  public JobProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public JobProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
