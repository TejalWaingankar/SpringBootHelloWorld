
package com.boot.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    private List<Account> account = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
