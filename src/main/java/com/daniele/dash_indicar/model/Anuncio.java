package com.daniele.dash_indicar.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Anuncio {
    private String modelo;
    private String cor;
    private int ano;
    private String cambio;
    private String combustivel;
}
