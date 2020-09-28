package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.Labtest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabtestRepository extends JpaRepository<Labtest,Integer> {
}
