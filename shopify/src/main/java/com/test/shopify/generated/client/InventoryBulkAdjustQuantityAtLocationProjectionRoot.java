package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryBulkAdjustQuantityAtLocationProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryBulkAdjustQuantityAtLocationPayload"));
  }

  public InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelProjection<InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>, InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>> inventoryLevels(
      ) {
    InventoryLevelProjection<InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>, InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevels", projection);
    return projection;
  }

  public UserErrorProjection<InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>, InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>, InventoryBulkAdjustQuantityAtLocationProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
