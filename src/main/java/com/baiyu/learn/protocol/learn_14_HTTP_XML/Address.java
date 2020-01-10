package com.baiyu.learn.protocol.learn_14_HTTP_XML;

/**
 * @auther baiyu
 * @date 2020/1/7
 */
public class Address {
    /* First line of street information (required) */
    private String street1;
    /* Second line of street information (optional). */
    private String street2;

    private String city;
    /**
     * State abbreviation (required for the U.S. and Canada,
     * optional otherwise).
     */
    private String state;
    /** Postal code(required for the U.S. and Canada, optional
     *  otherwise). */
    private String postCode;
    /** Country name (optional, U.S. assumed if not supplied). */
    private String country;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
