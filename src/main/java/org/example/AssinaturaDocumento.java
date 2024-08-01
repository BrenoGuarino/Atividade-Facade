package org.example;

public class AssinaturaDocumento extends Processo {

    private static AssinaturaDocumento assinaturaDocumento = new AssinaturaDocumento();

    private AssinaturaDocumento() {};

    public static AssinaturaDocumento getInstancia() {
        return assinaturaDocumento;
    }
}