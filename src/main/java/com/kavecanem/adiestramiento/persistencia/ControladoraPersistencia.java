package com.kavecanem.adiestramiento.persistencia;

import com.kavecanem.adiestramiento.entidades.Mascota;
import com.kavecanem.adiestramiento.entidades.Tutor;
import com.kavecanem.adiestramiento.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author Guillote
 */
public class ControladoraPersistencia {

    TutorJpaController tutorJpa = new TutorJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Mascota mascota, Tutor tutor) {

        tutorJpa.create(tutor);

        mascotaJpa.create(mascota);

    }

    public List<Mascota> listadoMascotas() {

        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {

        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Mascota traerMascota(int num_cliente) {
        return mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tutor traerTutor(int id_tutor) {
        return tutorJpa.findTutor(id_tutor);
    }

    public void modificarTutor(Tutor tutorr) {
        try {
            tutorJpa.edit(tutorr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
