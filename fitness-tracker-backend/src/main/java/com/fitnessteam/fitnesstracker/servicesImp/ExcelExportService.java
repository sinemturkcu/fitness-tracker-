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

@Service
public class ExcelExportService {

    private final MessageSource messageSource;

    private static final String EXPORT_FAIL_ERR_MSG = "export.failed";

    @Autowired
    public ExcelExportService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public ByteArrayInputStream exportTrainingProgram(List<TrainingProgramDto> trainingProgramDtoList){
        try(Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();){
            Sheet sheet = workbook.createSheet("TrainingProgram");
            String[] columns = {"MoveName",
                    "RepetititonNumber",
                    "SetNumber",
                    "Target",
                    "Feeling",
                    "Reps",
                    };

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = (XSSFFont) workbook.createFont();
            font.setBold(true);
            font.setFontHeight(20);

            style.setFont(font);
            style.setAlignment(HorizontalAlignment.CENTER);

            Row headerRow = sheet.createRow(0);


            font.setFontHeight(10);

            for (int col = 0; col < columns.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellStyle(style);
                cell.setCellValue(messageSource.getMessage(columns[col],
                        null, LocaleContextHolder.getLocale()));
            }

            int rowIdx = 1;
            for (TrainingProgramDto trainingProgramDto: trainingProgramDtoList){
                Row row = sheet.createRow(rowIdx++);

                row.createCell(0).setCellValue(trainingProgramDto.getName());
                row.createCell(0).setCellValue(trainingProgramDto.getRepetitionNumber());
                row.createCell(0).setCellValue(trainingProgramDto.getSetNumber());
                row.createCell(0).setCellValue(trainingProgramDto.getTarget());
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());

        } catch (IOException e) {
            throw new RuntimeException(EXPORT_FAIL_ERR_MSG);
        }
    }

}
