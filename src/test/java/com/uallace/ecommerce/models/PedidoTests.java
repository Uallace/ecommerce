package com.uallace.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.uallace.ecommerce.models.Cliente;

@SpringBootTest
class PedidoTests {

	/**
	 * 
	 */
	@Test
	void validarPropriedadesCliente() {
		var pedido = new Pedido();
		pedido.setIdCliente(1);
		pedido.setValorTotal(50.00);
		pedido.setData("10-10-2022");
		

		assertEquals(1, pedido.getIdCliente());
		assertEquals(50.00, pedido.getValorTotal());
		assertEquals("10-10-2022", pedido.getData());
		
	}

}
