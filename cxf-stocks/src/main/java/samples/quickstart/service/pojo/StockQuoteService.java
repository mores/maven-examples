package samples.quickstart.service.pojo;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface StockQuoteService {

    public double getPrice(@WebParam(name="symbol") String symbol);

    public void update(
	@WebParam(name="symbol") String symbol,
	@WebParam(name="price") double price
	);
}
