public class Agendamento {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String horario;

    public Agendamento(String id, Paciente paciente, Medico medico, String data, String horario) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}