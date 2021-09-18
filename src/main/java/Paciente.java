import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Paciente extends Pessoa {
    public String cpf;
    private Consulta consulta;
    private List<Consulta> consultas;


    public Paciente(String nome) {
        super(nome);
    }


    public Consulta getConsulta(){
        return consulta;
    }

    public void setConsulta(Consulta consulta){
        this.consulta = consulta;

    }

    public int getNumeroConsultas(){
        return this.consultas.size();
    }

    public void Consultar(Consulta consulta){
        this.consultas.add(consulta);

    }

    public void DesmarcarConsulta(Consulta  consulta){
        this.consultas.remove(consulta);

    }

    public boolean verificarConsulta(Consulta consulta) {
        return this.consultas.contains(consulta);
    }



    public List getHistoricoConsultas(){
        if(this.consultas.size() == 0 ){
            throw new NullPointerException("Paciente sem consultas.");
        }
        List<String> idn = new ArrayList<String>();
        for (Consulta consulta : this.consultas) {
            idn.add(consulta.getIdn());
        }
        return idn;
    }

    public String getCpf() {
        if (this.cpf==null){
            return "Paciente sem cpf";
        }
        else {
            return cpf;
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

