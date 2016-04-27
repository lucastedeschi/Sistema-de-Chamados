/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ControleTecnicosTest {
    @Test
    public void inserirTest() {
        ControleTecnicos tec = new ControleTecnicos();
        tec.inserir(12324,"Tecnico1");
        
        Assert.assertNotNull(tec);
        
    }

}
