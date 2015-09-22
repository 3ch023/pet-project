package com.study.petproject.dao;

import org.springframework.data.annotation.Id;
/**
 * Created by Mariia_Lukianets on 22.09.2015.
 */
public class BanItem {
    @Id
    private int id;
    private int listId;
    private String email;

    public BanItem() {}

    public BanItem(int id, int listId, String email) {
        this.id = id;
        this.listId = listId;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BanItem{" +
                "id=" + id +
                ", listId=" + listId +
                ", email='" + email + '\'' +
                '}';
    }
}
