public class Medico extends Usuario {
        private String especialidade;
        
        public Medico(String id, String nome, int senha, String especialidade) {
        super(id, nome, senha);

        this.especialidade = especialidade;
    } 
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
