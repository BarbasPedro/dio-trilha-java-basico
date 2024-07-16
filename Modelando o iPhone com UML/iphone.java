// Interface para Reprodutor Musical
public interface ReprodutorMusical {
  void play();
  void pause();
  void stop();
}

// Interface para Aparelho Telefônico
public interface AparelhoTelefonico {
  void fazerChamada(String numero);
  void receberChamada(String numero);
}

// Interface para Navegador na Internet
public interface NavegadorInternet {
  void abrirURL(String url);
  void fecharURL();
}

// Classe que implementa as interfaces para um iPhone
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void play() {
      // Implementação
  }

  @Override
  public void pause() {
      // Implementação
  }

  @Override
  public void stop() {
      // Implementação
  }

  @Override
  public void fazerChamada(String numero) {
      // Implementação
  }

  @Override
  public void receberChamada(String numero) {
      // Implementação
  }

  @Override
  public void abrirURL(String url) {
      // Implementação
  }

  @Override
  public void fecharURL() {
      // Implementação
  }
}
