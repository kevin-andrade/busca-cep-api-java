package br.com.buscacep;

public record Address(String cep, String logradouro, String bairro,
                      String localidade, String uf, String ddd) {
}
