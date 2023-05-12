package com.kavecanem.adiestramiento.entidades;

import static com.kavecanem.adiestramiento.entidades.Mascota_.tutor;
import com.kavecanem.adiestramiento.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author Guillote
 */
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String paseos, String frecPaseo,
            String duerme, String juega, String dispoJug, String comidas, String nombreTutor,
            String telefono, String direccion, String observaciones) {

        Tutor tutor = new Tutor();
        tutor.setNombreTutor(nombreTutor);
        tutor.setTelefono(telefono);
        tutor.setDireccion(direccion);
        tutor.setObservaciones(observaciones);

        Mascota mascota = new Mascota();
        mascota.setNombrePerro(nombreMasco);
        mascota.setRaza(raza);
        mascota.setPaseo(paseos);
        mascota.setFrecPaseo(frecPaseo);
        mascota.setDuerme(duerme);
        mascota.setJuega(juega);
        mascota.setDispoJug(dispoJug);
        mascota.setComidas(comidas);
        mascota.setTutor(tutor);

        controladoraPersistencia.guardar(mascota, tutor);

    }

    public List<Mascota> listadoMascotas() {

        return controladoraPersistencia.listadoMascotas();
    }

    public void borrarMascota(int num_cliente) {

        controladoraPersistencia.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controladoraPersistencia.traerMascota(num_cliente);

    }

    public void modificarMascota(Mascota mascota, String nombreMasco, String raza,
            String paseos, String frecPaseo, String duerme, String juega, String dispoJug,
            String comidas, String nombreTutor, String telefono, String direccion, String observaciones) {

        mascota.setNombrePerro(nombreMasco);
        mascota.setRaza(raza);
        mascota.setPaseo(paseos);
        mascota.setFrecPaseo(frecPaseo);
        mascota.setDuerme(duerme);
        mascota.setJuega(juega);
        mascota.setDispoJug(dispoJug);
        mascota.setComidas(comidas);

        controladoraPersistencia.modificarMascota(mascota);

        Tutor tutorr = this.buscarTutor(mascota.getTutor().getId_tutor());
        tutorr.setNombreTutor(nombreTutor);
        tutorr.setTelefono(telefono);
        tutorr.setDireccion(direccion);
        tutorr.setObservaciones(observaciones);

        this.modificarTutor(tutorr);
    }

    private Tutor buscarTutor(int id_tutor) {
        return controladoraPersistencia.traerTutor(id_tutor);
    }

    private void modificarTutor(Tutor tutorr) {
        controladoraPersistencia.modificarTutor(tutorr);
    }
}
