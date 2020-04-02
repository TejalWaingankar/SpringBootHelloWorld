
package com.boot.model;

import java.util.HashMap;
import java.util.Map;

public class Refreshinfo {

    private Integer statusCode;
    private String statusMessage;
    private String lastRefreshed;
    private String lastRefreshAttempt;
    private String nextRefreshScheduled;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getLastRefreshAttempt() {
        return lastRefreshAttempt;
    }

    public void setLastRefreshAttempt(String lastRefreshAttempt) {
        this.lastRefreshAttempt = lastRefreshAttempt;
    }

    public String getNextRefreshScheduled() {
        return nextRefreshScheduled;
    }

    public void setNextRefreshScheduled(String nextRefreshScheduled) {
        this.nextRefreshScheduled = nextRefreshScheduled;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
