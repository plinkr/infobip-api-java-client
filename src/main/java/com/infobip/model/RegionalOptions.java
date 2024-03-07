/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Region-specific parameters, often imposed by local laws. Use this, if country or region that you are sending an SMS to requires additional information.
 */
public class RegionalOptions {

    private IndiaDltOptions indiaDlt;

    private TurkeyIysOptions turkeyIys;

    private SouthKoreaOptions southKorea;

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     * @return This {@link RegionalOptions instance}.
     */
    public RegionalOptions indiaDlt(IndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
        return this;
    }

    /**
     * Returns indiaDlt.
     *
     * @return indiaDlt
     */
    @JsonProperty("indiaDlt")
    public IndiaDltOptions getIndiaDlt() {
        return indiaDlt;
    }

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     */
    @JsonProperty("indiaDlt")
    public void setIndiaDlt(IndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
    }

    /**
     * Sets turkeyIys.
     *
     * @param turkeyIys
     * @return This {@link RegionalOptions instance}.
     */
    public RegionalOptions turkeyIys(TurkeyIysOptions turkeyIys) {
        this.turkeyIys = turkeyIys;
        return this;
    }

    /**
     * Returns turkeyIys.
     *
     * @return turkeyIys
     */
    @JsonProperty("turkeyIys")
    public TurkeyIysOptions getTurkeyIys() {
        return turkeyIys;
    }

    /**
     * Sets turkeyIys.
     *
     * @param turkeyIys
     */
    @JsonProperty("turkeyIys")
    public void setTurkeyIys(TurkeyIysOptions turkeyIys) {
        this.turkeyIys = turkeyIys;
    }

    /**
     * Sets southKorea.
     *
     * @param southKorea
     * @return This {@link RegionalOptions instance}.
     */
    public RegionalOptions southKorea(SouthKoreaOptions southKorea) {
        this.southKorea = southKorea;
        return this;
    }

    /**
     * Returns southKorea.
     *
     * @return southKorea
     */
    @JsonProperty("southKorea")
    public SouthKoreaOptions getSouthKorea() {
        return southKorea;
    }

    /**
     * Sets southKorea.
     *
     * @param southKorea
     */
    @JsonProperty("southKorea")
    public void setSouthKorea(SouthKoreaOptions southKorea) {
        this.southKorea = southKorea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionalOptions regionalOptions = (RegionalOptions) o;
        return Objects.equals(this.indiaDlt, regionalOptions.indiaDlt)
                && Objects.equals(this.turkeyIys, regionalOptions.turkeyIys)
                && Objects.equals(this.southKorea, regionalOptions.southKorea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indiaDlt, turkeyIys, southKorea);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RegionalOptions {")
                .append(newLine)
                .append("    indiaDlt: ")
                .append(toIndentedString(indiaDlt))
                .append(newLine)
                .append("    turkeyIys: ")
                .append(toIndentedString(turkeyIys))
                .append(newLine)
                .append("    southKorea: ")
                .append(toIndentedString(southKorea))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
