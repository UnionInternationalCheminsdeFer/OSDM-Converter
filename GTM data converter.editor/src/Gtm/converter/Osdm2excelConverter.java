package Gtm.converter;

import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.util.RouteDescriptionBuilder;

public class Osdm2excelConverter {
	
	GTMTool tool = null;

	public Osdm2excelConverter(GTMTool tool) {
		this.tool = tool;
	}

	public Workbook convert(IProgressMonitor monitor) {
		
		Workbook workbook = new XSSFWorkbook();
		
				
		Sheet sheet = workbook.createSheet("Fares " + tool.getGeneralTariffModel().getDelivery().getProvider().getName());
		sheet.setColumnWidth(0, 6000);
		sheet.setColumnWidth(1, 4000);

		Row header = sheet.createRow(0);

		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headerStyle.setWrapText(true);
		

		XSSFFont font = ((XSSFWorkbook) workbook).createFont();
		font.setFontName("Arial");
		font.setFontHeightInPoints((short) 16);
		font.setBold(true);
		headerStyle.setFont(font);

		Cell headerCell = header.createCell(0);
		headerCell.setCellValue("Carrier");
		headerCell.setCellStyle(headerStyle);

		headerCell = header.createCell(1);
		headerCell.setCellValue("Series");
		headerCell.setCellStyle(headerStyle);	

		headerCell = header.createCell(2);
		headerCell.setCellValue("from UIC");
		headerCell.setCellStyle(headerStyle);	
		
		headerCell = header.createCell(3);
		headerCell.setCellValue("from Station");
		headerCell.setCellStyle(headerStyle);	
		
		headerCell = header.createCell(4);
		headerCell.setCellValue("to UIC");
		headerCell.setCellStyle(headerStyle);	
		
		headerCell = header.createCell(5);
		headerCell.setCellValue("to Station");
		headerCell.setCellStyle(headerStyle);	
		
		headerCell = header.createCell(6);
		headerCell.setCellValue("via");
		headerCell.setCellStyle(headerStyle);			
		
		headerCell = header.createCell(7);
		headerCell.setCellValue("km");
		headerCell.setCellStyle(headerStyle);				
		
		//ExcelFareTypes fareTypes = new ExcelFareTypes(tool);

		monitor.subTask("Building columns");	
		ExcelFareTypes fareTypes = new ExcelFareTypes(tool.getGeneralTariffModel());
		
		
		
		int i = 0;
		for (String faretype : fareTypes.getColumnNames()) {
			i++;
			headerCell = header.createCell(7 + i);
			headerCell.setCellValue(faretype);
			headerCell.setCellStyle(headerStyle);				
			
		}

		
		CellStyle style = workbook.createCellStyle();
		style.setWrapText(true);
		
		monitor.subTask("Setting Routes");	

		int iRow = 0;
		
		for (RegionalConstraint rc : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()){

			iRow++;			
			Row row = sheet.createRow(iRow);
			
			//carrier
			Cell cell = row.createCell(0);
			cell.setCellValue(getCarriers(rc));
			cell.setCellStyle(style);			
			
			int seriesId = 0;
			cell = row.createCell(1);			
			try {
				seriesId = rc.getLinkedFares().getFirst().getLegacyAccountingIdentifier().getSeriesId();
				cell.setCellValue(seriesId);
				cell.setCellStyle(style);	
			} catch (Exception e) {
				cell.setCellValue("no series");
				cell.setCellStyle(style);	
			}

			String firstStationCode = RouteDescriptionBuilder.getFullFirstStationCode(rc.getRegionalValidity());
			cell = row.createCell(2);
			cell.setCellValue(firstStationCode);
			cell.setCellStyle(style);	
			
			String firstStationName = RouteDescriptionBuilder.getFirstStationCodeName(RouteDescriptionBuilder.getMainVia(rc.getRegionalValidity()));
			cell = row.createCell(3);
			cell.setCellValue(firstStationName);
			cell.setCellStyle(style);	
			
			String lastStationCode = RouteDescriptionBuilder.getFullLastStationCode(rc.getRegionalValidity());
			cell = row.createCell(4);
			cell.setCellValue(lastStationCode);
			cell.setCellStyle(style);		

			String lastStationName = RouteDescriptionBuilder.getLastStationCodeName(RouteDescriptionBuilder.getMainVia(rc.getRegionalValidity()));
			cell = row.createCell(5);
			cell.setCellValue(lastStationName);
			cell.setCellStyle(style);	

			
			//via
			String routeDescription = RouteDescriptionBuilder.getRouteDescription(rc);
			cell = row.createCell(6);
			cell.setCellValue(routeDescription);
			cell.setCellStyle(style);
						
			
			cell = row.createCell(7);
			cell.setCellValue(rc.getDistance());
			cell.setCellStyle(style);
			
			monitor.subTask("Setting Prices");	

			for (FareElement fare : rc.getLinkedFares()) {
				
				int tariffColumn = fareTypes.getColumn(fare);
				
				//price
				cell = row.createCell(8 + tariffColumn);
				cell.setCellValue(getPrice(fare.getPrice()));
				cell.setCellStyle(style);
				
			}

			
		}
		
		//ExcelColumnUtils.deleteEmptyColumns(workbook.getSheetAt(0));
		
		
		
		workbook.getSheetAt(0).autoSizeColumn(3);
		workbook.getSheetAt(0).autoSizeColumn(5);
		workbook.getSheetAt(0).autoSizeColumn(6);
		
		return workbook;
	}

	private String getCarriers(RegionalConstraint rc) {
		
		CarrierConstraint cc = null;
		
		try {
			cc = rc.getRegionalValidity().getFirst().getCarrierConstraint();
			if (cc == null) {
				cc = rc.getRegionalValidity().getFirst().getViaStation().getCarrierConstraint();
			}
		} catch (Exception e) {
			return "carrier not found";
		}
		if (cc == null)	return "carrier not found";
		
		StringBuilder sb = new StringBuilder();
		

		if (cc.getIncludedCarriers() != null && !cc.getIncludedCarriers().isEmpty()) {
			
			boolean isFirst = true;
			for (Carrier c : cc.getIncludedCarriers()) {
				if (!isFirst) {
					sb.append(",");
				} else {
					isFirst = false;
				}
				sb.append(c.getCode());
			}

		}
		
		if (cc.getIncludedCarrierGroup() != null && cc.getIncludedCarrierGroup().getCompanies() != null){

			boolean isFirst = true;
			for (Carrier c : cc.getIncludedCarrierGroup().getCompanies()) {
				if (!isFirst) {
					sb.append(",");
				} else {
					isFirst = false;
				}
				sb.append(c.getCode());
			}

		}		
		
		return sb.toString();
	}

	private String getPrice(Price price) {
		StringBuilder sb = new StringBuilder();
		
		try {
			sb.append(price.getCurrencies().getFirst().getAmount()).append(" ").append(price.getCurrencies().getFirst().getCurrency().getIsoCode());
		} catch (Exception e){
			//
		}
		return sb.toString();
	}

}
