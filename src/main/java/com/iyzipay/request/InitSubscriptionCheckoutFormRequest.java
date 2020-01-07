package com.iyzipay.request;

import com.iyzipay.Request;
import com.iyzipay.model.subscription.Customer;

public class InitSubscriptionCheckoutFormRequest extends Request {

    private String callbackUrl;
    private String pricingPlanReferenceCode;
    private String subscriptionInitialStatus;
    private Customer customer;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getPricingPlanReferenceCode() {
        return pricingPlanReferenceCode;
    }

    public void setPricingPlanReferenceCode(String pricingPlanReferenceCode) {
        this.pricingPlanReferenceCode = pricingPlanReferenceCode;
    }

    public String getSubscriptionInitialStatus() {
        return subscriptionInitialStatus;
    }

    public void setSubscriptionInitialStatus(String subscriptionInitialStatus) {
        this.subscriptionInitialStatus = subscriptionInitialStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
