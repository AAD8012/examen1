package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.controller.modelo.CotizacionModelo;

import java.util.ArrayList;

public interface ICotizacionServicio {
    ArrayList<CotizacionModelo> getCotizaciones();
    Object getCotizacion(int id);
    void print();

    CotizacionModelo deleteCotizacion(int id);
}
