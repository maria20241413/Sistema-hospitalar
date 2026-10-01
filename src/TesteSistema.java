public class TesteSistema {

    public static void main(String[] args) {

        Medico m1 = new Medico("01", "Carlos", 2222, "Cardiologia");

        System.out.println(m1.getId());
        System.out.println(m1.getNome());
        System.out.println(m1.getEspecialidade());

        boolean autenticou = m1.autentica(2222);

        System.out.println(autenticou);


        Paciente p1 = new Paciente("02", "Maria", 3333, "123456789");

        System.out.println(p1.getId());
        System.out.println(p1.getNome());
        System.out.println(p1.getCpf());

        boolean autenticouPaciente = p1.autentica(3333);

        System.out.println(autenticouPaciente);


        Enfermeiro e1 = new Enfermeiro("03", "João", 4444, "ENF123");

        System.out.println(e1.getId());
        System.out.println(e1.getNome());
        System.out.println(e1.getRegistro());


        Anestesista a1 = new Anestesista("04", "Pedro", 5555, "ANE123");

        System.out.println(a1.getId());
        System.out.println(a1.getNome());
        System.out.println(a1.getRegistro());


        FuncionarioTecnicoAdministrativo f1 =
                new FuncionarioTecnicoAdministrativo(
                        "05",
                        "Ana",
                        6666,
                        "Recepção"
                );

        System.out.println(f1.getId());
        System.out.println(f1.getNome());
        System.out.println(f1.getSetor());


        ResponsavelTecnico r1 =
                new ResponsavelTecnico(
                        "06",
                        "José",
                        7777,
                        "RT123"
                );

        System.out.println(r1.getId());
        System.out.println(r1.getNome());
        System.out.println(r1.getRegistro());
    }
}