package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.TestAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestAppointmentRepository extends JpaRepository<TestAppointment,Integer> {
}
