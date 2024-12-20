package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCard"));
  }

  public GiftCardProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public CustomerProjection<GiftCardProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> initialValue() {
     MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("initialValue", projection);
     return projection;
  }

  public OrderProjection<GiftCardProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public GiftCardProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> disabledAt() {
    getFields().put("disabledAt", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> expiresOn() {
    getFields().put("expiresOn", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> maskedCode() {
    getFields().put("maskedCode", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
