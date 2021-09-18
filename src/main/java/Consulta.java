public class Consulta {
    public String idn;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Medico medico, Paciente paciente) {
        if (medico == null) {
            throw new NullPointerException("Médico é obrigatorio");
        } else {
            if (paciente == null) {
                throw new NullPointerException("Paciente é obrigatorio");
            }
        }
        this.medico = medico;
        this.paciente = paciente;
    }


    public String getIdn() {
        return idn;
    }

    public void setidn(String idn) {
        this.idn = idn;
    }
}

