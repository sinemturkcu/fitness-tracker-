package com.fitnessteam.fitnesstracker.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainingProgramDto {
    private Long id;
    private int setNumber;
    private int repetitionNumber;
    private String note;
    private Long clientId;
    private Long fitnessMoveId;
    private String gifUrl;
    private String name;
    private String target;
    private String bodyPart;


    public TrainingProgramDto(Long id, int setNumber, int repetitionNumber, String note, Long clientId, Long fitnessMoveId,
                              String gifUrl, String name, String target, String bodyPart) {
        this.id = id;
        this.setNumber = setNumber;
        this.repetitionNumber = repetitionNumber;
        this.note = note;
        this.clientId = clientId;
        this.fitnessMoveId = fitnessMoveId;
        this.gifUrl = gifUrl;
        this.name = name;
        this.target = target;
        this.bodyPart = bodyPart;
    }
}
