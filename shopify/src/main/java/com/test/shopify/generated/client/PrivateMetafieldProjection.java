package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivateMetafield"));
  }

  public PrivateMetafieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldValueTypeProjection<PrivateMetafieldProjection<PARENT, ROOT>, ROOT> valueType(
      ) {
     PrivateMetafieldValueTypeProjection<PrivateMetafieldProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldValueTypeProjection<>(this, getRoot());
     getFields().put("valueType", projection);
     return projection;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public PrivateMetafieldProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
