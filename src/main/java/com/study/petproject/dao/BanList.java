package com.study.petproject.dao;

import org.springframework.data.annotation.Id;

/**
 * Created by Mariia_Lukianets on 22.09.2015.
 */
public class BanList {
    @Id
    private int id;
    private String name;

    public BanList() {}

    public BanList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BanList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
