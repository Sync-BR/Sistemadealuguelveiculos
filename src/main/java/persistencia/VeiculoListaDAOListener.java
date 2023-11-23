package persistencia;

import beans.VeiculoBeans;

interface VeiculoListaDAOListener {
      public boolean ListarAllVeiculos() throws Exception;
      public   boolean ListarAllClientes() throws Exception;
       public void ListarAlugueis() throws Exception;
        public  void ListarAcessorios() throws Exception;
         public  void ListarAcessoriosVeiculos() throws Exception;
}
