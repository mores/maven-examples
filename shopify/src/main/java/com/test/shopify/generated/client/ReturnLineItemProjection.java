package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItem"));
  }

  public ReturnLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentLineItemProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public ReturnReasonProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> returnReason() {
     ReturnReasonProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonProjection<>(this, getRoot());
     getFields().put("returnReason", projection);
     return projection;
  }

  public WeightProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> totalWeight() {
     WeightProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("totalWeight", projection);
     return projection;
  }

  public MoneyBagProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> withCodeDiscountedTotalPriceSet(
      ) {
     MoneyBagProjection<ReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("withCodeDiscountedTotalPriceSet", projection);
     return projection;
  }

  public ReturnLineItemProjection<PARENT, ROOT> customerNote() {
    getFields().put("customerNote", null);
    return this;
  }

  public ReturnLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ReturnLineItemProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public ReturnLineItemProjection<PARENT, ROOT> refundedQuantity() {
    getFields().put("refundedQuantity", null);
    return this;
  }

  public ReturnLineItemProjection<PARENT, ROOT> returnReasonNote() {
    getFields().put("returnReasonNote", null);
    return this;
  }
}
