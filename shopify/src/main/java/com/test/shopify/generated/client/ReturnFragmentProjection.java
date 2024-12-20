package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.test.shopify.generated.types.RefundDutyInput;
import com.test.shopify.generated.types.RefundShippingInput;
import com.test.shopify.generated.types.ReturnRefundLineItemInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ReturnFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReturnFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Return"));
  }

  public ReturnFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnDeclineProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> decline() {
     ReturnDeclineProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnDeclineProjection<>(this, getRoot());
     getFields().put("decline", projection);
     return projection;
  }

  public OrderProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public RefundConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> refunds() {
     RefundConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundConnectionProjection<>(this, getRoot());
     getFields().put("refunds", projection);
     return projection;
  }

  public RefundConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> refunds(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundConnectionProjection<>(this, getRoot());    
    getFields().put("refunds", projection);
    getInputArguments().computeIfAbsent("refunds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refunds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("refunds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("refunds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("refunds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("refunds").add(reverseArg);
    return projection;
  }

  public ReturnLineItemConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> returnLineItems(
      ) {
     ReturnLineItemConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemConnectionProjection<>(this, getRoot());
     getFields().put("returnLineItems", projection);
     return projection;
  }

  public ReturnLineItemConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> returnLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnLineItemConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("returnLineItems", projection);
    getInputArguments().computeIfAbsent("returnLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returnLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returnLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returnLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returnLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returnLineItems").add(reverseArg);
    return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrders(
      ) {
     ReverseFulfillmentOrderConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrders", projection);
     return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseFulfillmentOrderConnectionProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("reverseFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("reverseFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("reverseFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("reverseFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("reverseFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("reverseFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("reverseFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public ReturnStatusProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> status() {
     ReturnStatusProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SuggestedReturnRefundProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> suggestedRefund(
      ) {
     SuggestedReturnRefundProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnRefundProjection<>(this, getRoot());
     getFields().put("suggestedRefund", projection);
     return projection;
  }

  public SuggestedReturnRefundProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> suggestedRefund(
      List<ReturnRefundLineItemInput> returnRefundLineItems, RefundShippingInput refundShipping,
      List<RefundDutyInput> refundDuties) {
    SuggestedReturnRefundProjection<ReturnFragmentProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnRefundProjection<>(this, getRoot());    
    getFields().put("suggestedRefund", projection);
    getInputArguments().computeIfAbsent("suggestedRefund", k -> new ArrayList<>());                      
    InputArgument returnRefundLineItemsArg = new InputArgument("returnRefundLineItems", returnRefundLineItems);
    getInputArguments().get("suggestedRefund").add(returnRefundLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping);
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties);
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    return projection;
  }

  public ReturnFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Return {");
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
