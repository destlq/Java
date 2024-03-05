import java.util.*;
// ***Classe Propriedade***
public class Propriedade {

    private String titulo;
    private String descricao;
    private String localizacao;
    private int capacidade;
    private double preco;
    private String foto;
    private String proprietario;
    private String avaliacao;
// ***Construtores***
    public Propriedade(String titulo, String descricao, String localizacao, int capacidade, double preco, String foto,
            String proprietario, String avaliacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.preco = preco;
        this.foto = foto;
        this.proprietario = proprietario;
        this.avaliacao = avaliacao;
    }

    Propriedade() {
        titulo = "";
        descricao = "";
        localizacao = "";
        capacidade = 0;
        preco = 0.0;
        foto = "";
        proprietario = "";
        avaliacao = "";
    }
// ***Função***
    public static Propriedade cadastrarPropriedade() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o título: ");
        String titulo = in.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = in.nextLine();

        System.out.println("Digite a localização: ");
        String localizacao = in.nextLine();

        System.out.println("Digite a capacidade: ");
        int capacidade = in.nextInt();

        System.out.println("Digite o preço: ");
        double preco = in.nextDouble();

        System.out.println("Digite a foto: ");
        String foto = in.nextLine();

        System.out.println("Digite o proprietário: ");
        String proprietario = in.nextLine();

        System.out.println("Digite a avaliação: ");
        String avaliacao = in.nextLine();
        in.close();
        return new Propriedade(titulo, descricao, localizacao, capacidade, preco, foto, proprietario, avaliacao);
    }
// ***Getters & Setters***
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}