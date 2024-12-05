import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Um curso de Java");
        curso1.setDescricao("Um Curso de Java Basico");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Poo");
        curso2.setDescricao("Um Curso onde voce vai aprender o conceito de Poo");
        curso2.setCargaHoraria(4);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Ensina os fundamentos da linguagem Java, como sintaxe e controle de fluxo.");
        mentoria.setData(LocalDate.now());
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Primeiro Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe Martins");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Meus Conteúdos Inscritos: " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("------ Algum Tempo depois ------");
        System.out.println("Meus Conteúdos Inscritos: " + devFelipe.getConteudosInscritos());
        System.out.println("Meus Conteúdos Concluídos: " + devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());
    }
}
