package src.util;

import java.util.HashMap;
import java.util.Map;

public class AlgarismoFactory {

    private static final Map<Integer, Class<?>> casas = new HashMap<>();

    static {
        casas.put(0, Unidade.class);
        casas.put(1, Dezena.class);
        casas.put(2, Centena.class);
    }

    static Algarismo create(int casa, int valor, Algarismo algarismoADireita, Classe classe) {

        try {
            return (Algarismo) casas.get(casa)
                    .getConstructor(int.class, Algarismo.class, Classe.class)
                    .newInstance(valor, algarismoADireita, classe);

        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
