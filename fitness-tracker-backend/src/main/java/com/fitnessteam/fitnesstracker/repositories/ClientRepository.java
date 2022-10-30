package com.fitnessteam.fitnesstracker.repositories;


import com.fitnessteam.fitnesstracker.entities.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Qualifier("client")
public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> findAllById(Long id);
}
