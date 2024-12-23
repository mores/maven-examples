package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class GiftCardCreditTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardCreditTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardCreditTransaction"));
  }

  public GiftCardCreditTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public GiftCardProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> giftCard() {
     GiftCardProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCard", projection);
     return projection;
  }

  public MetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public PrivateMetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> privateMetafield(
      ) {
     PrivateMetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<GiftCardCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public GiftCardCreditTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardCreditTransactionProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public GiftCardCreditTransactionProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }
}
