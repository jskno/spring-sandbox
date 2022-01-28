package com.jskno.spring.sandbox.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends CrudRepository<News, Long> {

    List<News> findAll();
}
