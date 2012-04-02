package samples.quickstart.service.pojo;

import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.HashMap;

@WebService
public class StockQuoteServiceImpl {
    private HashMap map = new HashMap();

    public double getPrice(String symbol) {
        Double price = (Double) map.get(symbol);
        if(price != null){
            return price.doubleValue();
        }
        return 42.00;
    }

    public void update(String symbol, double price) {
        map.put(symbol, new Double(price));
    }
}
