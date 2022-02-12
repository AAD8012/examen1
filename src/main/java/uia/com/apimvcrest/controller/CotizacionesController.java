package uia.com.apimvcrest.controller;

import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.compras.Cotizacion;
import uia.com.apimvcrest.controller.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class CotizacionesController
{
    private CotizacionServicio servicioCotizaciones = new CotizacionServicio();

    public CotizacionesController() throws IOException {
    }

    @GetMapping("/cotizaciones")
    public ArrayList<CotizacionModelo> cotizaciones()
    {
        return servicioCotizaciones.getCotizaciones();
    }

    @GetMapping("/cotizacion/{id}")
    public CotizacionModelo cotizacionById(@PathVariable int id)
    {
        return  servicioCotizaciones.getCotizacion(id);
    }

    @DeleteMapping("/cotizacion/{id}")
    public CotizacionModelo deleteCotizacionById(@PathVariable int id)
    {
        return  servicioCotizaciones.deleteCotizacion(id);
    }

    @PutMapping("/cotizacion/{id}")
    Cotizacion replaceCotizacion(@RequestBody Cotizacion newCotizacionServicio, @PathVariable int id) {

        return servicioCotizaciones.replaceCotizacion(id)
                .map(cotizacion -> {
                    cotizacion.setName(newcotizacion.getName());
                    cotizacion.setId(newcotizacion.getId());
                    return repository.save(cotizacion);
                })
                .orElseGet(() -> {
                    newcotizacion.setId(id);
                    return repository.save(newcotizacion);
                });
    }








}
