/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ControleEmpresasTest {
    
    @Test
    public void inserirEmpresaTest() {
        ControleEmpresas ce = new ControleEmpresas();
        Empresa e = new Empresa(12345670, "Empresa5");
        ce.inserir(e.getNumeroContrato(), e.getNomeEmpresa());
        Empresa ei = ce.retorna(12345670, "Empresa5");
        assertEquals(ei.getNomeEmpresa(), e.getNomeEmpresa());
        assertEquals(ei.getNumeroContrato(), e.getNumeroContrato());
    }

    @Test
    public void readTest() {
        Empresa e = new Empresa(123456789, "Empresa8");
        ControleEmpresas c = new ControleEmpresas();
        c.inserir(e.getNumeroContrato(), e.getNomeEmpresa());
        Empresa ei = c.retorna(123456789, "Empresa8");
        assertEquals("Empresa8", ei.getNomeEmpresa());
        assertEquals(123456789, ei.getNumeroContrato());
        
    }
    
     @Test
    public void inserirEmpresaDuplicadaTest() {
        ControleEmpresas c = new ControleEmpresas();
        Empresa e = c.retorna(12345670, "Empresa5");
        assertNull(c.inserir(e.getNumeroContrato(), e.getNomeEmpresa()));

    }

     @Test
    public void removeTest() {
        //Método não encontrado
    }
    
    @Test
    public void updateTest() {
        //Método não encontrado
    }
}
