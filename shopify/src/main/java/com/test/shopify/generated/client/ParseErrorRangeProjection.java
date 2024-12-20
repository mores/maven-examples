package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ParseErrorRangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ParseErrorRangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ParseErrorRange"));
  }

  public ParseErrorRangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorPositionProjection<ParseErrorRangeProjection<PARENT, ROOT>, ROOT> end() {
     ErrorPositionProjection<ParseErrorRangeProjection<PARENT, ROOT>, ROOT> projection = new ErrorPositionProjection<>(this, getRoot());
     getFields().put("end", projection);
     return projection;
  }

  public ErrorPositionProjection<ParseErrorRangeProjection<PARENT, ROOT>, ROOT> start() {
     ErrorPositionProjection<ParseErrorRangeProjection<PARENT, ROOT>, ROOT> projection = new ErrorPositionProjection<>(this, getRoot());
     getFields().put("start", projection);
     return projection;
  }
}
