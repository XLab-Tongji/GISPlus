package com.rainlf.mongo.repository;

import com.rainlf.mongo.entity.Map;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */
public interface MongoMapRepository extends MongoRepository<Map, String> {

    List<Map> findAllByUserId(String userId);

}
