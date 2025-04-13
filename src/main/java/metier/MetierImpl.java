package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//on utulise service pour faire la distinction
@Service("metier")
public class MetierImpl implements IMetier {
// autowirred veut dire inject
    private IDao dao;

// Qualifier fait la presition d'objet a injecter
    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}