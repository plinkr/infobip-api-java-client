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

/** ApiExceptionApiInfobipOrgInfobipapimanagementother */
public class ApiExceptionApiInfobipOrgInfobipapimanagementother {
  public static final String SERIALIZED_NAME_REQUEST_ERROR = "requestError";

  @SerializedName(SERIALIZED_NAME_REQUEST_ERROR)
  private ApiRequestErrorApiInfobipOrgInfobipapimanagementother requestError = null;

  public ApiExceptionApiInfobipOrgInfobipapimanagementother requestError(
      ApiRequestErrorApiInfobipOrgInfobipapimanagementother requestError) {

    this.requestError = requestError;
    return this;
  }

  /**
   * Get requestError
   *
   * @return requestError
   */
  public ApiRequestErrorApiInfobipOrgInfobipapimanagementother getRequestError() {
    return requestError;
  }

  public void setRequestError(ApiRequestErrorApiInfobipOrgInfobipapimanagementother requestError) {
    this.requestError = requestError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiExceptionApiInfobipOrgInfobipapimanagementother
        apiExceptionApiInfobipOrgInfobipapimanagementother =
            (ApiExceptionApiInfobipOrgInfobipapimanagementother) o;
    return Objects.equals(
        this.requestError, apiExceptionApiInfobipOrgInfobipapimanagementother.requestError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiExceptionApiInfobipOrgInfobipapimanagementother {\n");
    sb.append("    requestError: ").append(toIndentedString(requestError)).append("\n");
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