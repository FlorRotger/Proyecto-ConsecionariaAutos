
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;


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
        
    }
    
}
