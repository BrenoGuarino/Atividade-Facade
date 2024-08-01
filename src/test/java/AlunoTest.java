
import org.example.AcertoDeContas;
import org.example.AssinaturaDocumento;
import org.example.DevolucaoEquipamento;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarAcertoDeContasPendenteDesligamento() {
        Funcionario funcionario = new Funcionario();
        AcertoDeContas.getInstancia().addfuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarAssinaturaDocumentoPendenteDesligamento() {
        Funcionario funcionario = new Funcionario();
        AssinaturaDocumento.getInstancia().addfuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarDevolucaoEquipamentoPendenteDesligamento() {
        Funcionario funcionario = new Funcionario();
        DevolucaoEquipamento.getInstancia().addfuncionarioPendente(funcionario);

        assertEquals(false, funcionario.desligar());
    }

    @Test
    void deveRetornarFuncionarioSemPendenciaDesligamento() {
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.desligar());
    }

}