package bcccp.tickets.season;

import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

public class SeasonTicketDAO implements ISeasonTicketDAO {

	private IUsageRecordFactory factory;

	
	
	public SeasonTicketDAO(IUsageRecordFactory factory) {
		//TOD Implement constructor
	}



	@Override
	public void registerTicket(ISeasonTicket ticket) {
		
		SeasonTicket seasonTick = new SeasonTicket();
		seasonTick.setTicketId(ticket.getId());
		seasonTick.setCarparkId(ticket.getCarparkId());
		seasonTick.setStartValidPeriod(ticket.getStartValidPeriod());
		
	}


	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		SeasonTicket seasonTick = new SeasonTicket();
		seasonTick.setTicketId(ticket.getId());
		seasonTick.setCarparkId(ticket.getCarparkId());
		seasonTick.setStartValidPeriod(ticket.getStartValidPeriod());
		seasonTick.setEndValidPeriod(ticket.getEndValidPeriod());
		
	}



	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ISeasonTicket findTicketById(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void recordTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void recordTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
