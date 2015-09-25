package com.study.petproject.repository;

import com.study.petproject.dao.BanList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mariia_Lukianets on 22.09.2015.
 */
@Repository
public interface BanListRepository extends MongoRepository<BanList, Integer> {
    public BanList findById(String id);
}
