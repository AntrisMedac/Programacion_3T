package Parking;

import java.util.ArrayList;
import java.util.List;

import Hanoi.Disco;

public class Parking {

	private ArrayList<Plaza> parking;
	
	public Parking(int plazas) {
		this.parking = new ArrayList<>();
		for (int i=0;i<plazas;i++) {
			parking.add(new Plaza(i));
		}
	}

	public void agregarPlazas(int cantidad) {
		int ultima=parking.size()-1;
		
		for (int i=1;i<=cantidad;i++) {
			this.parking.add(new Plaza(i+ultima));
		}
		
	}
	
	public boolean estacionarVehiculo(Vehiculo vehiculo) {
		for (int i=0;i<parking.size();i++) {
			if(parking.get(i).getOcupada()==false) {
				parking.get(i).ocuparPlaza(vehiculo);
				return true;
			}
		}
		return false;
	}
	
	public boolean retirarVehiculo(String matricula) {
		for (int i=0;i<parking.size();i++) {
			if(parking.get(i).getOcupada()==true && parking.get(i).getVehiculo().getMatricula().equals(matricula)) {
				parking.get(i).liberarPlaza();
				return true;
			}
		}
		return false;
	}
	
	public void imprimirEstado() {
		System.out.println(parking);
	}

	@Override
	public String toString() {
		return "Parking " + parking;
	}
	
}
