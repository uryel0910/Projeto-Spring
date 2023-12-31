package com.projeto.spring.pessoa.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum TipoPessoa {

    F("F", "Fisica"),
    J("J" ,"Juridica");

    private final String valor;
    private final String descricao;

}
