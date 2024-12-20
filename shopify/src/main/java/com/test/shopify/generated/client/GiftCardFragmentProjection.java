package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class GiftCardFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public GiftCardFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCard"));
  }

  public GiftCardFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public CustomerProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> initialValue() {
     MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("initialValue", projection);
     return projection;
  }

  public OrderProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> disabledAt() {
    getFields().put("disabledAt", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> expiresOn() {
    getFields().put("expiresOn", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> maskedCode() {
    getFields().put("maskedCode", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on GiftCard {");
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
