package caballos;

public class Operacionesenhilo extends Thread {
    private int numhilo;
    private Ventana ventana_hilo;
    private final int meta = 50;
    private Resultado res;
    private int numCarrera;

    Operacionesenhilo(int i, Resultado res, int numCarrera) {
        this.numhilo = i;
        ventana_hilo = new Ventana("Caballo " + numhilo, i * 300, i);
        this.res = res;
        this.numCarrera = numCarrera - 1;
    }

    public void run(){
        String cadena = new String();
        int metros = 1;
        int i = 1;
        while (metros < meta){
            cadena="Soy el caballo " + numhilo + " y es mi sprint " + i +  " y he recorrido " + metros + " metros\n"; //Guardo cadena
            ventana_hilo.escribecadena(cadena); //Imprimo cadena en ventana
            try{
                sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Hilo Interrumpido.");
            }

            i++; //Sumo sprint
            metros = metros + (int) (Math.random() * 20); //Sumo metros aleatorios
        }
        res.carrera[numCarrera][numhilo-1]=i;

        System.out.println("Soy el caballo "+ numhilo +" he FINALIZADO"); //Imprimo en consola
        cadena="Soy el caballo" + numhilo + " he FINALIZADO"; //Guardo cadena
        ventana_hilo.escribecadena(cadena); //Imprimo cadena

    }


}
