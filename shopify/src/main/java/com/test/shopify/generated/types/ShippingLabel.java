package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The optional shipping label for this fulfillment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLabel implements com.test.shopify.generated.types.Node {
  /**
   * Indicates whether the label is cancellable or not.
   */
  private boolean cancellable;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location of the shipping origin. This will be null when the shipping origin is unknown.
   */
  private Location location;

  /**
   * Indicates whether the label was printed or not.
   */
  private boolean printed;

  public ShippingLabel() {
  }

  /**
   * Indicates whether the label is cancellable or not.
   */
  public boolean getCancellable() {
    return cancellable;
  }

  public void setCancellable(boolean cancellable) {
    this.cancellable = cancellable;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The location of the shipping origin. This will be null when the shipping origin is unknown.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Indicates whether the label was printed or not.
   */
  public boolean getPrinted() {
    return printed;
  }

  public void setPrinted(boolean printed) {
    this.printed = printed;
  }

  @Override
  public String toString() {
    return "ShippingLabel{cancellable='" + cancellable + "', id='" + id + "', location='" + location + "', printed='" + printed + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabel that = (ShippingLabel) o;
    return cancellable == that.cancellable &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        printed == that.printed;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellable, id, location, printed);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the label is cancellable or not.
     */
    private boolean cancellable;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location of the shipping origin. This will be null when the shipping origin is unknown.
     */
    private Location location;

    /**
     * Indicates whether the label was printed or not.
     */
    private boolean printed;

    public ShippingLabel build() {
      ShippingLabel result = new ShippingLabel();
      result.cancellable = this.cancellable;
      result.id = this.id;
      result.location = this.location;
      result.printed = this.printed;
      return result;
    }

    /**
     * Indicates whether the label is cancellable or not.
     */
    public Builder cancellable(boolean cancellable) {
      this.cancellable = cancellable;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The location of the shipping origin. This will be null when the shipping origin is unknown.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Indicates whether the label was printed or not.
     */
    public Builder printed(boolean printed) {
      this.printed = printed;
      return this;
    }
  }
}
