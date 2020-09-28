package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.PrescriptionPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository extends JpaRepository<PrescriptionPage,Integer> {
}
