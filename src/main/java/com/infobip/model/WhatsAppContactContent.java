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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** An array of contacts sent in a WhatsApp message. */
public class WhatsAppContactContent {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";

  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<WhatsAppAddressContent> addresses = null;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";

  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private String birthday;

  public static final String SERIALIZED_NAME_EMAILS = "emails";

  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<WhatsAppEmailContent> emails = null;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private WhatsAppNameContent name;

  public static final String SERIALIZED_NAME_ORG = "org";

  @SerializedName(SERIALIZED_NAME_ORG)
  private WhatsAppOrganizationContent org;

  public static final String SERIALIZED_NAME_PHONES = "phones";

  @SerializedName(SERIALIZED_NAME_PHONES)
  private List<WhatsAppPhoneContent> phones = null;

  public static final String SERIALIZED_NAME_URLS = "urls";

  @SerializedName(SERIALIZED_NAME_URLS)
  private List<WhatsAppUrlContent> urls = null;

  public WhatsAppContactContent addresses(List<WhatsAppAddressContent> addresses) {

    this.addresses = addresses;
    return this;
  }

  public WhatsAppContactContent addAddressesItem(WhatsAppAddressContent addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Array of addresses information.
   *
   * @return addresses
   */
  public List<WhatsAppAddressContent> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<WhatsAppAddressContent> addresses) {
    this.addresses = addresses;
  }

  public WhatsAppContactContent birthday(String birthday) {

    this.birthday = birthday;
    return this;
  }

  /**
   * Date of birth in &#x60;YYYY-MM-DD&#x60; format.
   *
   * @return birthday
   */
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public WhatsAppContactContent emails(List<WhatsAppEmailContent> emails) {

    this.emails = emails;
    return this;
  }

  public WhatsAppContactContent addEmailsItem(WhatsAppEmailContent emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Array of emails information.
   *
   * @return emails
   */
  public List<WhatsAppEmailContent> getEmails() {
    return emails;
  }

  public void setEmails(List<WhatsAppEmailContent> emails) {
    this.emails = emails;
  }

  public WhatsAppContactContent name(WhatsAppNameContent name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  public WhatsAppNameContent getName() {
    return name;
  }

  public void setName(WhatsAppNameContent name) {
    this.name = name;
  }

  public WhatsAppContactContent org(WhatsAppOrganizationContent org) {

    this.org = org;
    return this;
  }

  /**
   * Get org
   *
   * @return org
   */
  public WhatsAppOrganizationContent getOrg() {
    return org;
  }

  public void setOrg(WhatsAppOrganizationContent org) {
    this.org = org;
  }

  public WhatsAppContactContent phones(List<WhatsAppPhoneContent> phones) {

    this.phones = phones;
    return this;
  }

  public WhatsAppContactContent addPhonesItem(WhatsAppPhoneContent phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Array of phones information.
   *
   * @return phones
   */
  public List<WhatsAppPhoneContent> getPhones() {
    return phones;
  }

  public void setPhones(List<WhatsAppPhoneContent> phones) {
    this.phones = phones;
  }

  public WhatsAppContactContent urls(List<WhatsAppUrlContent> urls) {

    this.urls = urls;
    return this;
  }

  public WhatsAppContactContent addUrlsItem(WhatsAppUrlContent urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Array of urls information.
   *
   * @return urls
   */
  public List<WhatsAppUrlContent> getUrls() {
    return urls;
  }

  public void setUrls(List<WhatsAppUrlContent> urls) {
    this.urls = urls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppContactContent whatsAppContactContent = (WhatsAppContactContent) o;
    return Objects.equals(this.addresses, whatsAppContactContent.addresses)
        && Objects.equals(this.birthday, whatsAppContactContent.birthday)
        && Objects.equals(this.emails, whatsAppContactContent.emails)
        && Objects.equals(this.name, whatsAppContactContent.name)
        && Objects.equals(this.org, whatsAppContactContent.org)
        && Objects.equals(this.phones, whatsAppContactContent.phones)
        && Objects.equals(this.urls, whatsAppContactContent.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, birthday, emails, name, org, phones, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppContactContent {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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