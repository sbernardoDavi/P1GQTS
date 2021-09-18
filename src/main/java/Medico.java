public class Medico extends Pessoa {
    public String crm;

    public Medico(String nome){
        super(nome);
    }


    public String getCrm() {
        if (this.crm==null){
            return "Crm obrigatório";
        }
        else {
            return crm;
        }
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
