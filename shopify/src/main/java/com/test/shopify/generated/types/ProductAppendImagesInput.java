package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying product images to append.
 */
public class ProductAppendImagesInput {
  /**
   * The ID of the product.
   */
  private String id;

  /**
   * A list of images to be appended to the product.
   */
  private List<ImageInput> images;

  public ProductAppendImagesInput() {
  }

  /**
   * The ID of the product.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of images to be appended to the product.
   */
  public List<ImageInput> getImages() {
    return images;
  }

  public void setImages(List<ImageInput> images) {
    this.images = images;
  }

  @Override
  public String toString() {
    return "ProductAppendImagesInput{id='" + id + "', images='" + images + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductAppendImagesInput that = (ProductAppendImagesInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(images, that.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, images);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product.
     */
    private String id;

    /**
     * A list of images to be appended to the product.
     */
    private List<ImageInput> images;

    public ProductAppendImagesInput build() {
      ProductAppendImagesInput result = new ProductAppendImagesInput();
      result.id = this.id;
      result.images = this.images;
      return result;
    }

    /**
     * The ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of images to be appended to the product.
     */
    public Builder images(List<ImageInput> images) {
      this.images = images;
      return this;
    }
  }
}
