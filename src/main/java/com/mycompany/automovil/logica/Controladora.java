package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color,
            String patente, int cantPuertas) {

        Automovil auto = new Automovil();
        auto.setCantPuertas(cantPuertas);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);

        controlPersis.agregarAutomovil(auto);
        
        //cartel que se agrego correctamente
        mostrarMensaje("Se agregó correctamente", "Info", "Agregar automóvil");

    }

    public List<Automovil> traerAutos() {
        //llamamos a la persistencia
        return controlPersis.traerAutos();

    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor,
            String color, String patente, int cantPuertas) {
        
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        auto.setMotor(motor);
        
        //le pido a la persis q modifique
        controlPersis.modificarAuto(auto);

    }
    
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
