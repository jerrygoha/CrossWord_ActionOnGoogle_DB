package com.o2o.action.server.rest;

import com.o2o.action.server.model.Word;
import com.o2o.action.server.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    WordRepository repository;

    @RequestMapping("/getWord/{stageDifficulty}")
    public List<Word.wordMapping> getWord(@PathVariable String stageDifficulty){
        return repository.findByStageDifficulty(stageDifficulty);
    }



}
