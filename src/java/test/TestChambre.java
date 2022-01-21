package test;

import java.util.Iterator;

import entities.Chambre;
import entities.Reservation;
import entities.User;
import java.time.Clock;
import services.ChambreServices;
import services.ReservationServices;
import services.UserServices;

public class TestChambre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChambreServices cs = new ChambreServices(); 
		UserServices us = new UserServices();
                System.out.println(us.findById(1).toString());
                ReservationServices rs = new ReservationServices();
                
		for(Reservation a : rs.findAll())
		System.out.println(a.toString());
                

	}

}
