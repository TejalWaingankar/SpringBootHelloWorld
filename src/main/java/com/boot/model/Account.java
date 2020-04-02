
package com.boot.model;

import java.util.HashMap;
import java.util.Map;

public class Account {

    private String cONTAINER;
    private String accountName;
    private String accountNumber;
    private String accountStatus;
    private String accountType;
    private AvailableBalance availableBalance;
    private Balance balance;
    private String createdDate;
    private Integer id;
    private Boolean isAsset;
    private Integer providerAccountId;
    private Integer providerId;
    private String providerName;
    private Refreshinfo refreshinfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCONTAINER() {
        return cONTAINER;
    }

    public void setCONTAINER(String cONTAINER) {
        this.cONTAINER = cONTAINER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public AvailableBalance getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(AvailableBalance availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsAsset() {
        return isAsset;
    }

    public void setIsAsset(Boolean isAsset) {
        this.isAsset = isAsset;
    }

    public Integer getProviderAccountId() {
        return providerAccountId;
    }

    public void setProviderAccountId(Integer providerAccountId) {
        this.providerAccountId = providerAccountId;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Refreshinfo getRefreshinfo() {
        return refreshinfo;
    }

    public void setRefreshinfo(Refreshinfo refreshinfo) {
        this.refreshinfo = refreshinfo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
