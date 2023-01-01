package com.fitnessteam.fitnesstracker.repositories;


import com.fitnessteam.fitnesstracker.dtos.ClientDto;
import com.fitnessteam.fitnesstracker.dtos.ClientFilterDto;
import com.fitnessteam.fitnesstracker.dtos.TrackerFilterDto;
import com.fitnessteam.fitnesstracker.entities.Client;
import com.fitnessteam.fitnesstracker.entities.FitnessMove;
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

    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.ClientFilterDto" +
            "(c.id, c.fullName)" +
            "FROM Client c" +
            " where (:trackerId IS NULL OR c.tracker.id =: trackerId) ")
    List<ClientFilterDto> filterByTrackerId(Long trackerId);


    @Query(value = "SELECT NEW com.fitnessteam.fitnesstracker.dtos.ClientFilterDto" +
            "(c.id, c.fullName)" +
            "FROM Client c" +
            " where (:userId IS NULL OR c.user.id =: userId) ")
    ClientFilterDto filterByUserId(Long userId);
}
