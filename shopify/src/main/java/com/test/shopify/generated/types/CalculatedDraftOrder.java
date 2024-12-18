package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The calculated fields for a draft order.
 */
public class CalculatedDraftOrder {
  /**
   * The custom order-level discount applied.
   */
  private DraftOrderAppliedDiscount appliedDiscount;

  /**
   * The available shipping rates.
   * Requires a customer with a valid shipping address and at least one line item.
   */
  private List<ShippingRate> availableShippingRates;

  /**
   * Whether the billing address matches the shipping address.
   */
  private boolean billingAddressMatchesShippingAddress;

  /**
   * The shop currency used for calculation.
   */
  private CurrencyCode currencyCode;

  /**
   * The customer who will be sent an invoice.
   */
  private Customer customer;

  /**
   * The list of the line items in the calculated draft order.
   */
  private List<CalculatedDraftOrderLineItem> lineItems;

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  private MoneyBag lineItemsSubtotalPrice;

  /**
   * The name of the selected market.
   */
  private String marketName;

  /**
   * The selected country code that determines the pricing.
   */
  private CountryCode marketRegionCountryCode;

  /**
   * The assigned phone number.
   */
  private String phone;

  /**
   * The payment currency used for calculation.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The purchasing entity.
   */
  private PurchasingEntity purchasingEntity;

  /**
   * The line item containing the shipping information and costs.
   */
  private ShippingLine shippingLine;

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  private String subtotalPrice;

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  private List<TaxLine> taxLines;

  /**
   * Total discounts.
   */
  private MoneyBag totalDiscountsSet;

  /**
   * Total price of line items.
   */
  private MoneyBag totalLineItemsPriceSet;

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  private String totalPrice;

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  private MoneyBag totalPriceSet;

  /**
   * The total shipping price in shop currency.
   */
  private String totalShippingPrice;

  /**
   * The total shipping price.
   */
  private MoneyBag totalShippingPriceSet;

  /**
   * The total tax in shop currency.
   */
  private String totalTax;

  /**
   * The total tax.
   */
  private MoneyBag totalTaxSet;

  public CalculatedDraftOrder() {
  }

  /**
   * The custom order-level discount applied.
   */
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * The available shipping rates.
   * Requires a customer with a valid shipping address and at least one line item.
   */
  public List<ShippingRate> getAvailableShippingRates() {
    return availableShippingRates;
  }

  public void setAvailableShippingRates(List<ShippingRate> availableShippingRates) {
    this.availableShippingRates = availableShippingRates;
  }

  /**
   * Whether the billing address matches the shipping address.
   */
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  /**
   * The shop currency used for calculation.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The customer who will be sent an invoice.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The list of the line items in the calculated draft order.
   */
  public List<CalculatedDraftOrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CalculatedDraftOrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  public MoneyBag getLineItemsSubtotalPrice() {
    return lineItemsSubtotalPrice;
  }

