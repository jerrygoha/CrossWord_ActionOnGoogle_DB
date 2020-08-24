package com.o2o.action.server.repository;

import com.o2o.action.server.model.Hint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface HintRepository extends CrudRepository<Hint, Long> {
    List<Hint> findAll();
    List<Hint.HintMapping> findByWordContent(String word_content);




}
