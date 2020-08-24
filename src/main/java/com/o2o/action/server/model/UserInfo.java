package com.o2o.action.server.model;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "userinfo")
public class UserInfo {

    @Id
    @Column(name = "userEmail")
    private String user_email;

    @Column(name = "userLevel")
    private short user_level;

    @Column(name = "userExp")
    private int user_exp;

    @Column(name = "userHint")
    private int user_hint;

    @Column(name = "userCoin")
    private int user_coin;

    @Column(name = "accountTimestamp", columnDefinition = "TIME WITH TIME ZONE" )
    private OffsetDateTime account_timestamp;

    @Column(name = "visitTimestamp", columnDefinition = "TIME WITH TIME ZONE" )
    private OffsetDateTime visit_timestamp;

    protected UserInfo(){
    }

    public UserInfo(String user_email){
        this.user_email = user_email;
        user_level = 1;
        user_exp = 0;
        user_hint = 3;
        user_coin = 5000;
        account_timestamp = OffsetDateTime.now();
        visit_timestamp = OffsetDateTime.now();
    }

    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public short getUser_level() {
        return user_level;
    }
    public void setUser_level(short user_level) {
        this.user_level = user_level;
    }
    public int getUser_exp() {
        return user_exp;
    }
    public void setUser_exp(int user_exp) {
        this.user_exp = user_exp;
    }
    public void setUser_coin(int user_coin) {
        this.user_coin = user_coin;
    }
    public int getUser_coin() {
        return user_coin;
    }
    public int getUser_hint() {
        return user_hint;
    }
    public void setUser_hint(int user_hint) {
        this.user_hint = user_hint;
    }
    public OffsetDateTime getAccount_timestamp() {
        return account_timestamp;
    }
    public void setAccount_timestamp(OffsetDateTime account_timestamp) {
        this.account_timestamp = account_timestamp;
    }
    public OffsetDateTime getVisit_timestamp() {
        return visit_timestamp;
    }
    public void setVisit_timestamp(OffsetDateTime visit_timestamp) {
        this.visit_timestamp = visit_timestamp;
    }
}
