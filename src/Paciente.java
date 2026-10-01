public class Paciente extends Usuario {
    private int cpf;

    public Paciente(String id, String nome, int senha, int cpf) {
        super(id, nome, senha);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
    

