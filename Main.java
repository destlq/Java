import java.util.*;
/*
 Diego Estevão - 32361262
 Gabriel Pastorelli - 32361513 
 Ricardo Ikeda - 32158378
 */

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        List<Propriedade> listPropriedades = new ArrayList<>();
        List<Usuario> listUsuario = new ArrayList<>();
        List<Reserva> listReserva = new ArrayList<>();
        List<Avaliacao> listAvaliacao = new ArrayList<>();

        Avaliacao novaAvaliacao1 = new Avaliacao("1", "1", 1, "1");// Para testes
        Avaliacao novaAvaliacao2 = new Avaliacao("2", "Olair", 2, "MUITO SUJO , MAS O QUINTAL É MUITO GRANDE .");
        Avaliacao novaAvaliacao3 = new Avaliacao("3", "Josemar", 3, "Otimo Espaço.");
        Avaliacao novaAvaliacao4 = new Avaliacao("4", "Elizeu", 1, "Muito sujo de resto muito bom.");
        Avaliacao novaAvaliacao5 = new Avaliacao("5", "Firmino", 5, "muito boa a localização, recomendo.");
        listAvaliacao.add(novaAvaliacao1);
        listAvaliacao.add(novaAvaliacao2);
        listAvaliacao.add(novaAvaliacao3);
        listAvaliacao.add(novaAvaliacao4);
        listAvaliacao.add(novaAvaliacao5);

        // Reserva/Usuario/checkin/checkout
        Reserva novaReserva1 = new Reserva(1, "1", 1, 3);// Dígito 1 para testes
        Reserva novaReserva2 = new Reserva(2, "Olair", 7, 15);
        Reserva novaReserva3 = new Reserva(3, "Josemar", 21, 4);
        Reserva novaReserva4 = new Reserva(4, "Elizeu", 10, 24);
        Reserva novaReserva5 = new Reserva(5, "Firmino", 3, 7);
        listReserva.add(novaReserva1);
        listReserva.add(novaReserva2);
        listReserva.add(novaReserva3);
        listReserva.add(novaReserva4);
        listReserva.add(novaReserva5);

        // nome/ email/ senha 
        Usuario novoUsuario1 = new Usuario("1", "1", "1");// Dígito 1 para testes
        Usuario novoUsuario2 = new Usuario("Olair", "olair24@gmail.com", "olair13");
        Usuario novoUsuario3 = new Usuario("Josemar", "jose22@gmail.com", "josemarez88");
        Usuario novoUsuario4 = new Usuario("Elizeu", "elizeudoMato@gmail.com", "elizeu1020");
        Usuario novoUsuario5 = new Usuario("Firmino", "firminoSanchez@gmail.com", "firmin0");
        Usuario novoUsuario6 = new Usuario("Cleber", "cleberJogaSujo@gmail.com", "Clebin");
        Usuario novoUsuario7 = new Usuario("Junior", "juninpicamole@gmail.com", "junior69");
        listUsuario.add(novoUsuario1);
        listUsuario.add(novoUsuario2);
        listUsuario.add(novoUsuario3);
        listUsuario.add(novoUsuario4);
        listUsuario.add(novoUsuario5);
        listUsuario.add(novoUsuario6);
        listUsuario.add(novoUsuario7);

        //IdPropriedade(Titulo) / Descrição / Localização(Bairro) /  Capacidade / Preço / Imagem / Nome proprietário / Avaliação da propriedade
        Propriedade novaPropriedade1 = new Propriedade("1", "Apartamento, Vista legal", "1", 3, 100.0, "paisagem.jpg",
        "1", "1 Estrela");// Dígito 1 para testes
        Propriedade novaPropriedade2 = new Propriedade("2", "Casa, Quintal espaçoso", "Higienópolis", 5, 120.0, "casa.jpg",
        "Pedro", "2 Estrelas");
        Propriedade novaPropriedade3 = new Propriedade("3", "Sobrado, Dois dormitórios", "Vila Madalena", 7, 170.0,
        "dormitorios.jpg", "Maria", "3 Estrelas");
        Propriedade novaPropriedade4 = new Propriedade("4", "Mansão, Salas especias e muitos dormitórios", "Itaim Bibi", 25,
        500.0, "salas.jpg", "Cleber", "4 Estrelas");
        Propriedade novaPropriedade5 = new Propriedade("5", "Casa de praia, Vista para a montanha", "Morumbi", 4, 250.0,
        "praia.jpg", "Junior", "5 Estrelas");
        listPropriedades.add(novaPropriedade1);
        listPropriedades.add(novaPropriedade2);
        listPropriedades.add(novaPropriedade3);
        listPropriedades.add(novaPropriedade4);
        listPropriedades.add(novaPropriedade5);
        // Início Login
        System.out.print("Como deseja logar? " + "\n" + "1)Proprietário" + "\n" + "2)Usuário" + "\n");
        System.out.print("Digite a opção desejada: ");
        int user = in.nextInt();
        System.out.print("Digite seu nome: ");
        in.nextLine();
        String nomeLogin = in.nextLine();
        System.out.println("");
        System.out.print("Digite sua senha: ");
        String senhaLogin = in.nextLine();

        //Validador de login
        Usuario loggedInUsuario = null;
        Usuario loggedInSenha = null;
        for (Usuario usuarioLogin : listUsuario) {
            if (usuarioLogin.getNome().equals(nomeLogin)) {
                loggedInUsuario = usuarioLogin;
                if (usuarioLogin.getSenha().equals(senhaLogin)) {
                    System.out.println("** ACESSO GARANTIDO **");
                    loggedInSenha = usuarioLogin;
                    break;
                } else {
                    break;
                }
            }
        }
        if (loggedInUsuario == null) {
            System.out.println("Email inválido!!!");
        } else if (loggedInSenha == null) {
            System.out.println("Senha inválida!!!");
        } else {

            if (user == 1) { /* Proprietário */

                do { //Loop do menu proprietário
                    System.out.println("************MackAirbnb ************");
                    System.out.println("1) Cadastrar uma nova propriedade");
                    System.out.println("2) Cadastrar um novo proprietário");
                    System.out.println("3) Mostrar detalhes de propriedades");
                    System.out.println("4) Sair");
                    System.out.print("Selecione uma opção: ");
                    i = in.nextInt();
                    if (i == 1) {
                        for (int x = 0; x < 1; x++) { //Cadastro de propriedade
                            in.nextLine();
                            Propriedade novaPropriedade = cadastrarPropriedade(in);
                            listPropriedades.add(novaPropriedade);
                        }
                        System.out.println("Propriedade cadastrada!!!");

                    } else if (i == 2) { //Cadastro de proprietário
                        for (int x = 0; x < 1; x++) {
                            in.nextLine();
                            Usuario novoUsuario = cadastrarUsuario(in);
                            listUsuario.add(novoUsuario);
                        }
                        System.out.println("Usuario cadastrado!!!");

                    } else if (i == 3) { //Detalhes da propriedade
                        String getTitulo = "";
                        boolean propriedadeEncontrada = false;
                        for (Propriedade propriedade : listPropriedades) { //Apresenta os detalhes da propriedade
                            if (propriedade.getProprietario().equals(nomeLogin)) {
                                Avaliacao avaliacao = new Avaliacao();
                                System.out.println("Título: " + propriedade.getTitulo());
                                System.out.println("Descrição: " + propriedade.getDescricao());
                                System.out.println("Localização: " + propriedade.getLocalizacao());
                                System.out.println("Capacidade: " + propriedade.getCapacidade());
                                System.out.println("Preço: " + propriedade.getPreco());
                                System.out.println("Foto: " + propriedade.getFoto());
                                System.out.println("Proprietário: " + propriedade.getProprietario());
                                System.out.println("Avaliação: " + propriedade.getAvaliacao());
                                System.out.print("------------------------");
                                System.out.println(avaliacao.getPropriedadeAvaliada());
                                getTitulo = propriedade.getTitulo();
                                propriedadeEncontrada = true;
                            }
                        }
                        if (propriedadeEncontrada && !getTitulo.isEmpty()) {
                            for (Avaliacao avaliacao : listAvaliacao) { //Apresenta a avaliação da propriedade

                                if (avaliacao.getPropriedadeAvaliada().equals(getTitulo)) {
                                    System.out.println("Propriedade: " + avaliacao.getPropriedadeAvaliada());
                                    System.out.println("Reservista: " + avaliacao.getAutor());
                                    System.out.println("Nota: " + avaliacao.getNota());
                                    System.out.println("Comentário: " + avaliacao.getComentario());

                                }
                            }
                        }

                    } else if (i > 4) { //Validador de opção
                        System.out.println("Opção inválida");
                    }

                } while (i != 4);
            } else if (user == 2) { /* Usuário */
                do { //Menu usuário
                    System.out.println("************ MackAirbnb ************");
                    System.out.println("1) Cadastrar um novo usuário");
                    System.out.println("2) Buscar e reservar um local");
                    System.out.println("3) Avaliar uma estadia");
                    System.out.println("4) Sair");
                    i = in.nextInt();
                    if (i == 1) { //Cadastro de usuário
                        for (int x = 0; x < 1; x++) {
                            in.nextLine();
                            Usuario novoUsuario = cadastrarUsuario(in);
                            listUsuario.add(novoUsuario);
                        }
                        System.out.println("Usuario cadastrado!!!");
                    } else if (i == 2) { //Buscar e reservar local
                        in.nextLine();
                        System.out.println("Digite a localização desejada: ");
                        String localizacaoDesejada = in.nextLine();

                        int cont = 1;
                        for (Propriedade propriedade : listPropriedades) {
                            if (propriedade.getLocalizacao().equalsIgnoreCase(localizacaoDesejada)) { //Apresenta a lista de propriedades

                                System.out.println(cont + ")");
                                System.out.println("Título: " + propriedade.getTitulo());
                                System.out.println("Descrição: " + propriedade.getDescricao());
                                System.out.println("Localização: " + propriedade.getLocalizacao());
                                System.out.println("Capacidade: " + propriedade.getCapacidade());
                                System.out.println("Preço: " + propriedade.getPreco());
                                System.out.println("Foto: " + propriedade.getFoto());
                                System.out.println("Proprietário: " + propriedade.getProprietario());
                                System.out.println("Avaliação: " + propriedade.getAvaliacao());
                                System.out.println("--------------------------------------");

                            }
                            cont++;
                        }
                        System.out.println("Qual propriedade deseja reservar?");
                        int escolherProp = in.nextInt();
                        Propriedade propriedadeEscolhida = listPropriedades.get(escolherProp - 1);

                        System.out.println("Digite seu nome");
                        String usuarioR = in.nextLine();

                        in.nextLine();
                        System.out.println("Deseja reservar esta propriedade? (1 - Sim / 2 - Não)");
                        int reservarOpcao = in.nextInt();

                        if (reservarOpcao == 1) { //Formatador de data
                            in.nextLine();
                            System.out.println("_________________________");
                            System.out.println("|jan fev mar abr mai jun|");
                            System.out.println("|jul ago set out nov dez|");
                            System.out.println("_________________________");
                            String mes = in.nextLine();
                            String mesInt = "0";
                            switch (mes) {
                                case "jan":
                                    mesInt = "01";
                                    break;

                                case "fev":
                                    mesInt = "02";
                                    break;

                                case "mar":
                                    mesInt = "03";
                                    break;

                                case "abr":
                                    mesInt = "04";
                                    break;

                                case "mai":
                                    mesInt = "05";
                                    break;

                                case "jun":
                                    mesInt = "06";
                                    break;

                                case "jul":
                                    mesInt = "07";
                                    break;

                                case "ago":
                                    mesInt = "08";
                                    break;

                                case "set":
                                    mesInt = "09";
                                    break;

                                case "out":
                                    mesInt = "10";
                                    break;

                                case "nov":
                                    mesInt = "11";
                                    break;

                                case "dez":
                                    mesInt = "12";
                                    break;

                            }

                            System.out.println("________" + mes + "________");
                            System.out.println("|1  2  3  4 5 6 7  |");
                            System.out.println("|8 9 10  11  12 13 |");
                            System.out.println("|14 15 16 17 18 19 |");
                            System.out.println("|20 21 22 23 24 25 |");
                            System.out.println("|26 27 28 29 30 31 |");
                            System.out.println("____________________");
                            System.out.println("Qual dia deseja reservar?");
                            int entrada = in.nextInt();

                            System.out.println("________" + mes + "________");
                            System.out.println("|1  2  3  4  5  6 7|");
                            System.out.println("|8 9 10 11 12  13  |");
                            System.out.println("|14 15 16 17 18 19 |");
                            System.out.println("|20 21 22 23 24 25 |");
                            System.out.println("|26 27 28 29 30 31 |");
                            System.out.println("Até que dia deseja ficar?");
                            int saida = in.nextInt();

                            double custoTotal = propriedadeEscolhida.getPreco() * (saida - entrada + 1);
                            System.out.println("Check-in: " + entrada + "/" + mesInt + "/2023 " + "| " +
                            "Check-out: " + saida + "/" + mesInt + "/2023 ");
                            System.out.println("Custo total: R$ " + custoTotal);

                            Reserva novaReserva = new Reserva(escolherProp, usuarioR, entrada, saida, custoTotal);
                            listReserva.add(novaReserva);
                            System.out.println("Reserva realizada com sucesso!");
                            System.out.println("______________________________");
                            System.out.println("Como deseja pagar?");
                            int tipoPagamento = 0;
                            int pagVerifica = 0;
                            do {//Validador de pagamento
                                System.out.println("1)Crédito  2)Débito  3)PIX");
                                tipoPagamento = in.nextInt();
                                if (tipoPagamento >= 1 && tipoPagamento <= 3) {
                                    pagVerifica += 1;

                                } else {
                                    System.out.println("Opção de pagamento invalida");
                                }
                            } while (pagVerifica != 1);
                            int pagamento = 0;
                            do {
                                System.out.println("Pagamento realizado? 1)Sim 2)Não");
                                pagamento = in.nextInt();
                            } while (pagamento != 1);
                        }
                        System.out.println("Sucesso!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                    } else if (i == 3) { //Avaliar estadia
                        System.out.println("Reservas disponíveis:");

                        for (Reserva reserva : listReserva) {

                            if (reserva.getUsuarioR().equals(nomeLogin)) {
                                System.out.println("Propriedade: " + reserva.getPropriedadeR());
                                System.out.println("Hóspede: " + reserva.getUsuarioR());
                                System.out.println("Check-in: " + reserva.getCheckIn());
                                System.out.println("Check-out: " + reserva.getCheckOut());
                                System.out.println("------------------------");
                                Avaliacao a = new Avaliacao();
                                a.avaliarEstadia();
                                listAvaliacao.add(a);
                            }

                        }

                    } else if (i > 4) {
                        System.out.println("Opção inválida");
                    }

                } while (i != 4);
            }
        }
    }

    public static Propriedade cadastrarPropriedade(Scanner in) {
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
        in.nextLine();
        System.out.println("Digite a foto: ");
        String foto = in.nextLine();
        System.out.println("Digite o nome do proprietario: ");
        String proprietario = in.nextLine();
        System.out.println("Digite a avaliação: ");
        String avaliacao = in.nextLine();

        return new Propriedade(titulo, descricao, localizacao, capacidade, preco, foto, proprietario, avaliacao);
    }

    public static Usuario cadastrarUsuario(Scanner in) {

        System.out.println("Digite o nome: ");
        String nome = in.nextLine();

        System.out.println("Digite o email: ");
        String email = in.nextLine();

        System.out.println("Digite a senha: ");
        String senha = in.nextLine();

        return new Usuario(nome, email, senha);
    }
}