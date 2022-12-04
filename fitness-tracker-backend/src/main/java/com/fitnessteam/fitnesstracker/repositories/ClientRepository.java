package com.fitnessteam.fitnesstracker.repositories;


import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Qualifier("client")
public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> findAllById(Long id);

    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.ClientDto" +
            "(c.id, c.fullName, c.emailAddress, c.phoneNumber, c.createdOn, c.gender, c.tracker.id, c.tracker.fullName)" +
            "FROM Client c")
    List<ClientDto> listAllClients();

}
