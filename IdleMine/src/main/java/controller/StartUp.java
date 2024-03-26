package controller;

import model.ambient.Player;
import view.bannerPrint;

import java.util.Scanner;


public class StartUp {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final String INICIAR = "s";
    private static Player playerLogado = null;

    public static void main(String[] args) {
        menuIniciar();
        if (playerLogado != null) startGame();

    }

    public static void menuIniciar(){
        bannerPrint.printStartGame();
        if (entradaString().equalsIgnoreCase(INICIAR)){
            login();
        }
    }

    public static void login(){
        bannerPrint.inputNameBanner();
        String nomePlayer = entradaString();
        Player newPlayer = new Player(nomePlayer);
        playerLogado = newPlayer;

    }

    private static void startGame() {
        playerStatusHeader();
    }

    public static String entradaString(){
        String entrada = SCAN.nextLine();
        if (entradaValida(entrada)){
            return entrada;
        }return entradaString();
    }
    public static boolean entradaValida(String entrada){
        if (entrada == null || entrada.isBlank()){
            return false;
        }
        return true;
    }
    public static int entradaInteiro(){
        if (SCAN.hasNextInt()){
            return SCAN.nextInt();
        }SCAN.nextLine();
        return entradaInteiro();
    }



    public static void playerStatusHeader(){
        System.out.printf("""
                +-----------+-----------+-----------+----------+--------------+-------------+
                |   Cobre   |   Ferro   |   Prata   |   Ouro   |   Diamante   |   Mitrhil   |
                |   %d      |    %d     |    %d     |   %d     |   %d         |      %d     |
                +-----------+-----------+-----------+----------+--------------+-------------+
                | %s          | Lv.X | XP[░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░]                |
                +---------------------------------------------------------------------------+""",playerLogado.getName());
    }
}
