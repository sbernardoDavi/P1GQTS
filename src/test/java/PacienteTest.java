import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarPacienteConstrutor(){
        Paciente paciente = new Paciente("Davi");
        assertEquals("Davi", paciente.getNome());

    }

    @Test
    void DeveRetornarPacienteCpf(){
        Paciente paciente = new Paciente("Davi");
        paciente.setCpf("12345");

        assertEquals("12345", paciente.getCpf());
    }

    @Test
    void DeveRetornarExceçãoPacienteCpf(){
        Paciente paciente= new Paciente("Davi");
        paciente.setCpf(null);

        assertEquals("Paciente sem cpf", paciente.getCpf());
    }

    @Test
    void deveConsultarConsulta(){
        Paciente paciente = new Paciente("Joao");
        Medico medico =new Medico("Jose");
        paciente.setCpf("123");
        Consulta consulta = new Consulta(medico, paciente);

        paciente.setConsulta(consulta);

        assertEquals(1,paciente.getNumeroConsultas());


    }

}