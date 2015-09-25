package com.study.petproject.service;

import com.study.petproject.dao.BanList;
import com.study.petproject.repository.BanListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class represents service Api for ban lists manipulation.
 * Created by Mariia_Lukianets on 22.09.2015.
 */
@Service
public class BanListService {
    @Autowired
    private BanListRepository repository;

    public List<BanList> getAllBanLists() {
        repository.deleteAll();
        repository.save(new BanList(1, "banloic"));
        return repository.findAll();
    }
    //public static void main
}
