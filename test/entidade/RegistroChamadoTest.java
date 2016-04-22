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
public class RegistroChamadoTest {
    @Test
    public void inicializacaoTest(){
      
        Tecnico t = new Tecnico("Tecnico", 123456);
        Empresa empresa = new Empresa(123456789, "Empresa");
        ClienteEmpresa cq = new ClienteEmpresa(1, empresa, 123456, "ClienteEmpresa", 12345678);
        Chamado c = new Chamado("Titulo", "Descrição", 1, t, cq, "Windows", "10", "BD");
        RegistroChamado r = new RegistroChamado("Assunto", c, t);
        assertEquals("Assunto", r.getAssunto());
        assertEquals(t, r.getTecnico());
    }
}
