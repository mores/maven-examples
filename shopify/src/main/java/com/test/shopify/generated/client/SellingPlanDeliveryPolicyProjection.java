package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanDeliveryPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanDeliveryPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanDeliveryPolicy"));
  }

  public SellingPlanDeliveryPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanFixedDeliveryPolicyFragmentProjection<SellingPlanDeliveryPolicyProjection<PARENT, ROOT>, ROOT> onSellingPlanFixedDeliveryPolicy(
      ) {
    SellingPlanFixedDeliveryPolicyFragmentProjection<SellingPlanDeliveryPolicyProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFixedDeliveryPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanRecurringDeliveryPolicyFragmentProjection<SellingPlanDeliveryPolicyProjection<PARENT, ROOT>, ROOT> onSellingPlanRecurringDeliveryPolicy(
      ) {
    SellingPlanRecurringDeliveryPolicyFragmentProjection<SellingPlanDeliveryPolicyProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanRecurringDeliveryPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
