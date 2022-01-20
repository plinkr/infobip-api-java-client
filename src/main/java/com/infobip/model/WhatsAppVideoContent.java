/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** The content object to build a message that will be sent. */
public class WhatsAppVideoContent {
  public static final String SERIALIZED_NAME_MEDIA_URL = "mediaUrl";

  @SerializedName(SERIALIZED_NAME_MEDIA_URL)
  private String mediaUrl;

  public static final String SERIALIZED_NAME_CAPTION = "caption";

  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public WhatsAppVideoContent mediaUrl(String mediaUrl) {

    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * URL of a video sent in a WhatsApp message. Must be a valid URL starting with
   * &#x60;https://&#x60;, &#x60;http://&#x60; or &#x60;ftp://&#x60;. Supported video types are
   * &#x60;MP4&#x60;, &#x60;3GPP&#x60;. Maximum video size is 16MB.
   *
   * @return mediaUrl
   */
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public WhatsAppVideoContent caption(String caption) {

    this.caption = caption;
    return this;
  }

  /**
   * Caption of the video.
   *
   * @return caption
   */
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppVideoContent whatsAppVideoContent = (WhatsAppVideoContent) o;
    return Objects.equals(this.mediaUrl, whatsAppVideoContent.mediaUrl)
        && Objects.equals(this.caption, whatsAppVideoContent.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl, caption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppVideoContent {\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}