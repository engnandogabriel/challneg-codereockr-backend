package com.project.Coderock.domain.entites.Balance;

import java.time.LocalDate;

public abstract class Balance {
    protected Double tax = 0.0052;

    public abstract Double setBalance(Double amount, LocalDate create_date, String viewDate) throws Exception;

    public abstract int getMonths(LocalDate create_date, String view_date) throws Exception;

    protected double getGains(LocalDate create_date, String viewDate) throws Exception{
        int months = this.getMonths(create_date, viewDate);
        if (months <= 0) return 0.0;
        return Math.pow(1 + this.tax, months);
    }
}


