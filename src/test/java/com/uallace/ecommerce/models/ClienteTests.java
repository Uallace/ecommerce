package com.uallace.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.uallace.ecommerce.models.Cliente;

@SpringBootTest
class ClienteTests {

	/**
	 * 
	 */
	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		cliente.setNome("Uallace");
		cliente.setEmail("uallace@mail.com");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua Japao");
		cliente.setBairro("Sao Jose");
		cliente.setCidade("Sao Paulo");
		cliente.setEstado("SP");
		cliente.setCep("09876-000");
		cliente.setComplemento("AP 1");

		assertEquals("Uallace", cliente.getNome());
		assertEquals("uallace@mail.com", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua Japao", cliente.getEndereco());
		assertEquals("Sao Jose", cliente.getBairro());
		assertEquals("Sao Paulo", cliente.getCidade());
		assertEquals("SP", cliente.getEstado());
		assertEquals("09876-000", cliente.getCep());
		assertEquals("AP 1", cliente.getComplemento());
	}

}
