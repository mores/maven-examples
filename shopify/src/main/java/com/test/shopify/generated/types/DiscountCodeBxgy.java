package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A code discount that offers customers a Buy X, Get Y (BXGY) discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeBxgy implements Discount, DiscountCode {
  /**
   * Whether the discount can be applied only once per customer.
   */
  private boolean appliesOncePerCustomer;

  /**
   * The number of times that the discount has been used.
   */
  private int asyncUsageCount;

  /**
   * The number of redeem codes for the discount.
   */
  private int codeCount;

  /**
   * A list of redeem codes for the discount.
   */
  private DiscountRedeemCodeConnection codes;

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWith combinesWith;

  /**
   * The date and time when the discount was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  private DiscountCustomerBuys customerBuys;

  /**
   * The qualifying items in an order, the quantity of each one, and the total value of the discount.
   */
  private DiscountCustomerGets customerGets;

  /**
   * The customers that can use the discount.
   */
  private DiscountCustomerSelection customerSelection;

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private MerchandiseDiscountClass discountClass;

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * Indicates whether there are any timeline comments on the discount.
   */
  private boolean hasTimelineComment;

  /**
   * URLs that can be used to share the discount.
   */
  private List<DiscountShareableUrl> shareableUrls;

  /**
   * The date and time when the discount starts.
   */
  private OffsetDateTime startsAt;

  /**
   * The status of the discount.
   */
  private DiscountStatus status;

  /**
   * A detailed summary of the discount.
   */
  private String summary;

  /**
   * The title of the discount.
   */
  private String title;

  /**
   * The total sales from orders where the discount was used.
   */
  private MoneyV2 totalSales;

  /**
   * The date and time when the discount was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The maximum number of times that the discount can be used.
   */
  private Integer usageLimit;

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  private Integer usesPerOrderLimit;

  public DiscountCodeBxgy() {
  }

  /**
   * Whether the discount can be applied only once per customer.
   */
  public boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  /**
   * The number of times that the discount has been used.
   */
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  /**
   * The number of redeem codes for the discount.
   */
  public int getCodeCount() {
    return codeCount;
  }

  public void setCodeCount(int codeCount) {
    this.codeCount = codeCount;
  }

  /**
   * A list of redeem codes for the discount.
   */
  public DiscountRedeemCodeConnection getCodes() {
    return codes;
  }

  public void setCodes(DiscountRedeemCodeConnection codes) {
    this.codes = codes;
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The date and time when the discount was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
   */
  public DiscountCustomerBuys getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuys customerBuys) {
    this.customerBuys = customerBuys;
  }

  /**
   * The qualifying items in an order, the quantity of each one, and the total value of the discount.
   */
  public DiscountCustomerGets getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGets customerGets) {
    this.customerGets = customerGets;
  }

  /**
   * The customers that can use the discount.
   */
  public DiscountCustomerSelection getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelection customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public MerchandiseDiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(MerchandiseDiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * Indicates whether there are any timeline comments on the discount.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  /**
   * URLs that can be used to share the discount.
   */
  public List<DiscountShareableUrl> getShareableUrls() {
    return shareableUrls;
  }

  public void setShareableUrls(List<DiscountShareableUrl> shareableUrls) {
    this.shareableUrls = shareableUrls;
  }

  /**
   * The date and time when the discount starts.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The status of the discount.
   */
  public DiscountStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountStatus status) {
    this.status = status;
  }

  /**
   * A detailed summary of the discount.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * The title of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total sales from orders where the discount was used.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  /**
   * The date and time when the discount was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The maximum number of times that the discount can be used.
   */
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  public Integer getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(Integer usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
  }

  @Override
  public String toString() {
    return "DiscountCodeBxgy{appliesOncePerCustomer='" + appliesOncePerCustomer + "', asyncUsageCount='" + asyncUsageCount + "', codeCount='" + codeCount + "', codes='" + codes + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "', customerSelection='" + customerSelection + "', discountClass='" + discountClass + "', endsAt='" + endsAt + "', hasTimelineComment='" + hasTimelineComment + "', shareableUrls='" + shareableUrls + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', totalSales='" + totalSales + "', updatedAt='" + updatedAt + "', usageLimit='" + usageLimit + "', usesPerOrderLimit='" + usesPerOrderLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBxgy that = (DiscountCodeBxgy) o;
    return appliesOncePerCustomer == that.appliesOncePerCustomer &&
        asyncUsageCount == that.asyncUsageCount &&
        codeCount == that.codeCount &&
        Objects.equals(codes, that.codes) &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(endsAt, that.endsAt) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(shareableUrls, that.shareableUrls) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOncePerCustomer, asyncUsageCount, codeCount, codes, combinesWith, createdAt, customerBuys, customerGets, customerSelection, discountClass, endsAt, hasTimelineComment, shareableUrls, startsAt, status, summary, title, totalSales, updatedAt, usageLimit, usesPerOrderLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount can be applied only once per customer.
     */
    private boolean appliesOncePerCustomer;

    /**
     * The number of times that the discount has been used.
     */
    private int asyncUsageCount;

    /**
     * The number of redeem codes for the discount.
     */
    private int codeCount;

    /**
     * A list of redeem codes for the discount.
     */
    private DiscountRedeemCodeConnection codes;

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWith combinesWith;

    /**
     * The date and time when the discount was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    private DiscountCustomerBuys customerBuys;

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    private DiscountCustomerGets customerGets;

    /**
     * The customers that can use the discount.
     */
    private DiscountCustomerSelection customerSelection;

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private MerchandiseDiscountClass discountClass;

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * Indicates whether there are any timeline comments on the discount.
     */
    private boolean hasTimelineComment;

    /**
     * URLs that can be used to share the discount.
     */
    private List<DiscountShareableUrl> shareableUrls;

    /**
     * The date and time when the discount starts.
     */
    private OffsetDateTime startsAt;

    /**
     * The status of the discount.
     */
    private DiscountStatus status;

    /**
     * A detailed summary of the discount.
     */
    private String summary;

    /**
     * The title of the discount.
     */
    private String title;

    /**
     * The total sales from orders where the discount was used.
     */
    private MoneyV2 totalSales;

    /**
     * The date and time when the discount was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The maximum number of times that the discount can be used.
     */
    private Integer usageLimit;

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    private Integer usesPerOrderLimit;

    public DiscountCodeBxgy build() {
      DiscountCodeBxgy result = new DiscountCodeBxgy();
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.asyncUsageCount = this.asyncUsageCount;
      result.codeCount = this.codeCount;
      result.codes = this.codes;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      result.customerSelection = this.customerSelection;
      result.discountClass = this.discountClass;
      result.endsAt = this.endsAt;
      result.hasTimelineComment = this.hasTimelineComment;
      result.shareableUrls = this.shareableUrls;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.updatedAt = this.updatedAt;
      result.usageLimit = this.usageLimit;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      return result;
    }

    /**
     * Whether the discount can be applied only once per customer.
     */
    public Builder appliesOncePerCustomer(boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    /**
     * The number of times that the discount has been used.
     */
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    /**
     * The number of redeem codes for the discount.
     */
    public Builder codeCount(int codeCount) {
      this.codeCount = codeCount;
      return this;
    }

    /**
     * A list of redeem codes for the discount.
     */
    public Builder codes(DiscountRedeemCodeConnection codes) {
      this.codes = codes;
      return this;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The date and time when the discount was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The qualifying items and the quantity of each one that the customer has to buy to be eligible for the discount.
     */
    public Builder customerBuys(DiscountCustomerBuys customerBuys) {
      this.customerBuys = customerBuys;
      return this;
    }

    /**
     * The qualifying items in an order, the quantity of each one, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGets customerGets) {
      this.customerGets = customerGets;
      return this;
    }

    /**
     * The customers that can use the discount.
     */
    public Builder customerSelection(DiscountCustomerSelection customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(MerchandiseDiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Indicates whether there are any timeline comments on the discount.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    /**
     * URLs that can be used to share the discount.
     */
    public Builder shareableUrls(List<DiscountShareableUrl> shareableUrls) {
      this.shareableUrls = shareableUrls;
      return this;
    }

    /**
     * The date and time when the discount starts.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The status of the discount.
     */
    public Builder status(DiscountStatus status) {
      this.status = status;
      return this;
    }

    /**
     * A detailed summary of the discount.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The title of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total sales from orders where the discount was used.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    /**
     * The date and time when the discount was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The maximum number of times that the discount can be used.
     */
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    public Builder usesPerOrderLimit(Integer usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }
  }
}
