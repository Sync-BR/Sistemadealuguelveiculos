package persistencia;

import beans.ClienteBeans;
import beans.VeiculoBeans;

interface ClienteDAOListener {
  
    void AtualizarCliente(ClienteBeans clientes) throws Exception;
    void consultarCpf(ClienteBeans cpf) throws Exception;
    ClienteDAO consultaID(int id) throws Exception;
     void Inserirdados(ClienteBeans clientes) throws Exception;
      void excluirCliente( String cpf) throws  Exception;
      void excluirID(int id) throws Exception;
    
}
