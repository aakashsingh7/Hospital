package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository  extends JpaRepository<LoginHistory, Integer> {
}
