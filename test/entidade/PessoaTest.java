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
 * @author Lucas Tedeschi
 */
public class PessoaTest {

    @Test
    public void inicializacaoTest() {
        Pessoa p1 = new Pessoa("José",4444444);
        assertEquals(4444444,p1.getTelefone());
        assertEquals("José",p1.getNome());
    }
    
    @Test
    public void alteracaoTest(){
        Pessoa p1 = new Pessoa("José",4444444);
        assertEquals(4444444,p1.getTelefone());
        assertEquals("José",p1.getNome());
        p1.setNome("João");
        p1.setTelefone(55555);
        assertEquals(55555,p1.getTelefone());
        assertEquals("João",p1.getNome());
    }

}
