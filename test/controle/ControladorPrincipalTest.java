/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import junit.framework.Assert;
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
        Assert.assertNotNull(c.getCtrChamados());
        Assert.assertNotNull(c.getCtrClientes());
        Assert.assertNotNull(c.getCtrEmpresa());
        Assert.assertNotNull(c.getCtrTecnicos());
        
    }

}
