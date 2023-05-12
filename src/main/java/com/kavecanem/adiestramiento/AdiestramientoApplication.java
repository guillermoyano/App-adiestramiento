package com.kavecanem.adiestramiento;

import com.kavecanem.adiestramiento.panelgrafico.Formulario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdiestramientoApplication {
    
    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        
    }
    
}
