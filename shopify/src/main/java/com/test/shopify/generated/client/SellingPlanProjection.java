package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class SellingPlanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlan"));
  }

  public SellingPlanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanBillingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SellingPlanBillingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SellingPlanCategoryProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> category() {
     SellingPlanCategoryProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public SellingPlanDeliveryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SellingPlanDeliveryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public SellingPlanInventoryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> inventoryPolicy(
      ) {
     SellingPlanInventoryPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanInventoryPolicyProjection<>(this, getRoot());
     getFields().put("inventoryPolicy", projection);
     return projection;
  }

  public SellingPlanPricingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> pricingPolicies(
      ) {
     SellingPlanPricingPolicyProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyProjection<>(this, getRoot());
     getFields().put("pricingPolicies", projection);
     return projection;
  }

  public TranslationProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<SellingPlanProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public SellingPlanProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> options() {
    getFields().put("options", null);
    return this;
  }

  public SellingPlanProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }
}
