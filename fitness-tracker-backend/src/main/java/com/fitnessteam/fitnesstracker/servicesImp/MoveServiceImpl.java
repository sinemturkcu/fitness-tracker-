package com.fitnessteam.fitnesstracker.servicesImp;

import com.fitnessteam.fitnesstracker.entities.Move;
import com.fitnessteam.fitnesstracker.repositories.MoveRepository;
import com.fitnessteam.fitnesstracker.services.MoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoveServiceImpl implements MoveService {

    MoveRepository moveRepository;

    @Autowired
    public MoveServiceImpl(MoveRepository moveRepository) {
        this.moveRepository = moveRepository;
    }

    @Override
    public Move saveMove(Move move) {
        return moveRepository.save(move);
    }

    @Override
    public void deleteMove(Long id) {
        moveRepository.deleteById(id);
    }

    @Override
    public List<Move> getAll() {
        return moveRepository.findAll();
    }
}
