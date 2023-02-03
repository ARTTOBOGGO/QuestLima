package com.example.repository;

import com.example.entity.User;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public interface Repository<T> {
    Stream<T> find(T pattern);
    Collection<User> getAll();
    T get(long id);
    void create(T entity);

    void update(T entity);
    void delete(T entity);
}
