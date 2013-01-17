package pl.itcrowd.tutorials.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;


@Stateless
public class TransactionTester1 {

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void test() {

    }

}
