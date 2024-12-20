package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AbandonedCheckoutFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AbandonedCheckoutFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckout"));
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AbandonedCheckoutLineItemConnectionProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> totalPriceSet(
      ) {
     MoneyBagProjection<AbandonedCheckoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> abandonedCheckoutUrl() {
    getFields().put("abandonedCheckoutUrl", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<PARENT, ROOT> lineItemsQuantity() {
    getFields().put("lineItemsQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AbandonedCheckout {");
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
