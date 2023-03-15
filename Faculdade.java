public class Faculdade {
      String nomeFaculdade;
      String unidadeFaculdade;
      String cidadeFaculdade;
      String bairroFaculdade;
      String ruaFaculdade;
      boolean matriculasAbertas;

      void matriculasFaculdade(boolean matriculasAbertas) {
            if (matriculasAbertas) {
                  System.out.println("As matriculas estao abertas!!");
            } else {
                  System.out.println("Acabou o prazo para as matriculas");
            }
      }

}
