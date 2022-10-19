package caballos;

public class OperacionHilo extends Thread{
    private Resultado res;
    private int numCorredores;
    private int numCarrera;

    OperacionHilo(int i, Resultado res, int numCorredores){
        this.numCarrera = i;
        this.res = res;
        this.numCorredores = numCorredores;
    }

    public void run(){
        res.carreras[numCarrera-1] = numCarrera;
        Operacionesenhilo[] corredor = new Operacionesenhilo[numCorredores];
        for (int i = 0; i < numCorredores; i++) {
            corredor[i] = new Operacionesenhilo (i+1, res, numCarrera); //A cada hilo le paso su contador, el almacén y el número de carrera en el que se encuentra
            corredor[i].start(); //Empiezo el hilo
        }

        try{
            for (int i = 0; i < numCorredores; i++) {
                corredor[i].join(); //Espero a los hilos
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
