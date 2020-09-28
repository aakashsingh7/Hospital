package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PatientRepository extends JpaRepository<Patient ,String> {

}
