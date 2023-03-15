public class ProgramaAluno {
      public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.nome = "Sheylla";
            aluno.sobrenome = "Meazza";
            aluno.idade = 23;
            aluno.cpf = "111.111.111-11";
            aluno.cursoAluno = "Analise e desenvolvimento de Sistemas";
            aluno.codigoAluno = 55;
            aluno.codigoCurso = 3;

            aluno.curso.nomeCurso = "Analise e Desenvolvimento de Sistemas";
            aluno.curso.sobreCurso = "Curso sobre desenvolvimento de Sistemas";
            aluno.curso.nomeDaFaculdade = "Fasipe";
            aluno.curso.nomeCoordenadorCurso = "Jean Carlos";
            aluno.curso.codigoCurso = 3;

            aluno.faculdade.nomeFaculdade = "Fasipe";
            aluno.faculdade.unidadeFaculdade = "Florenca";
            aluno.faculdade.cidadeFaculdade = "Sinop - MT";
            aluno.faculdade.bairroFaculdade = "Florença";
            aluno.faculdade.ruaFaculdade = "Rua dos Cedros";

            System.out.println("\n----------------Dados Alunos-----------------\n");
            System.out.println("Nome do Aluno: " + aluno.nome);
            System.out.println("Sobrenome do Aluno: " + aluno.sobrenome);
            System.out.println("Idade do Aluno: " + aluno.idade);
            System.out.println("CPF do Aluno: " + aluno.cpf);
            System.out.println("Curso do Aluno: " + aluno.cursoAluno);
            System.out.println("Codigo do curso do Aluno: " + aluno.codigoCurso);
            System.out.println("Codigo do Aluno: " + aluno.codigoAluno);

            System.out.println("\n-------------Informacoes sobre o Curso-------------\n");
            System.out.println("Nome do Curso: " + aluno.curso.nomeCurso);
            System.out.println("Sobre o Curso: " + aluno.curso.sobreCurso);
            System.out.println("Faculdade em que o curso esta disponivel: " + aluno.curso.nomeDaFaculdade);
            System.out.println("Nome do coordenador do Curso: " + aluno.curso.nomeCoordenadorCurso);
            System.out.println("Codigo do Curso: " + aluno.curso.codigoCurso);

            System.out.println("\n-------------Informaces sobre a Faculdade-------------\n");
            System.out.println("Nome da faculdade: " + aluno.faculdade.nomeFaculdade);
            System.out.println("Cidade onde a faculdade se encontra: " + aluno.faculdade.cidadeFaculdade);
            System.out.println("Bairro em que a faculdade esta: " + aluno.faculdade.bairroFaculdade);
            System.out.println("Rua da faculdade: " + aluno.faculdade.ruaFaculdade);
            System.out.println("Unidade da faculdade: " + aluno.faculdade.unidadeFaculdade);

            System.out.println("\n---------------------------Metodos----------------------");
            System.out.println("---------------Estado das matriculas para a Faculdade---------------\n");
            aluno.faculdade.matriculasFaculdade(false);

            System.out.println("\n---------------Alterar coordenador do curso---------------\n");
            System.out.println("Coordenador do curso: " + aluno.curso.nomeCoordenadorCurso);
            aluno.curso.alterarCoordenadorCurso("Matheus Andrade");
            System.out.println("Novo coordenador do curso: " + aluno.curso.nomeCoordenadorCurso);

      }
}