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
public class ClienteEmpresaTest {
    @Test
    public void inicializacaoTest(){
        Empresa empresa = new Empresa(123456789, "Empresa");
        Integer codigo = 1;
        ClienteEmpresa cq = new ClienteEmpresa(codigo, empresa, 123456, "ClienteEmpresa", 12345678);
        assertEquals(empresa, cq.getEmpresa());
        assertEquals(123456, cq.getCpf());
        assertEquals(codigo, cq.getCodigo());
        assertEquals("ClienteEmpresa", cq.getNome());
        assertEquals(12345678, cq.getTelefone());
        
    }
}
