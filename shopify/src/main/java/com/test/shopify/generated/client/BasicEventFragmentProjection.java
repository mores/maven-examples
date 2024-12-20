package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class BasicEventFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BasicEventFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BasicEvent"));
  }

  public BasicEventFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> appTitle() {
    getFields().put("appTitle", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> attributeToApp() {
    getFields().put("attributeToApp", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> attributeToUser() {
    getFields().put("attributeToUser", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> criticalAlert() {
    getFields().put("criticalAlert", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BasicEventFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on BasicEvent {");
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
