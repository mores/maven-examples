package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SellingPlanFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlan"));
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanBillingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SellingPlanBillingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SellingPlanCategoryProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> category(
      ) {
     SellingPlanCategoryProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public SellingPlanDeliveryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SellingPlanDeliveryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public SellingPlanInventoryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> inventoryPolicy(
      ) {
     SellingPlanInventoryPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanInventoryPolicyProjection<>(this, getRoot());
     getFields().put("inventoryPolicy", projection);
     return projection;
  }

  public SellingPlanPricingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> pricingPolicies(
      ) {
     SellingPlanPricingPolicyProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyProjection<>(this, getRoot());
     getFields().put("pricingPolicies", projection);
     return projection;
  }

  public TranslationProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<SellingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> options() {
    getFields().put("options", null);
    return this;
  }

  public SellingPlanFragmentProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlan {");
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
