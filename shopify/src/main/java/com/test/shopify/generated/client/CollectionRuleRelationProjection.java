package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleRelation"));
  }

  public CollectionRuleRelationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
