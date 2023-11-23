package persistencia;

import beans.VeiculoBeans;

interface VeiculosDAOListener {
    VeiculosDAO consultarNumero(VeiculoBeans numero) throws Exception;
    VeiculosDAO consultarPlaca(VeiculoBeans placa) throws Exception;
    void inserirveiculo(VeiculoBeans veiculo) throws Exception;
    void AtualizarVeiculo(VeiculoBeans veiculo) throws Exception;
    void excluir(VeiculoBeans numero) throws Exception; 

}
