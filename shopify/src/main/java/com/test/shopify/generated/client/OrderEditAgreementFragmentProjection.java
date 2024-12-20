package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class OrderEditAgreementFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderEditAgreementFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditAgreement"));
  }

  public OrderEditAgreementFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public OrderActionTypeProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> reason(
      ) {
     OrderActionTypeProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderActionTypeProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public SaleConnectionProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> sales(
      ) {
     SaleConnectionProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());
     getFields().put("sales", projection);
     return projection;
  }

  public SaleConnectionProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> sales(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SaleConnectionProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());    
    getFields().put("sales", projection);
    getInputArguments().computeIfAbsent("sales", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sales").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sales").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sales").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sales").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sales").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<OrderEditAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public OrderEditAgreementFragmentProjection<PARENT, ROOT> happenedAt() {
    getFields().put("happenedAt", null);
    return this;
  }

  public OrderEditAgreementFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderEditAgreement {");
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