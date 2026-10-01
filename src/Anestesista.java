public class Anestesista extends Usuario {
    private String registro;

    public Anestesista(String id, String nome, int senha, String registro) {
        super(id, nome, senha);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
