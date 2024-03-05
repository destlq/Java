import java.util.*;
// ***Classe Reserva*** 
public class Reserva {
  private int propriedadeReservada;
  private String usuarioReserva;
  private int checkin;
  private int checkout;
  private double custoTotal;
// ***Construtores***
  public Reserva(int propriedadeReservada, String usuarioReserva, int checkin, int checkout, double custoTotal) {
    this.propriedadeReservada = propriedadeReservada;
    this.usuarioReserva = usuarioReserva;
    this.checkin = checkin;
    this.checkout = checkout;
    this.custoTotal = custoTotal;
  }

  public Reserva(int propriedadeReservada, String usuarioReserva, int checkin, int checkout) {
    this.propriedadeReservada = propriedadeReservada;
    this.usuarioReserva = usuarioReserva;
    this.checkin = checkin;
    this.checkout = checkout;
  }

  Reserva[] reservaArray = new Reserva[5];

  Reserva() {
    propriedadeReservada = 0;
    usuarioReserva = " ";
    checkin = 0;
    checkout = 0;
    custoTotal = 0.0;
  }
/// ***Função***
  public static Reserva reservarLocal() {
    Scanner in = new Scanner(System.in);
    System.out.println("Qual propriedade deseja reservar:?");
    int propriedadeReservada = in.nextInt();

    System.out.println("usuarioReserva");
    String usuarioReserva = in.nextLine();

    System.out.println("checkin");
    int checkin = in.nextInt();

    System.out.println("checkout");
    int checkout = in.nextInt();

    System.out.println("custoTotal");
    double custoTotal = in.nextDouble();

    in.close();

    return new Reserva(propriedadeReservada, usuarioReserva, checkin, checkout, custoTotal);

  }
// ***Getters & Setters***
  public int getPropriedadeR() {
    return propriedadeReservada;
  }

  public void setPropriedadeR(int propriedadeReservada) {
    this.propriedadeReservada = propriedadeReservada;
  }

  public String getUsuarioR() {
    return usuarioReserva;
  }

  public void setUsuarioR(String usuarioReserva) {
    this.usuarioReserva = usuarioReserva;
  }

  public int getCheckIn() {
    return checkin;
  }

  public void setCheckIn(int checkin) {
    this.checkin = checkin;
  }

  public int getCheckOut() {
    return checkout;
  }

  public void setCheckOut(int checkout) {
    this.checkout = checkout;
  }

  public Double getCustoTotal() {
    return custoTotal;
  }

  public void setCustoTotal(double custoTotal) {
    this.custoTotal = custoTotal;
  }
}
