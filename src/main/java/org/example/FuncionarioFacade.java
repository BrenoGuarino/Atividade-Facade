package org.example;

public class FuncionarioFacade {

    public static boolean verificarPendenciasDesligamento(Funcionario funcionario) {
        if (DevolucaoEquipamento.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        if (AssinaturaDocumento.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        if (AcertoDeContas.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        return true;
    }
}