/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class TecnicoTest {
    @Test
    public void inicializacaoTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        Assert.assertEquals("Tecnico", t.getNome());
        Assert.assertEquals(123456, t.getTelefone());
    }
    
    @Test
    public void alteracaoTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        Assert.assertEquals("Tecnico", t.getNome());
        Assert.assertEquals(123456, t.getTelefone());
        t.setNome("NovoTecnico");
        t.setTelefone(12345);
        Assert.assertEquals("NovoTecnico", t.getNome());
        Assert.assertEquals(12345, t.getTelefone());
    }
}
