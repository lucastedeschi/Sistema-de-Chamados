/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class TecnicoTest {
    @Test
    public void inicializacaoTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        assertEquals("Tecnico", t.getNome());
        assertEquals(123456, t.getTelefone());
    }
    
    @Test
    public void alteracaoTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        assertEquals("Tecnico", t.getNome());
        assertEquals(123456, t.getTelefone());
        t.setNome("NovoTecnico");
        t.setTelefone(12345);
        assertEquals("NovoTecnico", t.getNome());
        assertEquals(12345, t.getTelefone());
    }
}
