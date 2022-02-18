package Gtm.converter;

import java.util.Date;


public class DateRange {

	
	Date startDate = null;
	Date endDate = null;	
	
	
	public DateRange  (Date start, Date end){
		startDate = start;
		endDate = end;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	

	
}
