public public class Procedimento {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private Anestesista anestesista;
    private ResponsavelTecnico responsavelTecnico;
    private boolean liberado;

    public Procedimento(String id, Paciente paciente, Medico medico) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.liberado = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Anestesista getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(Anestesista anestesista) {
        this.anestesista = anestesista;
    }

    public ResponsavelTecnico getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(ResponsavelTecnico responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    public boolean isLiberado() {
        return liberado;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }
} 
    

