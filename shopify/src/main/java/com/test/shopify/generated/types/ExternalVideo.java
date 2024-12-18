package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a video hosted outside of Shopify.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExternalVideo implements com.test.shopify.generated.types.Media, com.test.shopify.generated.types.Node {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  private String alt;

  /**
   * The embed URL of the video for the respective host.
   */
  private String embedUrl;

  /**
   * The URL.
   */
  private String embeddedUrl;

  /**
   * The host of the external video.
   */
  private MediaHost host;

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
   * The origin URL of the video on the respective host.
   */
  private String originUrl;

  /**
   * The preview image for the media.
   */
  private MediaPreviewImage preview;

  /**
   * Current status of the media.
   */
  private MediaStatus status;

  public ExternalVideo() {
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
   * The embed URL of the video for the respective host.
   */
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  /**
   * The URL.
   */
  public String getEmbeddedUrl() {
    return embeddedUrl;
  }

  public void setEmbeddedUrl(String embeddedUrl) {
    this.embeddedUrl = embeddedUrl;
  }

  /**
   * The host of the external video.
   */
  public MediaHost getHost() {
    return host;
  }

  public void setHost(MediaHost host) {
    this.host = host;
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
   * The origin URL of the video on the respective host.
   */
  public String getOriginUrl() {
    return originUrl;
  }

  public void setOriginUrl(String originUrl) {
    this.originUrl = originUrl;
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
    return "ExternalVideo{alt='" + alt + "', embedUrl='" + embedUrl + "', embeddedUrl='" + embeddedUrl + "', host='" + host + "', id='" + id + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', originUrl='" + originUrl + "', preview='" + preview + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalVideo that = (ExternalVideo) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(embedUrl, that.embedUrl) &&
        Objects.equals(embeddedUrl, that.embeddedUrl) &&
        Objects.equals(host, that.host) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(mediaErrors, that.mediaErrors) &&
        Objects.equals(mediaWarnings, that.mediaWarnings) &&
        Objects.equals(originUrl, that.originUrl) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, embedUrl, embeddedUrl, host, id, mediaContentType, mediaErrors, mediaWarnings, originUrl, preview, status);
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
     * The embed URL of the video for the respective host.
     */
    private String embedUrl;

    /**
     * The URL.
     */
    private String embeddedUrl;

    /**
     * The host of the external video.
     */
    private MediaHost host;

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
     * The origin URL of the video on the respective host.
     */
    private String originUrl;

    /**
     * The preview image for the media.
     */
    private MediaPreviewImage preview;

    /**
     * Current status of the media.
     */
    private MediaStatus status;

    public ExternalVideo build() {
      ExternalVideo result = new ExternalVideo();
      result.alt = this.alt;
      result.embedUrl = this.embedUrl;
      result.embeddedUrl = this.embeddedUrl;
      result.host = this.host;
      result.id = this.id;
      result.mediaContentType = this.mediaContentType;
      result.mediaErrors = this.mediaErrors;
      result.mediaWarnings = this.mediaWarnings;
      result.originUrl = this.originUrl;
      result.preview = this.preview;
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
     * The embed URL of the video for the respective host.
     */
    public Builder embedUrl(String embedUrl) {
      this.embedUrl = embedUrl;
      return this;
    }

    /**
     * The URL.
     */
    public Builder embeddedUrl(String embeddedUrl) {
      this.embeddedUrl = embeddedUrl;
      return this;
    }

    /**
     * The host of the external video.
     */
    public Builder host(MediaHost host) {
      this.host = host;
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
     * The origin URL of the video on the respective host.
     */
    public Builder originUrl(String originUrl) {
      this.originUrl = originUrl;
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
     * Current status of the media.
     */
    public Builder status(MediaStatus status) {
      this.status = status;
      return this;
    }
  }
}
