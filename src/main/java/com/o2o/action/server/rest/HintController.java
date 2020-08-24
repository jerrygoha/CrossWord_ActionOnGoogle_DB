package com.o2o.action.server.rest;

import com.o2o.action.server.model.Hint;
import com.o2o.action.server.repository.HintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HintController {

    @Autowired
    HintRepository repository;

    @RequestMapping("/getHint/{wordContent}")
    public List<Hint.HintMapping> getHint(@PathVariable String wordContent){
        return repository.findByWordContent(wordContent);
    }


}
