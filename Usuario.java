import java.util.*;
// ***Classe Usuário***
public class Usuario {
  private String nome;
  private String email;
  private String senha;
  private String listaPropriedades;
  private int reservas;
  private String avaliacoes;
// Construtores
  public Usuario(String nome, String email, String senha) { /* usuario */
    this.nome = nome;
    this.email = email;
    this.senha = senha;
  }

  public Usuario(String nome, String email, String senha, String listaPropriedades, String avaliacoes) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.listaPropriedades = listaPropriedades;
    this.avaliacoes = avaliacoes;
  }

  public Usuario(String nome, String email, String senha, String listaPropriedades) {/* proprietario */
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.listaPropriedades = listaPropriedades;
  }

  public Usuario(String nome, String email, String senha, String listaPropriedades, int reservas,
      String avaliacoes) {/* proprietario */
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.listaPropriedades = listaPropriedades;
    this.reservas = reservas;
    this.avaliacoes = avaliacoes;
  }

  Usuario[] usuarioArray = new Usuario[5];

  Usuario() {
    nome = "";
    email = "";
    senha = "";
    listaPropriedades = "";
    reservas = 0;
    avaliacoes = "";
  }
// ***Função***
  public static Usuario cadastrarProprietario() {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o nome: ");
    String nome = in.nextLine();

    System.out.println("Digite o email: ");
    String email = in.nextLine();

    System.out.println("Digite a senha: ");
    String senha = in.nextLine();

    System.out.println("Digite suas propriedades: ");
    String listaPropriedades = in.nextLine();

    System.out.println("Digite suas avaliacoes: ");
    String avaliacoes = in.nextLine();

    in.close();

    return new Usuario(nome, email, senha, listaPropriedades, avaliacoes);

  }

  public static Usuario cadastrarUsuario() {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o nome: ");
    String nome = in.nextLine();

    System.out.println("Digite o email: ");
    String email = in.nextLine();

    System.out.println("Digite a senha: ");
    String senha = in.nextLine();

    in.close();
    return new Usuario(nome, email, senha);

  }
// ***Getters & Setters***
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getListaPropriedades() {
    return listaPropriedades;
  }

  public void setListaPropriedades(String listaPropriedades) {
    this.listaPropriedades = listaPropriedades;
  }

  public String getAvaliacoes() {
    return avaliacoes;
  }

  public void setAvaliacoes(String avaliacoes) {
    this.avaliacoes = avaliacoes;
  }

  public int getReservas() {
    return reservas;
  }

  public void setReservas(int reservas) {
    this.reservas = reservas;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
