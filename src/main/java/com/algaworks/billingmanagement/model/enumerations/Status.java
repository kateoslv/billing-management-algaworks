package com.algaworks.billingmanagement.model.enumerations;

public enum Status {

    PENDING("Pending"),
    RECEIVED("Received");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
