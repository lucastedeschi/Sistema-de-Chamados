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
 * @author Lucas Tedeschi
 */
public class PessoaTest {

    @Test
    public void inicializacaoTest() {
        Pessoa p1 = new Pessoa("José",4444444);
        Assert.assertEquals(4444444,p1.getTelefone());
        Assert.assertEquals("José",p1.getNome());
    }
    
    @Test
    public void alteracaoTest(){
        Pessoa p1 = new Pessoa("José",4444444);
        Assert.assertEquals(4444444,p1.getTelefone());
        Assert.assertEquals("José",p1.getNome());
        p1.setNome("João");
        p1.setTelefone(55555);
        Assert.assertEquals(55555,p1.getTelefone());
        Assert.assertEquals("João",p1.getNome());
    }

}
