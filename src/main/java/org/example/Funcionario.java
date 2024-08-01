package org.example;
import java.text.Normalizer;
public class Funcionario {

    public boolean desligar() {
        return FuncionarioFacade.verificarPendenciasDesligamento(this);
    }
}