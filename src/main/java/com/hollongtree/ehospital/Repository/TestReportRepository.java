package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.TestReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestReportRepository  extends JpaRepository<TestReport,Integer> {
}
