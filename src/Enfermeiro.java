public class Enfermeiro extends Usuario {
    private String coren;

    public Enfermeiro(String id, String nome, int senha, String coren) {
        super(id, nome, senha);
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
}
