package com.project.Coderock.domain.value_objects;

public class Status {
    private String status;

    public Status(String status) {
        this.status = status;
    }

    public void setInInvestmen() throws Exception {
        if (this.status.equals("withdrawn")) throw new Exception("Invalid action: status is withdrawn");
        this.status = "in_investment";
    }

    public void setWithdrawn() throws Exception {
        if (this.status.equals("withdrawn")) throw new Exception("Invalid action: investment already withdrawn");
        this.status = "withdrawn";
    }

    public static Status create() {
        return new Status("in_investment");
    }

    public static Status restore(String status) {
        return new Status(status);
    }

    public String getStatus() {
        return status;
    }
}