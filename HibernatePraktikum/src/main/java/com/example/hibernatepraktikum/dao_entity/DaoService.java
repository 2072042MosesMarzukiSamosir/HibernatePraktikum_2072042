package com.example.hibernatepraktikum.dao_entity;

import java.util.List;

public interface DaoService<T> {
    List<T>getdata();
    void addData(T data);
    void deleteData(T data);
    void updateData(T data);
}
