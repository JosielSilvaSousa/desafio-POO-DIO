import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria curso java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJosiel = new Dev();
        devJosiel.setNome("Josiel");
        devJosiel.inscreverBootCamp(bootcamp);
        System.out.println("Conteudo Inscritos"+ devJosiel.getConteudosInscritos());

        devJosiel.progredir();
        devJosiel.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos"+ devJosiel.getConteudosInscritos());
        System.out.println("Conteudo Concluidos"+ devJosiel.getConteudosConcluidos());
        System.out.println("XP: "+devJosiel.calcularXP());

        System.out.println("-------");

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootCamp(bootcamp);
        System.out.println("Conteudo Inscritos"+ devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();

        System.out.println("-");
        System.out.println("Conteudo Inscritos"+ devVictor.getConteudosInscritos());
        System.out.println("Conteudo Concluidos"+ devVictor.getConteudosConcluidos());
        System.out.println("XP: "+devVictor.calcularXP());


    }
}