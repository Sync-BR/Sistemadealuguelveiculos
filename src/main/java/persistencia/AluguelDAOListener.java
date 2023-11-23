package persistencia;

import beans.AluguelBeans;

interface AluguelDAOListener {
void verificarVeiculoAlugado(String veiculo) throws Exception;
 void VerificarAluguel(String veiculo) throws Exception;
 void VerificarPendencia(String nome) throws Exception;
 void VerificarUser(String nome) throws Exception;
 void inserirVeiculo(AluguelBeans aluguel) throws  Exception;
 void ConsultarVeiculo(int id)  throws Exception;
  void  ConsultarVeiculo(String cliente)  throws Exception;

}
