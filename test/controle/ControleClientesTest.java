package controle;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author lucas
 */
public class ControleClientesTest {

    @Test
    public void incluiNovoClienteTest() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(123, "Empresa");
        ClienteEmpresa ce = controller.incluiNovoCliente(empresa, 11111111, "Nome", 44448888);
        ClienteDAO clientedao = controller.getClienteDAO();
        ClienteEmpresa cliente = clientedao.get(Long.parseLong("11111111"));
        assertEquals(cliente.getCpf(), ce.getCpf());
        assertEquals(cliente.getNome(), ce.getNome()); 
        assertEquals(cliente.getEmpresa(), ce.getEmpresa()); 
        assertEquals(cliente.getTelefone(), ce.getTelefone());
        assertEquals(cliente.getCodigo(), ce.getCodigo());
    }
    
    @Test
    public void updateClienteTest() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(123, "Empresa");
        Empresa empresa2 = new Empresa(123, "Empresa2");
        ClienteEmpresa ce = controller.incluiNovoCliente(empresa, 11111111, "Nome", 44448888);
        ClienteEmpresa ce2 = controller.incluiNovoCliente(empresa2, 11111111, "Nome", 44448888);
        ClienteEmpresa cliente = controller.getClienteDAO().voltaCashCliente().get(ce2.getCpf());
        assertEquals(ce2.toString(),cliente.toString());
    }

    @Test
    public void removeClienteTest(){
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(123, "Empresa");
        ClienteEmpresa ce = controller.incluiNovoCliente(empresa, 1111111, "Nome", 44448888);
        controller.getClienteDAO().voltaCashCliente().remove(ce.getCpf());
        Assert.assertNull(controller.getClienteDAO().voltaCashCliente().get(ce.getCpf()));
    }
    
    @Test
    public void readClienteTest() {
        ControleClientes controller = new ControleClientes();
        Empresa empresa = new Empresa(123, "Empresa");
        ClienteEmpresa ce = controller.incluiNovoCliente(empresa, 11111111, "Nome", 44448888);
        ClienteEmpresa ce2 = controller.incluiNovoCliente(empresa, 11111111, "Nome", 44448888);
        ClienteDAO clientedao = controller.getClienteDAO();
        
        HashMap<Long, ClienteEmpresa> clientes = clientedao.voltaCashCliente();
        ClienteEmpresa cliente1 = clientes.get(ce.getCpf());
        ClienteEmpresa cliente2 = clientes.get(ce2.getCpf());
        assertEquals(ce.toString(), cliente1.toString());
        assertEquals(ce2.toString(), cliente2.toString());
    }
    
}