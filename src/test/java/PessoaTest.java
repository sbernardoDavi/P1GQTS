import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoaConstrutor(){
        Pessoa pessoa = new Pessoa("Davi");
        assertEquals("Davi",pessoa.getNome());
    }

    @Test
    void DeveRetornarExceçaoNomePessoaConstrutorNulo(){
        try {
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch(NullPointerException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }


    @Test
    void DeveRetornarExceçaoNomePessoaNulo(){
        try {
            Pessoa pessoa = new Pessoa("Davi");
            pessoa.setNome(null);
            fail();
        }
        catch(NullPointerException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomePessoaSet(){
        Pessoa pessoa = new Pessoa("Davi");
        pessoa.setNome("Joao");

        assertEquals("Joao", pessoa.getNome());
    }

    @Test
    void DeveRetornarExceçaoNomePessoaVazio(){
        try {
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch(NullPointerException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }

    @Test
    void DeveRetornarExceçãoSetNomePessoaVazio(){
        try {
            Pessoa pessoa = new Pessoa("Davi");
            pessoa.setNome(" ");
            fail();
        }
        catch(NullPointerException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }


}