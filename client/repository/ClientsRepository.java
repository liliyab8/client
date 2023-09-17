package com.fenix.client.repository;

import com.fenix.client.data.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientsRepository extends JpaRepository<ClientEntity, String> {
}
