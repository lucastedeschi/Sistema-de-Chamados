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
    
    @Test
    public void inicializacaoNulaTest(){
        Tecnico t = new Tecnico("", 123456);
        Assert.assertNotEquals("", t.getNome());
        Assert.assertEquals(123456, t.getTelefone());
    }
    
    @Test
    public void inicializacaoNumNegativoTest(){
        Tecnico t = new Tecnico("Tecnico", -123456);
        if(-123456 == t.getTelefone()){
            Assert.fail("Número negativo foi adicionado como telefone.");
        }
    }
    
    @Test
    public void alteracaoNulaTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        Assert.assertEquals("Tecnico", t.getNome());
        Assert.assertEquals(123456, t.getTelefone());
        t.setNome("");
        t.setTelefone(12345);
        Assert.assertNotEquals("", t.getNome());
        Assert.assertEquals(12345, t.getTelefone());
    }
    
    @Test
    public void alteracaoNumNegativoTest(){
        Tecnico t = new Tecnico("Tecnico", 123456);
        Assert.assertEquals("Tecnico", t.getNome());
        Assert.assertEquals(123456, t.getTelefone());
        t.setNome("Tecnico");
        t.setTelefone(-12345);
        if(-12345 == t.getTelefone()){
            Assert.fail("Número negativo foi adicionado como telefone.");
        }
    }
}
