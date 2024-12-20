package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryAdjustQuantityProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryAdjustQuantityProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryAdjustQuantityPayload"));
  }

  public InventoryAdjustQuantityProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelProjection<InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>> inventoryLevel(
      ) {
    InventoryLevelProjection<InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    return projection;
  }

  public UserErrorProjection<InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantityProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
