package com.example.rastaurant.withlist.repository;

import com.example.rastaurant.db.MemoryDbRepositoryAbstract;
import com.example.rastaurant.withlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}
