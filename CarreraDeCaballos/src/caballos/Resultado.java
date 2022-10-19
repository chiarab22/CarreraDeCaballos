package caballos;

public class Resultado {
    int[][] carrera;
    int[] carreras;
    String[][] cadena;

    Resultado(int numCorredores, int numCarrera) {
        this.carrera = new int[numCarrera][numCorredores];
        this.carreras = new int[numCarrera];
        this.cadena = new String[numCarrera] [numCorredores];
    }

    void getResultados() {

        for(int t = 0; t < carreras.length; t++) {
            for(int i = 0; i < carrera.length; i++) {
                this.cadena[t][i] = "Carrera: El caballo " + (i+1) + " ha tardado: " + this.carrera[t][i] + " sprints\n";
            }
        }
    }
}
