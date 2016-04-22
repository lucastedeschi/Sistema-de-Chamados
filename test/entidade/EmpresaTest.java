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
public class EmpresaTest {
    @Test
    public void inicializaçãotest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        assertEquals(123456789, empresa.getNumeroContrato());
        assertEquals("Empresa", empresa.getNomeEmpresa());
    }
}
