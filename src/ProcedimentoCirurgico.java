public class ProcedimentoCirurgico extends Procedimento {
    private boolean liberacaoMedica;

    public ProcedimentoCirurgico(String id, Paciente paciente, Medico medico) {
        super(id, paciente, medico);
        this.liberacaoMedica = false;
    }

    public boolean isLiberacaoMedica() {
        return liberacaoMedica;
    }

    public void setLiberacaoMedica(boolean liberacaoMedica) {
        this.liberacaoMedica = liberacaoMedica;
    }

    public void liberarPaciente() {
        this.liberacaoMedica = true;
    }
}