package com.repository;

import com.model.Parrot;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ParrotRepository extends ReactiveMongoRepository<Parrot, String> {
}
