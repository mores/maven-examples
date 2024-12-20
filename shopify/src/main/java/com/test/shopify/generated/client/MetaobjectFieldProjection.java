package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectFieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectFieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectField"));
  }

  public MetaobjectFieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldDefinitionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> definition(
      ) {
     MetaobjectFieldDefinitionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldDefinitionProjection<>(this, getRoot());
     getFields().put("definition", projection);
     return projection;
  }

  public MetafieldReferenceProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> reference() {
     MetafieldReferenceProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceProjection<>(this, getRoot());
     getFields().put("reference", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> references(
      ) {
     MetafieldReferenceConnectionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());
     getFields().put("references", projection);
     return projection;
  }

  public MetafieldReferenceConnectionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> references(
      Integer first, String after, Integer last, String before) {
    MetafieldReferenceConnectionProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceConnectionProjection<>(this, getRoot());    
    getFields().put("references", projection);
    getInputArguments().computeIfAbsent("references", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("references").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("references").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("references").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("references").add(beforeArg);
    return projection;
  }

  public MetaobjectThumbnailProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> thumbnail() {
     MetaobjectThumbnailProjection<MetaobjectFieldProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectThumbnailProjection<>(this, getRoot());
     getFields().put("thumbnail", projection);
     return projection;
  }

  public MetaobjectFieldProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetaobjectFieldProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectFieldProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
