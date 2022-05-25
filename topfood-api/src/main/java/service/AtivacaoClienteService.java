package service;

import org.springframework.stereotype.Component;

import modelo.Cliente;

import notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	private NotificadorEmail notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService " + notificador);
	}

	public void Ativar(Cliente cliente) {
		cliente.Ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema est� ativo!");
	}

}
