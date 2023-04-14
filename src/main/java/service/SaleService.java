package service;

import com.highfive.demo.domain.Sale;
import com.highfive.demo.repository.SaleRepository;

public class SaleService extends CrudService<Sale, Long> {

    public final SaleRepository saleRepository;
    
    public SaleService(SaleRepository saleRepository) {
     super(saleRepository);
     this.saleRepository = saleRepository;
    }
}
