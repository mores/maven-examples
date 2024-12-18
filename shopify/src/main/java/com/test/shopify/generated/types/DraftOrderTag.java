package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a draft order tag.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrderTag implements com.test.shopify.generated.types.Node {
  /**
   * Handle of draft order tag.
   */
  private String handle;

  /**
   * ID of draft order tag.
   */
  private String id;

  /**
   * Title of draft order tag.
   */
  private String title;

  public DraftOrderTag() {
  }

  /**
   * Handle of draft order tag.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * ID of draft order tag.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Title of draft order tag.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "DraftOrderTag{handle='" + handle + "', id='" + id + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderTag that = (DraftOrderTag) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, id, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Handle of draft order tag.
     */
    private String handle;

    /**
     * ID of draft order tag.
     */
    private String id;

    /**
     * Title of draft order tag.
     */
    private String title;

    public DraftOrderTag build() {
      DraftOrderTag result = new DraftOrderTag();
      result.handle = this.handle;
      result.id = this.id;
      result.title = this.title;
      return result;
    }

    /**
     * Handle of draft order tag.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * ID of draft order tag.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Title of draft order tag.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
