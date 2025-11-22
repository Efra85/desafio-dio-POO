package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.xml.transform.stream.StreamSource;
import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargahoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);**/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootvamp Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-");

        Dev devSuza = new Dev();
        devSuza.setNome("Suza");
        devSuza.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devSuza.getConteudosInscritos());
        devSuza.progredir();
        devSuza.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devSuza.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devSuza.getConteudosInscritos());
        System.out.println("XP:" + devSuza.calcularTotalXp());


    }
}
