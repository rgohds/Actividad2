public class Main {

    public static void main(String[] args) {
        int MaxCalif = 5;
        float promedio;
        int[] Calif = new int[MaxCalif];
        char CalifFinal;

        Alumno ElAlumno = new Alumno(5);
        ElAlumno.PreguntaNombre();
        ElAlumno.PreguntaCalificaciones(Calif);
        promedio = ElAlumno.PromedioCalificaciones(Calif);
        CalifFinal = ElAlumno.CalifFinal(promedio);

        ElAlumno.ImprimeResultados(ElAlumno.Nombre, promedio, CalifFinal);

    }
}