package Gtm.utils;

import org.apache.poi.ss.usermodel.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelColumnUtils {

    public static void deleteEmptyColumns(Sheet sheet) {
        if (sheet == null) return;

        // 1. Find the maximum column index across all rows
        int maxColumnIdx = 0;
        for (Row row : sheet) {
            if (row.getLastCellNum() > maxColumnIdx) {
                maxColumnIdx = row.getLastCellNum();
            }
        }

        // 2. Identify which columns are entirely empty (Scan from right to left)
        List<Integer> emptyColumnIndices = new ArrayList<>();
        
        for (int col = maxColumnIdx - 1; col >= 0; col--) {
            if (isColumnEmpty(sheet, col)) {
                emptyColumnIndices.add(col);
            }
        }

        // 3. Delete empty columns and shift remaining columns left
        // Iterating right-to-left prevents shifting from breaking subsequent indices
        for (int colIdx : emptyColumnIndices) {
            deleteAndShiftColumn(sheet, colIdx, maxColumnIdx);
            maxColumnIdx--; // The effective total number of columns shrinks
        }
    }

    /**
     * Checks if every single cell in a column is null, empty, or blank.
     */
    private static boolean isColumnEmpty(Sheet sheet, int colIdx) {
        for (int r = sheet.getFirstRowNum() + 1 ; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;

            Cell cell = row.getCell(colIdx);
            if (cell != null && cell.getCellType() != CellType.BLANK) {
                // If a cell has content (text, numeric, formula, error), column is not empty
                if (cell.getCellType() == CellType.STRING && !cell.getStringCellValue().trim().isEmpty()) {
                    return false; 
                }
                if (cell.getCellType() != CellType.STRING) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Removes the cell for the target column and shifts all right-side cells one spot left.
     */
    private static void deleteAndShiftColumn(Sheet sheet, int targetCol, int maxColumnIdx) {
        for (int r = sheet.getFirstRowNum(); r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;

            // Remove the cell at the targeted blank column
            Cell targetCell = row.getCell(targetCol);
            if (targetCell != null) {
                row.removeCell(targetCell);
            }

            // Shift all subsequent cells in this row to the left
            for (int c = targetCol + 1; c < maxColumnIdx; c++) {
                Cell nextCell = row.getCell(c);
                if (nextCell != null) {
                    // Move cell over by cloning/re-creating it at index c-1
                    Cell movedCell = row.createCell(c - 1, nextCell.getCellType());
                    cloneCellProperties(nextCell, movedCell);
                    row.removeCell(nextCell);
                }
            }
        }
    }

    /**
     * Helper to clone data types and formulas when shifting a cell left.
     */
    private static void cloneCellProperties(Cell source, Cell destination) {
        destination.setCellStyle(source.getCellStyle());
        switch (source.getCellType()) {
            case BLANK -> {}
            case BOOLEAN -> destination.setCellValue(source.getBooleanCellValue());
            case FORMULA -> destination.setCellFormula(source.getCellFormula());
            case NUMERIC -> destination.setCellValue(source.getNumericCellValue());
            case STRING -> destination.setCellValue(source.getRichStringCellValue());
        }
    }
}