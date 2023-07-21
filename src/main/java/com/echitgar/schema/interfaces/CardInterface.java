package com.echitgar.schema.interfaces;

public interface CardInterface {
    void setName(String name);
    String getName();

    String getNumber();
    void setNumber(String number);

    String getExpirationDate();
    void setExpirationDate(String expirationDate);

    String getCvv();
    void setCvv(String cvv);
}
