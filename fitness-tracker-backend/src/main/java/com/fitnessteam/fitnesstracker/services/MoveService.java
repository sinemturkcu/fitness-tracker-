package com.fitnessteam.fitnesstracker.services;

import com.fitnessteam.fitnesstracker.entities.Move;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MoveService {
    Move saveMove(Move move);
    void deleteMove(Long id);
    List<Move> getAll();
}
