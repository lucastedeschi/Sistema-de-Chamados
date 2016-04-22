/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class EmpresaTest {
    @Test
    public void inicializaçãotest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Assert.assertEquals(123456789, empresa.getNumeroContrato());
        Assert.assertEquals("Empresa", empresa.getNomeEmpresa());
    }
}
