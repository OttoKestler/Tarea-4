import java.util.Scanner;

public class JuegoDeCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ingresar el numero de jugadores
        System.out.print("Ingrese un numero de cartas: ");
        int n = sc.nextInt();

        //Ingrese el numero de partidas
        System.out.println("Inngrese el número de partidas o rondas");
        int p  = sc.nextInt();

        Juego juego = new Juego(n, p);
        juego.jugar();
    }
}