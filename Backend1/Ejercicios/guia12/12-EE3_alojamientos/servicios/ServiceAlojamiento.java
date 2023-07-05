package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4E;
import entidades.Hotel5E;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*

 */
public class ServiceAlojamiento {
    //    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private final Random rand = new Random();

    public void crearAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (int i = 0; i < 2; i++) {
            Hotel4E hotel4E = new Hotel4E();
            hotel4E.crearHotel4EAuto();
            hotel4E.calcularPrecio();
            alojamientos.add(hotel4E);

            Hotel5E hotel5E = new Hotel5E();
            hotel5E.crearHotel5EAuto();
            hotel5E.calcularPrecio();
            alojamientos.add(hotel5E);

            Camping camping = new Camping();
            camping.crearCampingAuto();
            alojamientos.add(camping);

            Residencia residencia = new Residencia();
            residencia.crearResidenciaAuto();
            alojamientos.add(residencia);
        }
    }

    public void mostrarTodos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel5E) {
                Hotel5E hotel = (Hotel5E) alojamiento;
                hotel.mostrarHotel5EAuto();
                continue;
            }

            if (alojamiento instanceof Hotel4E) {
                Hotel4E hotel = (Hotel4E) alojamiento;
                hotel.mostrarHotel4EAuto();
                continue;
            }

            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                camping.mostrarCamping();
                continue;
            }

            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                residencia.mostrarResidencia();
            }
        }
    }

    public void mostrarHotelesPrecioDesc(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList();

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4E || alojamiento instanceof Hotel5E) {
                Hotel hotel = (Hotel) alojamiento;
                hoteles.add(hotel);
            }
        }

        hoteles.sort(Hotel.ordenarPorPrecio);

        for (Hotel hotel : hoteles) {
            if (hotel instanceof Hotel5E) {
                Hotel5E aux = (Hotel5E) hotel;
                aux.mostrarHotel5EAuto();
                continue;
            }

            if (hotel instanceof Hotel4E) {
                Hotel4E aux = (Hotel4E) hotel;
                aux.mostrarHotel4EAuto();
            }
        }
    }

    public void mostrarCampingsConResturante(ArrayList<Alojamiento> alojamientos) {
        boolean b = false;
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;

                if (camping.isRestaurante()) {
                    camping.mostrarCamping();
                    b = true;
                }
            }
        }

        if (!b) {
            System.out.println("No hay camping con restaurante.");
        }
    }

    public void mostrarResidenciasConDescuento(ArrayList<Alojamiento> alojamientos) {
        boolean b = false;
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;

                if (residencia.isDescuentoGremio()) {
                    residencia.mostrarResidencia();
                    b = true;
                }
            }
        }

        if (!b) {
            System.out.println("No hay residencia con descuento.");
        }
        
    }
}
