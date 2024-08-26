import java.util.Scanner;

public class JuegoDeCartas {
    public static void main(String{} args) {
        Scanner sc = new Scanner(System.in);
        //ingrese el numero de jugadores
        System.out.println("ingrese el numero de jugadores");
        int n = sc.nextInt();

        //ingresar el numero de partidas
        System.out.println("Ingrese el numero de partidas a rondas");
        int p = sc.nextInt();

        Juego Juego = new Juego();
        juego.jugar();
    }
}