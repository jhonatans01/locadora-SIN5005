package locadora.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jhonatan
 */
public class FabricaEntityManager {

    private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("locadora_war_1.0-SNAPSHOTPU");

    private FabricaEntityManager() {
    }

    public static EntityManagerFactory obterFabrica() {
        return fabrica;
    }

    public static EntityManagerFactory obterFabrica(String unidadePersistencia) {
        if (fabrica != null && fabrica.isOpen()) {
            fabrica.close();
        }
        fabrica = Persistence.createEntityManagerFactory(unidadePersistencia);
        return fabrica;
    }
}
