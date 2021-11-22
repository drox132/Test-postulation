package com.company.model;

public class User {
    private int id;
    private boolean subscription;
    private Integer credit;

    public User(){}

    public User (int id, boolean subscription, Integer credit){
        this.id=id;
        this.subscription=subscription;
        this.credit=credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", subscription=" + subscription +
                ", credit=" + credit +
                '}';
    }
}

