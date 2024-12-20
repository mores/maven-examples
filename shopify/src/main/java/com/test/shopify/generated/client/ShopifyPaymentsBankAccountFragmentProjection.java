package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.test.shopify.generated.types.ShopifyPaymentsPayoutTransactionType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ShopifyPaymentsBankAccountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsBankAccountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBankAccount"));
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> country(
      ) {
     CountryCodeProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> currency(
      ) {
     CurrencyCodeProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> payouts(
      ) {
     ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());
     getFields().put("payouts", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> payouts(
      ShopifyPaymentsPayoutTransactionType transactionType, Integer first, String after,
      Integer last, String before, Boolean reverse) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());    
    getFields().put("payouts", projection);
    getInputArguments().computeIfAbsent("payouts", k -> new ArrayList<>());                      
    InputArgument transactionTypeArg = new InputArgument("transactionType", transactionType);
    getInputArguments().get("payouts").add(transactionTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("payouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("payouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("payouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("payouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("payouts").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountStatusProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsBankAccountStatusProjection<ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> accountNumber() {
    getFields().put("accountNumber", null);
    return this;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> accountNumberLastDigits() {
    getFields().put("accountNumberLastDigits", null);
    return this;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> bankName() {
    getFields().put("bankName", null);
    return this;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<PARENT, ROOT> routingNumber() {
    getFields().put("routingNumber", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsBankAccount {");
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
