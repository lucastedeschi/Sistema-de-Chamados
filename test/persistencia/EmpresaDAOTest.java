/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
import java.util.Collection;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 31449530
 */
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
    }

    @Test
    public void InserirEmpresaTest() {
        Empresa emp = new Empresa(12345,"SAP");
        
        EmpresaDAO empDAO = new EmpresaDAO();
        Empresa empInserida = null;
        empDAO.put(emp);
         Collection<Empresa> empresas = empDAO.getEmpresas();
         for (Empresa empresa : empresas) {
            if((empresa.getNumeroContrato() == emp.getNumeroContrato()) && (emp.getNomeEmpresa().equals(empresa.getNomeEmpresa()))){
                empInserida =empresa;
            }
            
        }
         Assert.assertEquals(empInserida, emp);
    }

    @Test
    public void BuscarEmpresasTest() {
        
        EmpresaDAO empDAO = new EmpresaDAO();
         Collection<Empresa> empresas = empDAO.getEmpresas();
     
         Assert.assertTrue(empresas.size() > 0);
        
    }

    @Test
    public void VoltaEmpresaTest() {
        EmpresaDAO empDAO = new EmpresaDAO();
        
        HashMap<Long,Empresa> hashRetornado = empDAO.voltaEmpresa();
        
        Assert.assertNotNull(hashRetornado);
    }
    
}
