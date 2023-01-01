package com.fitnessteam.fitnesstracker.servicesImp;


import com.fitnessteam.fitnesstracker.dtos.TrainingProgramDto;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Service
public class ExcelExportService {

    private final MessageSource messageSource;

    @Autowired
    public ExcelExportService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public ByteArrayInputStream exportTrainingProgram(List<TrainingProgramDto> trainingProgramDtoList){


        return null;

    }



}
