package org.example;

public class AcertoDeContas extends Processo {

    private static AcertoDeContas acertoDeContas = new AcertoDeContas();

    private AcertoDeContas() {};

    public static AcertoDeContas getInstancia() {
        return acertoDeContas;
    }

}