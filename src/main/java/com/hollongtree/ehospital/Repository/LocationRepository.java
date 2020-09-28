package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.LocationAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<LocationAnalysis,Integer> {
}
