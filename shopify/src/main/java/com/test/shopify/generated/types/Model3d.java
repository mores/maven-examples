package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Shopify hosted 3D model.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Model3d implements MetafieldReference, com.test.shopify.generated.types.Media, com.test.shopify.generated.types.Node {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  private String alt;

  /**
   * The 3d model's bounding box information.
   */
  private Model3dBoundingBox boundingBox;

  /**
   * The 3d model's filename.
   */
  private String filename;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The media content type.
   */
  private MediaContentType mediaContentType;

  /**
   * Any errors which have occurred on the media.
   */
  private List<MediaError> mediaErrors;

  /**
   * The warnings attached to the media.
   */
  private List<MediaWarning> mediaWarnings;

  /**
   * The 3d model's original source.
   */
  private Model3dSource originalSource;

  /**
   * The preview image for the media.
   */
  private MediaPreviewImage preview;

  /**
   * The 3d model's sources.
   */
  private List<Model3dSource> sources;

  /**
   * Current status of the media.
   */
  private MediaStatus status;

  public Model3d() {
  }

  /**
   * A word or phrase to share the nature or contents of a media.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * The 3d model's bounding box information.
   */
  public Model3dBoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(Model3dBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }

  /**
   * The 3d model's filename.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
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
   * The media content type.
   */
  public MediaContentType getMediaContentType() {
    return mediaContentType;
  }

  public void setMediaContentType(MediaContentType mediaContentType) {
    this.mediaContentType = mediaContentType;
  }

  /**
   * Any errors which have occurred on the media.
   */
  public List<MediaError> getMediaErrors() {
    return mediaErrors;
  }

  public void setMediaErrors(List<MediaError> mediaErrors) {
    this.mediaErrors = mediaErrors;
  }

  /**
   * The warnings attached to the media.
   */
  public List<MediaWarning> getMediaWarnings() {
    return mediaWarnings;
  }

  public void setMediaWarnings(List<MediaWarning> mediaWarnings) {
    this.mediaWarnings = mediaWarnings;
  }

  /**
   * The 3d model's original source.
   */
  public Model3dSource getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(Model3dSource originalSource) {
    this.originalSource = originalSource;
  }

  /**
   * The preview image for the media.
   */
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  /**
   * The 3d model's sources.
   */
  public List<Model3dSource> getSources() {
    return sources;
  }

  public void setSources(List<Model3dSource> sources) {
    this.sources = sources;
  }

  /**
   * Current status of the media.
   */
  public MediaStatus getStatus() {
    return status;
  }

  public void setStatus(MediaStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Model3d{alt='" + alt + "', boundingBox='" + boundingBox + "', filename='" + filename + "', id='" + id + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', originalSource='" + originalSource + "', preview='" + preview + "', sources='" + sources + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Model3d that = (Model3d) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(boundingBox, that.boundingBox) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(mediaErrors, that.mediaErrors) &&
        Objects.equals(mediaWarnings, that.mediaWarnings) &&
        Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(sources, that.sources) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, boundingBox, filename, id, mediaContentType, mediaErrors, mediaWarnings, originalSource, preview, sources, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A word or phrase to share the nature or contents of a media.
     */
    private String alt;

    /**
     * The 3d model's bounding box information.
     */
    private Model3dBoundingBox boundingBox;

    /**
     * The 3d model's filename.
     */
    private String filename;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The media content type.
     */
    private MediaContentType mediaContentType;

    /**
     * Any errors which have occurred on the media.
     */
    private List<MediaError> mediaErrors;

    /**
     * The warnings attached to the media.
     */
    private List<MediaWarning> mediaWarnings;

    /**
     * The 3d model's original source.
     */
    private Model3dSource originalSource;

    /**
     * The preview image for the media.
     */
    private MediaPreviewImage preview;

    /**
     * The 3d model's sources.
     */
    private List<Model3dSource> sources;

    /**
     * Current status of the media.
     */
    private MediaStatus status;

    public Model3d build() {
      Model3d result = new Model3d();
      result.alt = this.alt;
      result.boundingBox = this.boundingBox;
      result.filename = this.filename;
      result.id = this.id;
      result.mediaContentType = this.mediaContentType;
      result.mediaErrors = this.mediaErrors;
      result.mediaWarnings = this.mediaWarnings;
      result.originalSource = this.originalSource;
      result.preview = this.preview;
      result.sources = this.sources;
      result.status = this.status;
      return result;
    }

    /**
     * A word or phrase to share the nature or contents of a media.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * The 3d model's bounding box information.
     */
    public Builder boundingBox(Model3dBoundingBox boundingBox) {
      this.boundingBox = boundingBox;
      return this;
    }

    /**
     * The 3d model's filename.
     */
    public Builder filename(String filename) {
      this.filename = filename;
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
     * The media content type.
     */
    public Builder mediaContentType(MediaContentType mediaContentType) {
      this.mediaContentType = mediaContentType;
      return this;
    }

    /**
     * Any errors which have occurred on the media.
     */
    public Builder mediaErrors(List<MediaError> mediaErrors) {
      this.mediaErrors = mediaErrors;
      return this;
    }

    /**
     * The warnings attached to the media.
     */
    public Builder mediaWarnings(List<MediaWarning> mediaWarnings) {
      this.mediaWarnings = mediaWarnings;
      return this;
    }

    /**
     * The 3d model's original source.
     */
    public Builder originalSource(Model3dSource originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    /**
     * The preview image for the media.
     */
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    /**
     * The 3d model's sources.
     */
    public Builder sources(List<Model3dSource> sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Current status of the media.
     */
    public Builder status(MediaStatus status) {
      this.status = status;
      return this;
    }
  }
}
