package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int numAsientos = 0;
		for (int i=0 ; asientos.length>i;i++) {
			if (asientos[i] != null) {
				numAsientos+=1;
			}
		}
		return numAsientos;
	}
	String verificarIntegridad() {
		if (motor.registro == registro) {
			for (int i=0;i < asientos.length;i++) {
				if (asientos[i]!= null) {
					if (asientos[i].registro != motor.registro) {
						return "Las piezas no son originales";
					}
				}
			} return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}
}
