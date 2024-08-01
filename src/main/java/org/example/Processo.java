package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Processo {

    private List<Funcionario> funcionariosComPendencia = new ArrayList<Funcionario>();

    public void addfuncionarioPendente(Funcionario funcionario) {
        this.funcionariosComPendencia.add(funcionario);
    }

    public boolean verificarFuncionarioComPendencia(Funcionario funcionario) {
        return this.funcionariosComPendencia.contains(funcionario);
    }

}