package com.o2o.action.server.repository;

import com.o2o.action.server.model.Word;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface WordRepository extends PagingAndSortingRepository<Word, Long> {
    List<Word> findAll();
    List<Word.wordMapping> findByStageDifficulty(String stageDifficulty);

}
