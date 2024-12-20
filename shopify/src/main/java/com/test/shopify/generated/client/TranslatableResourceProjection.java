package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;

public class TranslatableResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslatableResource"));
  }

  public TranslatableResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translatableContent(
      ) {
     TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableContentProjection<>(this, getRoot());
     getFields().put("translatableContent", projection);
     return projection;
  }

  public TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translations(
      String locale, Boolean outdated, String marketId) {
    TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument outdatedArg = new InputArgument("outdated", outdated);
    getInputArguments().get("translations").add(outdatedArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslatableResourceProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
