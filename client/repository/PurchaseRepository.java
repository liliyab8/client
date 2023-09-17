package com.fenix.client.repository;
import com.fenix.client.data.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity, String> {
}
