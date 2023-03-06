
import java.util.Scanner;
public class Alumno {
    public String Nombre;
    private int MaxCalif;
    private int[] MisCalif;

    private Scanner reader;

    public Alumno(int MaxCalificaciones){
        this.reader = new Scanner(System.in);
        this.MaxCalif = MaxCalificaciones;
        this.MisCalif = new int[this.MaxCalif];

    }
    public void PreguntaNombre() {
        System.out.println("Introduce el nombre del alumno:");
        this.Nombre = reader.nextLine();
        //System.out.println(this.Nombre);
    }

    public void PreguntaCalificaciones( int[] Calif) {
        for (int count = 0; count < this.MaxCalif; count ++ ) {
            System.out.println("Introduce la calificación " + (count + 1) + ":"  );
            Calif[count] = reader.nextInt();
        }
    }

    public float PromedioCalificaciones(int[] Calif) {
        int suma = 0;
        for (int count = 0; count < this.MaxCalif; count ++ ) {
            this.MisCalif[count] = Calif[count];
            suma += Calif[count];
        }
        return (float) suma / this.MaxCalif;
    }

    public char CalifFinal(float promedio) {
        char CalFin = ' ';
        if (promedio <= 50) {
            CalFin = 'F';
        } else {
            if ((promedio >= 51) && (promedio <= 60 )) {
                CalFin = 'E';
            } else {
                if ((promedio >= 61) && (promedio <= 70 )) {
                    CalFin = 'D';
                } else {
                    if ((promedio >= 71) && (promedio <= 80 )) {
                        CalFin = 'C';
                    } else {
                        if ((promedio >= 81) && (promedio <= 90 )) {
                            CalFin = 'B';
                        } else {
                            if ((promedio >= 91) && (promedio <= 100 )) {
                                CalFin = 'A';
                            }
                        }
                    }
                }
            }
        }
        return CalFin;
    }

    public void ImprimeResultados(String Nombre, float promedio, char calif) {
        System.out.println("Nombre del estudiante: " + Nombre);
        for (int count = 0; count < this.MaxCalif; count ++ ) {
            System.out.println("Nombre del estudiante: " + (count + 1) + ": " + this.MisCalif[count]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calif);
    }
}
