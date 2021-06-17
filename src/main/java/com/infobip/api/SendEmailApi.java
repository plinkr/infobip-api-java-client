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

package com.infobip.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.ApiResponse;
import com.infobip.Configuration;
import com.infobip.Pair;
import com.infobip.model.EmailLogsResult;
import com.infobip.model.EmailReportsResult;
import com.infobip.model.EmailSendResponse;
import java.io.File;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendEmailApi {
  private ApiClient localVarApiClient;

  public SendEmailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SendEmailApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for getEmailDeliveryReports.
   *
   * @param bulkId Bulk ID for which report is requested. (optional)
   * @param messageId Message ID for which report is requested. (optional)
   * @param limit Maximum number of reports. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases.</a>
   */
  public okhttp3.Call getEmailDeliveryReportsCall(
      String bulkId, String messageId, Integer limit, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/email/1/reports";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
    }

    if (messageId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageId", messageId));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getEmailDeliveryReportsValidateBeforeCall(
      String bulkId, String messageId, Integer limit, final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getEmailDeliveryReportsCall(bulkId, messageId, limit, _callback);
    return localVarCall;
  }

  /**
   * Email delivery reports. Get one-time delivery reports for all sent emails.
   *
   * @param bulkId Bulk ID for which report is requested. (optional)
   * @param messageId Message ID for which report is requested. (optional)
   * @param limit Maximum number of reports. (optional)
   * @return EmailReportsResult
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases.</a>
   */
  public EmailReportsResult getEmailDeliveryReports(String bulkId, String messageId, Integer limit)
      throws ApiException {
    ApiResponse<EmailReportsResult> localVarResp =
        getEmailDeliveryReportsWithHttpInfo(bulkId, messageId, limit);
    return localVarResp.getData();
  }

  /**
   * Email delivery reports. Get one-time delivery reports for all sent emails.
   *
   * @param bulkId Bulk ID for which report is requested. (optional)
   * @param messageId Message ID for which report is requested. (optional)
   * @param limit Maximum number of reports. (optional)
   * @return ApiResponse&lt;EmailReportsResult&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases.</a>
   */
  public ApiResponse<EmailReportsResult> getEmailDeliveryReportsWithHttpInfo(
      String bulkId, String messageId, Integer limit) throws ApiException {
    okhttp3.Call localVarCall =
        getEmailDeliveryReportsValidateBeforeCall(bulkId, messageId, limit, null);
    Type localVarReturnType = new TypeToken<EmailReportsResult>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Email delivery reports (asynchronously). Get one-time delivery reports for all sent emails.
   *
   * @param bulkId Bulk ID for which report is requested. (optional)
   * @param messageId Message ID for which report is requested. (optional)
   * @param limit Maximum number of reports. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases.</a>
   */
  public okhttp3.Call getEmailDeliveryReportsAsync(
      String bulkId,
      String messageId,
      Integer limit,
      final ApiCallback<EmailReportsResult> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getEmailDeliveryReportsValidateBeforeCall(bulkId, messageId, limit, _callback);
    Type localVarReturnType = new TypeToken<EmailReportsResult>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getEmailLogs.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId Email ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases</a>
   */
  public okhttp3.Call getEmailLogsCall(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/email/1/logs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (from != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
    }

    if (to != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
    }

    if (bulkId != null) {
      localVarCollectionQueryParams.addAll(
          localVarApiClient.parameterToPairs("multi", "bulkId", bulkId));
    }

    if (messageId != null) {
      localVarCollectionQueryParams.addAll(
          localVarApiClient.parameterToPairs("multi", "messageId", messageId));
    }

    if (generalStatus != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("generalStatus", generalStatus));
    }

    if (sentSince != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("sentSince", sentSince));
    }

    if (sentUntil != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("sentUntil", sentUntil));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getEmailLogsValidateBeforeCall(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getEmailLogsCall(
            from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, _callback);
    return localVarCall;
  }

  /**
   * Email messages logs. Get the logs to all email communications, including statuses.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId Email ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. (optional)
   * @return EmailLogsResult
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases</a>
   */
  public EmailLogsResult getEmailLogs(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit)
      throws ApiException {
    ApiResponse<EmailLogsResult> localVarResp =
        getEmailLogsWithHttpInfo(
            from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit);
    return localVarResp.getData();
  }

  /**
   * Email messages logs. Get the logs to all email communications, including statuses.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId Email ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. (optional)
   * @return ApiResponse&lt;EmailLogsResult&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases</a>
   */
  public ApiResponse<EmailLogsResult> getEmailLogsWithHttpInfo(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit)
      throws ApiException {
    okhttp3.Call localVarCall =
        getEmailLogsValidateBeforeCall(
            from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, null);
    Type localVarReturnType = new TypeToken<EmailLogsResult>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Email messages logs (asynchronously). Get the logs to all email communications, including
   * statuses.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId Email ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending message. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases</a>
   */
  public okhttp3.Call getEmailLogsAsync(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      final ApiCallback<EmailLogsResult> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getEmailLogsValidateBeforeCall(
            from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, _callback);
    Type localVarReturnType = new TypeToken<EmailLogsResult>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  private okhttp3.Call sendEmailCall(
      String from,
      String to,
      String subject,
      String cc,
      String bcc,
      String text,
      String bulkId,
      String messageId,
      Integer templateid,
      File attachment,
      File inlineImage,
      String HTML,
      String replyto,
      String defaultplaceholders,
      Boolean preserverecipients,
      String trackingUrl,
      Boolean trackclicks,
      Boolean trackopens,
      Boolean track,
      String callbackData,
      Boolean intermediateReport,
      String notifyUrl,
      String notifyContentType,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/email/2/send";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (from != null) {
      localVarFormParams.put("from", from);
    }

    if (to != null) {
      localVarFormParams.put("to", to);
    }

    if (cc != null) {
      localVarFormParams.put("cc", cc);
    }

    if (bcc != null) {
      localVarFormParams.put("bcc", bcc);
    }

    if (subject != null) {
      localVarFormParams.put("subject", subject);
    }

    if (text != null) {
      localVarFormParams.put("text", text);
    }

    if (bulkId != null) {
      localVarFormParams.put("bulkId", bulkId);
    }

    if (messageId != null) {
      localVarFormParams.put("messageId", messageId);
    }

    if (templateid != null) {
      localVarFormParams.put("templateid", templateid);
    }

    if (attachment != null) {
      localVarFormParams.put("attachment", attachment);
    }

    if (inlineImage != null) {
      localVarFormParams.put("inlineImage", inlineImage);
    }

    if (HTML != null) {
      localVarFormParams.put("HTML", HTML);
    }

    if (replyto != null) {
      localVarFormParams.put("replyto", replyto);
    }

    if (defaultplaceholders != null) {
      localVarFormParams.put("defaultplaceholders", defaultplaceholders);
    }

    if (preserverecipients != null) {
      localVarFormParams.put("preserverecipients", preserverecipients);
    }

    if (trackingUrl != null) {
      localVarFormParams.put("trackingUrl", trackingUrl);
    }

    if (trackclicks != null) {
      localVarFormParams.put("trackclicks", trackclicks);
    }

    if (trackopens != null) {
      localVarFormParams.put("trackopens", trackopens);
    }

    if (track != null) {
      localVarFormParams.put("track", track);
    }

    if (callbackData != null) {
      localVarFormParams.put("callbackData", callbackData);
    }

    if (intermediateReport != null) {
      localVarFormParams.put("intermediateReport", intermediateReport);
    }

    if (notifyUrl != null) {
      localVarFormParams.put("notifyUrl", notifyUrl);
    }

    if (notifyContentType != null) {
      localVarFormParams.put("notifyContentType", notifyContentType);
    }

    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call sendEmailValidateBeforeCall(
      String from,
      String to,
      String subject,
      String cc,
      String bcc,
      String text,
      String bulkId,
      String messageId,
      Integer templateid,
      File attachment,
      File inlineImage,
      String HTML,
      String replyto,
      String defaultplaceholders,
      Boolean preserverecipients,
      String trackingUrl,
      Boolean trackclicks,
      Boolean trackopens,
      Boolean track,
      String callbackData,
      Boolean intermediateReport,
      String notifyUrl,
      String notifyContentType,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException("Missing the required parameter 'from' when calling sendEmail(Async)");
    }

    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException("Missing the required parameter 'to' when calling sendEmail(Async)");
    }

    // verify the required parameter 'subject' is set
    if (subject == null) {
      throw new ApiException(
          "Missing the required parameter 'subject' when calling sendEmail(Async)");
    }

    okhttp3.Call localVarCall =
        sendEmailCall(
            from,
            to,
            subject,
            cc,
            bcc,
            text,
            bulkId,
            messageId,
            templateid,
            attachment,
            inlineImage,
            HTML,
            replyto,
            defaultplaceholders,
            preserverecipients,
            trackingUrl,
            trackclicks,
            trackopens,
            track,
            callbackData,
            intermediateReport,
            notifyUrl,
            notifyContentType,
            _callback);
    return localVarCall;
  }

  private ApiResponse<EmailSendResponse> sendEmailWithHttpInfo(
      String from,
      String to,
      String subject,
      String cc,
      String bcc,
      String text,
      String bulkId,
      String messageId,
      Integer templateid,
      File attachment,
      File inlineImage,
      String HTML,
      String replyto,
      String defaultplaceholders,
      Boolean preserverecipients,
      String trackingUrl,
      Boolean trackclicks,
      Boolean trackopens,
      Boolean track,
      String callbackData,
      Boolean intermediateReport,
      String notifyUrl,
      String notifyContentType)
      throws ApiException {
    okhttp3.Call localVarCall =
        sendEmailValidateBeforeCall(
            from,
            to,
            subject,
            cc,
            bcc,
            text,
            bulkId,
            messageId,
            templateid,
            attachment,
            inlineImage,
            HTML,
            replyto,
            defaultplaceholders,
            preserverecipients,
            trackingUrl,
            trackclicks,
            trackopens,
            track,
            callbackData,
            intermediateReport,
            notifyUrl,
            notifyContentType,
            null);
    Type localVarReturnType = new TypeToken<EmailSendResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  private okhttp3.Call sendEmailAsync(
      String from,
      String to,
      String subject,
      String cc,
      String bcc,
      String text,
      String bulkId,
      String messageId,
      Integer templateid,
      File attachment,
      File inlineImage,
      String HTML,
      String replyto,
      String defaultplaceholders,
      Boolean preserverecipients,
      String trackingUrl,
      Boolean trackclicks,
      Boolean trackopens,
      Boolean track,
      String callbackData,
      Boolean intermediateReport,
      String notifyUrl,
      String notifyContentType,
      final ApiCallback<EmailSendResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        sendEmailValidateBeforeCall(
            from,
            to,
            subject,
            cc,
            bcc,
            text,
            bulkId,
            messageId,
            templateid,
            attachment,
            inlineImage,
            HTML,
            replyto,
            defaultplaceholders,
            preserverecipients,
            trackingUrl,
            trackclicks,
            trackopens,
            track,
            callbackData,
            intermediateReport,
            notifyUrl,
            notifyContentType,
            _callback);
    Type localVarReturnType = new TypeToken<EmailSendResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }

  public class APIsendEmailRequest {
    private final String from;
    private final String to;
    private final String subject;
    private String cc;
    private String bcc;
    private String text;
    private String bulkId;
    private String messageId;
    private Integer templateid;
    private File attachment;
    private File inlineImage;
    private String HTML;
    private String replyto;
    private String defaultplaceholders;
    private Boolean preserverecipients;
    private String trackingUrl;
    private Boolean trackclicks;
    private Boolean trackopens;
    private Boolean track;
    private String callbackData;
    private Boolean intermediateReport;
    private String notifyUrl;
    private String notifyContentType;

    private APIsendEmailRequest(String from, String to, String subject) {
      this.from = from;
      this.to = to;
      this.subject = subject;
    }

    /**
     * Set cc
     *
     * @param cc CC recipient email address. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest cc(String cc) {
      this.cc = cc;
      return this;
    }

    /**
     * Set bcc
     *
     * @param bcc BCC recipient email address. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest bcc(String bcc) {
      this.bcc = bcc;
      return this;
    }

    /**
     * Set text
     *
     * @param text Body of message. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest text(String text) {
      this.text = text;
      return this;
    }

    /**
     * Set bulkId
     *
     * @param bulkId The ID uniquely identifies the sent Email request. This filter will enable you
     *     to query delivery reports for all the messages using just one request. You will receive a
     *     bulkId in the response after sending an Email request. If you don&#39;t set your own
     *     bulkId, unique ID will be generated by our system and returned in the API response.
     *     (Optional Field) (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest bulkId(String bulkId) {
      this.bulkId = bulkId;
      return this;
    }

    /**
     * Set messageId
     *
     * @param messageId The ID that uniquely identifies the message sent for a recipient. (Optional
     *     Field) (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest messageId(String messageId) {
      this.messageId = messageId;
      return this;
    }

    /**
     * Set templateid
     *
     * @param templateid Template identifier based on which the email message is generated. The
     *     template is created over Infobip web interface. If templateId is present then html and
     *     text values are ignored. NOTE : This field supports value of broadcast templateId only.
     *     Content templateId is not supported. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest templateid(Integer templateid) {
      this.templateid = templateid;
      return this;
    }

    /**
     * Set attachment
     *
     * @param attachment File attachment (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest attachment(File attachment) {
      this.attachment = attachment;
      return this;
    }

    /**
     * Set inlineImage
     *
     * @param inlineImage Using an inline image, it is possible to insert the image file inside the
     *     HTML code of the email by using cid:FILENAME instead of providing any external link to
     *     image. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest inlineImage(File inlineImage) {
      this.inlineImage = inlineImage;
      return this;
    }

    /**
     * Set HTML
     *
     * @param HTML HTML body of the message. If HTML and text fields are present, text field will be
     *     ignored and HTML will be delivered as message body. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest HTML(String HTML) {
      this.HTML = HTML;
      return this;
    }

    /**
     * Set replyto
     *
     * @param replyto Email address to which recipients of the email can reply. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest replyto(String replyto) {
      this.replyto = replyto;
      return this;
    }

    /**
     * Set defaultplaceholders
     *
     * @param defaultplaceholders Default placeholder values used for all recipients. The values are
     *     used to generate the email message. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest defaultplaceholders(String defaultplaceholders) {
      this.defaultplaceholders = defaultplaceholders;
      return this;
    }

    /**
     * Set preserverecipients
     *
     * @param preserverecipients This parameter enables preserving To recipients for an email when
     *     value is true, default value is false for this parameter. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest preserverecipients(Boolean preserverecipients) {
      this.preserverecipients = preserverecipients;
      return this;
    }

    /**
     * Set trackingUrl
     *
     * @param trackingUrl The URL on your callback server on which the open and click notifications
     *     will be sent. If you are passing this parameter then track&#x3D;true will be assigned,
     *     you don&#39;t need to pass track&#x3D;true separately. See the section \\\&quot;Tracking
     *     Notifications\\\&quot; below for details. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest trackingUrl(String trackingUrl) {
      this.trackingUrl = trackingUrl;
      return this;
    }

    /**
     * Set trackclicks
     *
     * @param trackclicks This parameter enables or disables track click feature. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest trackclicks(Boolean trackclicks) {
      this.trackclicks = trackclicks;
      return this;
    }

    /**
     * Set trackopens
     *
     * @param trackopens This parameter enables or disables track open feature. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest trackopens(Boolean trackopens) {
      this.trackopens = trackopens;
      return this;
    }

    /**
     * Set track
     *
     * @param track Enable or disable open and click tracking.Default value is true. Passing true
     *     will only enable tracking and the statistics would be visible in web interface alone.
     *     This can be explicitly overridden by trackopens and trackclikcs. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest track(Boolean track) {
      this.track = track;
      return this;
    }

    /**
     * Set callbackData
     *
     * @param callbackData Additional client data that will be sent on the notifyUrl. The maximum
     *     value is 4000 characters. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest callbackData(String callbackData) {
      this.callbackData = callbackData;
      return this;
    }

    /**
     * Set intermediateReport
     *
     * @param intermediateReport The real-time Intermediate delivery report that will be sent on
     *     your callback server. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest intermediateReport(Boolean intermediateReport) {
      this.intermediateReport = intermediateReport;
      return this;
    }

    /**
     * Set notifyUrl
     *
     * @param notifyUrl The URL on your callback server on which the Delivery report will be sent.
     *     (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest notifyUrl(String notifyUrl) {
      this.notifyUrl = notifyUrl;
      return this;
    }

    /**
     * Set notifyContentType
     *
     * @param notifyContentType Preferred Delivery report content type. Can be application/json or
     *     application/xml. (optional)
     * @return APIsendEmailRequest
     */
    public APIsendEmailRequest notifyContentType(String notifyContentType) {
      this.notifyContentType = notifyContentType;
      return this;
    }

    /**
     * Build call for sendEmail.
     *
     * @param _callback ApiCallback API callback
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
      return sendEmailCall(
          from,
          to,
          subject,
          cc,
          bcc,
          text,
          bulkId,
          messageId,
          templateid,
          attachment,
          inlineImage,
          HTML,
          replyto,
          defaultplaceholders,
          preserverecipients,
          trackingUrl,
          trackclicks,
          trackopens,
          track,
          callbackData,
          intermediateReport,
          notifyUrl,
          notifyContentType,
          _callback);
    }

    /**
     * Execute sendEmail request.
     *
     * @return EmailSendResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public EmailSendResponse execute() throws ApiException {
      ApiResponse<EmailSendResponse> localVarResp =
          sendEmailWithHttpInfo(
              from,
              to,
              subject,
              cc,
              bcc,
              text,
              bulkId,
              messageId,
              templateid,
              attachment,
              inlineImage,
              HTML,
              replyto,
              defaultplaceholders,
              preserverecipients,
              trackingUrl,
              trackclicks,
              trackopens,
              track,
              callbackData,
              intermediateReport,
              notifyUrl,
              notifyContentType);
      return localVarResp.getData();
    }

    /**
     * Execute sendEmail request with HTTP info returned.
     *
     * @return ApiResponse&lt;EmailSendResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<EmailSendResponse> executeWithHttpInfo() throws ApiException {
      return sendEmailWithHttpInfo(
          from,
          to,
          subject,
          cc,
          bcc,
          text,
          bulkId,
          messageId,
          templateid,
          attachment,
          inlineImage,
          HTML,
          replyto,
          defaultplaceholders,
          preserverecipients,
          trackingUrl,
          trackclicks,
          trackopens,
          track,
          callbackData,
          intermediateReport,
          notifyUrl,
          notifyContentType);
    }

    /**
     * Execute sendEmail request (asynchronously).
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public okhttp3.Call executeAsync(final ApiCallback<EmailSendResponse> _callback)
        throws ApiException {
      return sendEmailAsync(
          from,
          to,
          subject,
          cc,
          bcc,
          text,
          bulkId,
          messageId,
          templateid,
          attachment,
          inlineImage,
          HTML,
          replyto,
          defaultplaceholders,
          preserverecipients,
          trackingUrl,
          trackclicks,
          trackopens,
          track,
          callbackData,
          intermediateReport,
          notifyUrl,
          notifyContentType,
          _callback);
    }
  }

  /**
   * Fully featured email. Send an email or multiple emails to a recipient or multiple recipients
   * with CC/BCC enabled.
   *
   * @param from Email address with optional sender name. (required)
   * @param to Email address of the recipient. (required)
   * @param subject Message subject. (required)
   * @return APIsendEmailRequest +
   * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use
   *     cases.</a>
   */
  public APIsendEmailRequest sendEmail(String from, String to, String subject) {
    return new APIsendEmailRequest(from, to, subject);
  }
}