package src.util;

import org.junit.Test;
import src.util.NumeroPorExtenso;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroPorExtensoTest {
    private static final Integer CINCO = 5;
    private static final Integer TREZE = 13;
    private static final Integer CENTO_E_NOVENTA_E_OITO = 198;
    private static final Integer QUINHENTOS_E_TRINTA_E_OITO_MIL_SETECENTOS_E_VINTE_E_NOVE = 538729;
    private static final Integer DOIS_MILHOES = 2000000;


    @Test
    public void deveEscreverNumeroPorExtensoEntreZeroEDez(){
        String numeroPorExtenso = NumeroPorExtenso.get(CINCO);
        assertEquals("cinco", numeroPorExtenso);
    }

    @Test
    public void deveEscreverNumeroPorExtensoMaiorDeDez(){
        String numeroPorExtenso = NumeroPorExtenso.get(TREZE);
        assertEquals("treze", numeroPorExtenso);
    }

    @Test
    public void deveEscreverNumeroPorExtensoMaiorDeCem(){
        String numeroPorExtenso = NumeroPorExtenso.get(CENTO_E_NOVENTA_E_OITO);
        assertEquals("cento e noventa e oito", numeroPorExtenso);
    }

    @Test
    public void deveEscreverNumeroPorExtensoMaiorDeMil(){
        String numeroPorExtenso = NumeroPorExtenso.get(QUINHENTOS_E_TRINTA_E_OITO_MIL_SETECENTOS_E_VINTE_E_NOVE);
        assertEquals("quinhentos e trinta e oito mil, setecentos e vinte e nove", numeroPorExtenso);
    }

    @Test
    public void deveEscreverNumeroPorExtensoComPartePlurar(){
        String numeroPorExtenso = NumeroPorExtenso.get(DOIS_MILHOES);
        assertEquals("dois milhões", numeroPorExtenso);
    }
}
