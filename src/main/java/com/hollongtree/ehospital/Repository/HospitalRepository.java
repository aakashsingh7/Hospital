package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository  extends JpaRepository<Hospital,String> {
}
