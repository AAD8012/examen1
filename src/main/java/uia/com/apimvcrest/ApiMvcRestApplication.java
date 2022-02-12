package uia.com.apimvcrest;

import uia.com.apimvcrest.controller.modelo.CotizacionModelo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uia.com.apimvcrest.servicio.CotizacionServicio;

import java.io.IOException;

@SpringBootApplication
public class ApiMvcRestApplication {

    public static void main(String[] args) throws IOException {
        CotizacionModelo newCotizacion = new CotizacionModelo(10000, "prueba1", "1", 1, 1, 0.0,  1);
        newCotizacion.print();

        CotizacionServicio newCotizacionServicio = new CotizacionServicio();
        newCotizacionServicio.getCotizaciones();
        newCotizacionServicio.print();

        SpringApplication.run(ApiMvcRestApplication.class, args);
    }

}
