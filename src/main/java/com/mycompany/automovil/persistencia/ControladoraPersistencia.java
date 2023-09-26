
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
        
    }
    
}
