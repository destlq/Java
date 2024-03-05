import java.util.*;
// ***Classe Avaliação***
public class Avaliacao extends Reserva {
  public String propriedadeAvaliada;
  public String autor;
  public int nota;
  public String comentario;
// ***Construtores***
  public Avaliacao(String propriedadeAvaliada, String autor, int nota, String comentario) {
    this.propriedadeAvaliada = propriedadeAvaliada;
    this.autor = autor;
    this.nota = nota;
    this.comentario = comentario;
  }

  Avaliacao() {
    propriedadeAvaliada = "";
    autor = "";
    nota = 0;
    comentario = "";

  }
// ***Função***
  public Avaliacao avaliarEstadia() {
    Scanner in = new Scanner(System.in);
    System.out.println("Qual propriedade deseja avaliar?");
    String propriedadeAvaliada = in.nextLine();
    int nota;
    int valida = 0;
    do {
      System.out.print("De uma nota de 1 a 5 para essa propriedade: ");
      nota = in.nextInt();
      if (nota >= 1 && nota <= 5) {
        System.out.println("Feedback recebido!!!");
        valida = 1;

      } else {
        System.out.println("Avaliação inválida");

      }
    } while (valida != 1);

    in.nextLine();
    System.out.println("Digite seu comentário:");
    String comentario = in.nextLine();

    return new Avaliacao(propriedadeAvaliada, autor, nota, comentario);
    //in.close(); faz com que o codigo nao funcione de maneira apropriada

  }

// ***Getters & Setters***
  public String getPropriedadeAvaliada() {
    return propriedadeAvaliada;
  }

  public void setPropriedadeAvaliada(String propriedadeAvaliada) {
    this.propriedadeAvaliada = propriedadeAvaliada;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

}
