package com.example.xudong.myquick.DataBase;

import com.google.gson.Gson;
public class user {
    public int id;
    public String user_name;
    public String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return id == ((user) o).id;
    }
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
