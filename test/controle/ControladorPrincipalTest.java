/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import static junit.framework.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ControladorPrincipalTest {

    @Test
    public void incializacaoTest() {
        ControladorPrincipal c = new ControladorPrincipal();
        assertNotNull(c.getCtrChamados());
        assertNotNull(c.getCtrClientes());
        assertNotNull(c.getCtrEmpresa());
        assertNotNull(c.getCtrTecnicos());
        
    }

}
