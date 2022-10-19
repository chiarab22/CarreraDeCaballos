package caballos;

import java.awt.TextArea;
import javax.swing.*;

public class Ventana {
    private JFrame ventana = new JFrame();
    private TextArea texto_ventana = new TextArea();

    Ventana(String nombre, int x, int y){
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.add(texto_ventana);
        ventana.setLocation(x, y);
    }

    public void escribecadena(String cadena){
        texto_ventana.setText(texto_ventana.getText() + cadena);
    }
}
