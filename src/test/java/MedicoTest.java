import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveRetornarMedicoConstrutor(){
        Medico medico = new Medico("Marco");

        assertEquals("Marco", medico.getNome());
    }

    @Test
    void DeveRetornarExceçãoCrm(){
        Medico medico = new Medico("Marco");
        medico.setCrm(null);

        assertEquals("Crm obrigatório", medico.getCrm());
    }

    @Test
    void deveRetornarMedicoCrm(){
        Medico medico = new Medico("Marco");
        medico.setCrm("123");

        assertEquals("123", medico.getCrm());
    }


}