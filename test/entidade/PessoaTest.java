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
        Pessoa p1 = new Pessoa("José",41472365);
        assertEquals(41472365,p1.getTelefone());
        assertEquals("José",p1.getNome());
        
        
    }
}
