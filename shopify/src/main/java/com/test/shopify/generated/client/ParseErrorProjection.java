package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ParseErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ParseErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ParseError"));
  }

  public ParseErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ParseErrorCodeProjection<ParseErrorProjection<PARENT, ROOT>, ROOT> code() {
     ParseErrorCodeProjection<ParseErrorProjection<PARENT, ROOT>, ROOT> projection = new ParseErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ParseErrorRangeProjection<ParseErrorProjection<PARENT, ROOT>, ROOT> range() {
     ParseErrorRangeProjection<ParseErrorProjection<PARENT, ROOT>, ROOT> projection = new ParseErrorRangeProjection<>(this, getRoot());
     getFields().put("range", projection);
     return projection;
  }

  public ParseErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