  public void setLineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
    this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
  }

  /**
   * The name of the selected market.
   */
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  /**
   * The selected country code that determines the pricing.
   */
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
  }

  /**
   * The assigned phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The payment currency used for calculation.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The purchasing entity.
   */
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  /**
   * The line item containing the shipping information and costs.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Total discounts.
   */
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  /**
   * Total price of line items.
   */
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The total shipping price in shop currency.
   */
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total shipping price.
   */
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  /**
   * The total tax in shop currency.
   */
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total tax.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  @Override
  public String toString() {
    return "CalculatedDraftOrder{appliedDiscount='" + appliedDiscount + "', availableShippingRates='" + availableShippingRates + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', currencyCode='" + currencyCode + "', customer='" + customer + "', lineItems='" + lineItems + "', lineItemsSubtotalPrice='" + lineItemsSubtotalPrice + "', marketName='" + marketName + "', marketRegionCountryCode='" + marketRegionCountryCode + "', phone='" + phone + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', purchasingEntity='" + purchasingEntity + "', shippingLine='" + shippingLine + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', totalDiscountsSet='" + totalDiscountsSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDraftOrder that = (CalculatedDraftOrder) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(availableShippingRates, that.availableShippingRates) &&
        billingAddressMatchesShippingAddress == that.billingAddressMatchesShippingAddress &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(lineItemsSubtotalPrice, that.lineItemsSubtotalPrice) &&
        Objects.equals(marketName, that.marketName) &&
        Objects.equals(marketRegionCountryCode, that.marketRegionCountryCode) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(presentmentCurrencyCode, that.presentmentCurrencyCode) &&
        Objects.equals(purchasingEntity, that.purchasingEntity) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(subtotalPrice, that.subtotalPrice) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(totalDiscountsSet, that.totalDiscountsSet) &&
        Objects.equals(totalLineItemsPriceSet, that.totalLineItemsPriceSet) &&
        Objects.equals(totalPrice, that.totalPrice) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalShippingPriceSet, that.totalShippingPriceSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, availableShippingRates, billingAddressMatchesShippingAddress, currencyCode, customer, lineItems, lineItemsSubtotalPrice, marketName, marketRegionCountryCode, phone, presentmentCurrencyCode, purchasingEntity, shippingLine, subtotalPrice, subtotalPriceSet, taxLines, totalDiscountsSet, totalLineItemsPriceSet, totalPrice, totalPriceSet, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The custom order-level discount applied.
     */
    private DraftOrderAppliedDiscount appliedDiscount;

    /**
     * The available shipping rates.
     * Requires a customer with a valid shipping address and at least one line item.
     */
    private List<ShippingRate> availableShippingRates;

    /**
     * Whether the billing address matches the shipping address.
     */
    private boolean billingAddressMatchesShippingAddress;

    /**
     * The shop currency used for calculation.
     */
    private CurrencyCode currencyCode;

    /**
     * The customer who will be sent an invoice.
     */
    private Customer customer;

    /**
     * The list of the line items in the calculated draft order.
     */
    private List<CalculatedDraftOrderLineItem> lineItems;

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    private MoneyBag lineItemsSubtotalPrice;

    /**
     * The name of the selected market.
     */
    private String marketName;

    /**
     * The selected country code that determines the pricing.
     */
    private CountryCode marketRegionCountryCode;

    /**
     * The assigned phone number.
     */
    private String phone;

    /**
     * The payment currency used for calculation.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The purchasing entity.
     */
    private PurchasingEntity purchasingEntity;

    /**
     * The line item containing the shipping information and costs.
     */
    private ShippingLine shippingLine;

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    private String subtotalPrice;

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    private List<TaxLine> taxLines;

    /**
     * Total discounts.
     */
    private MoneyBag totalDiscountsSet;

    /**
     * Total price of line items.
     */
    private MoneyBag totalLineItemsPriceSet;

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    private String totalPrice;

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    private MoneyBag totalPriceSet;

    /**
     * The total shipping price in shop currency.
     */
    private String totalShippingPrice;

    /**
     * The total shipping price.
     */
    private MoneyBag totalShippingPriceSet;

    /**
     * The total tax in shop currency.
     */
    private String totalTax;

    /**
     * The total tax.
     */
    private MoneyBag totalTaxSet;

    public CalculatedDraftOrder build() {
      CalculatedDraftOrder result = new CalculatedDraftOrder();
      result.appliedDiscount = this.appliedDiscount;
      result.availableShippingRates = this.availableShippingRates;
      result.billingAddressMatchesShippingAddress = this.billingAddressMatchesShippingAddress;
      result.currencyCode = this.currencyCode;
      result.customer = this.customer;
      result.lineItems = this.lineItems;
      result.lineItemsSubtotalPrice = this.lineItemsSubtotalPrice;
      result.marketName = this.marketName;
      result.marketRegionCountryCode = this.marketRegionCountryCode;
      result.phone = this.phone;
      result.presentmentCurrencyCode = this.presentmentCurrencyCode;
      result.purchasingEntity = this.purchasingEntity;
      result.shippingLine = this.shippingLine;
      result.subtotalPrice = this.subtotalPrice;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.totalDiscountsSet = this.totalDiscountsSet;
      result.totalLineItemsPriceSet = this.totalLineItemsPriceSet;
      result.totalPrice = this.totalPrice;
      result.totalPriceSet = this.totalPriceSet;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalShippingPriceSet = this.totalShippingPriceSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    /**
     * The custom order-level discount applied.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * The available shipping rates.
     * Requires a customer with a valid shipping address and at least one line item.
     */
    public Builder availableShippingRates(List<ShippingRate> availableShippingRates) {
      this.availableShippingRates = availableShippingRates;
      return this;
    }

    /**
     * Whether the billing address matches the shipping address.
     */
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    /**
     * The shop currency used for calculation.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The customer who will be sent an invoice.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The list of the line items in the calculated draft order.
     */
    public Builder lineItems(List<CalculatedDraftOrderLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    public Builder lineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
      this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
      return this;
    }

    /**
     * The name of the selected market.
     */
    public Builder marketName(String marketName) {
      this.marketName = marketName;
      return this;
    }

    /**
     * The selected country code that determines the pricing.
     */
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
      return this;
    }

    /**
     * The assigned phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The payment currency used for calculation.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The purchasing entity.
     */
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    /**
     * The line item containing the shipping information and costs.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Total discounts.
     */
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    /**
     * Total price of line items.
     */
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The total shipping price in shop currency.
     */
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total shipping price.
     */
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    /**
     * The total tax in shop currency.
     */
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total tax.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }
  }
}
