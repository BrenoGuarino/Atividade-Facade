package org.example;

public class DevolucaoEquipamento extends Processo {

    private static DevolucaoEquipamento devolucaoEquipamento = new DevolucaoEquipamento();

    private DevolucaoEquipamento() {};

    public static DevolucaoEquipamento getInstancia() {
        return devolucaoEquipamento;
    }
}