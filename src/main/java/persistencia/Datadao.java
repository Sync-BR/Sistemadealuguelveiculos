
package persistencia;
import beans.AluguelBeans;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import telas.AluguelVeiculos;
import persistencia.DataDAO;
import static telas.TelaFaturamento.txtFaturamentoData;

public class DataDAO {

    public DataDAO() {
    }
    

public  static void  DataViwer(){
        Calendar calendar = Calendar.getInstance();
         Date datahoje = new Date();
         Locale brasil = new  Locale("pt","BR");
        SimpleDateFormat dateFormat = new SimpleDateFormat("y-MM-dd", brasil);
        String dataFormatada = dateFormat.format(datahoje);
        AluguelVeiculos.txtDataAluguel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT, brasil))));
        AluguelVeiculos.txtDataAluguel.setText(dataFormatada);
        AluguelBeans aluguel = new AluguelBeans();
        aluguel.setDataAluguel( datahoje);
        calendar.add(Calendar.MONTH, -1);
        aluguel.setDataEntrega(calendar.getTime());
        
    }

public static void DataFaturamento(){
    
     SimpleDateFormat dateFormat = new SimpleDateFormat("y-MM-dd");
    Calendar calendar = Calendar.getInstance();

    for (int i = 0; i < 10; i++) {
        txtFaturamentoData.addItem(dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH, -1); 
    }
    
         

}
}
