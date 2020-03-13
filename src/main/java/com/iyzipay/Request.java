package com.iyzipay;

public class Request {

    private String locale;
    private String conversationId;
    private String correlationId;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("locale", locale)
                .append("conversationId", conversationId)
                .append("correlationId", correlationId)
                .toString();
    }
}
