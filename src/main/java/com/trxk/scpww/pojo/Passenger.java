package com.trxk.scpww.pojo;

public class Passenger {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passenger.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passenger.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passenger.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passenger.identity_number
     *
     * @mbg.generated
     */
    private Integer identityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passenger.buy_count
     *
     * @mbg.generated
     */
    private String buyCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passenger.id
     *
     * @return the value of passenger.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passenger.id
     *
     * @param id the value for passenger.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passenger.name
     *
     * @return the value of passenger.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passenger.name
     *
     * @param name the value for passenger.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passenger.telephone
     *
     * @return the value of passenger.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passenger.telephone
     *
     * @param telephone the value for passenger.telephone
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passenger.identity_number
     *
     * @return the value of passenger.identity_number
     *
     * @mbg.generated
     */
    public Integer getIdentityNumber() {
        return identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passenger.identity_number
     *
     * @param identityNumber the value for passenger.identity_number
     *
     * @mbg.generated
     */
    public void setIdentityNumber(Integer identityNumber) {
        this.identityNumber = identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passenger.buy_count
     *
     * @return the value of passenger.buy_count
     *
     * @mbg.generated
     */
    public String getBuyCount() {
        return buyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passenger.buy_count
     *
     * @param buyCount the value for passenger.buy_count
     *
     * @mbg.generated
     */
    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount == null ? null : buyCount.trim();
    }
}