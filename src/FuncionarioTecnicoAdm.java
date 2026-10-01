public class FuncionarioTecnicoAdm extends Usuario {
    private String cargo;

    public FuncionarioTecnicoAdm(String id, String nome, int senha , String cargo) {
        super(id, nome, senha);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
