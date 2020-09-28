
package com.hollongtree.ehospital.Repository;

import com.hollongtree.ehospital.entity.PrescriptionList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<PrescriptionList,String> {

}
