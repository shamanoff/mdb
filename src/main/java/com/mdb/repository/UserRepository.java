package com.mdb.repository;

import com.mdb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);


/*    @Autowired
    MongoTemplate mongoTemplate;

    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }*/
}
