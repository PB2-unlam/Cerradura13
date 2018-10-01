package ar.edu.unlam.pb2.Cerradura13Test;


import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.Cerradura13.Cerradura13;

public class Cerradura13Test {

	@Test
	public void testquelacerraduraempiezacerrada() {
		Cerradura13 cerraduraCerrada = new Cerradura13(123, 2);
		Boolean cerrada = cerraduraCerrada.estaCerrada();
		Assert.assertTrue(cerrada);
		}
	
	@Test
	public void testquelacerraduraseabreconlapasscorrecta() {
		Cerradura13 cerraduraAbierta = new Cerradura13(123, 2);
		Boolean abierta = cerraduraAbierta.abrir(123);
		Assert.assertTrue(abierta);
	}
	
	@Test
	public void testquealponermallapass3vecessebloquea() {
		Cerradura13 cerraduraBloqueada = new Cerradura13(123, 3);
		cerraduraBloqueada.abrir(12);
		cerraduraBloqueada.abrir(12);
		cerraduraBloqueada.abrir(12);
		Boolean bloqueada = cerraduraBloqueada.seBloqueo();
		Assert.assertTrue(bloqueada);
	}

	
}
