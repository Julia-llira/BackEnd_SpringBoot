package br.com.start.model.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.start.model.Banco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ClienteSaidaDto {
	private Long id;
	private String nome;
	private String cpf;

	private String numeroConta;

	private Banco banco;

	
	

}
