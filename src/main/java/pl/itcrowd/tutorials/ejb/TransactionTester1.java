package pl.itcrowd.tutorials.ejb;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.transaction.TransactionSynchronizationRegistry;
import java.util.logging.Logger;


@Stateless
public class TransactionTester1 {

    private static final Logger LOGGER = Logger.getLogger(TransactionTester1.class.getCanonicalName());

    @Resource
    private TransactionSynchronizationRegistry txReg;

    @EJB
    private TransactionTester2 transactionTester2;

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void test() {

        LOGGER.info("%%%%%  Transaction status: " + txReg.getTransactionStatus() + " key: " + txReg.getTransactionKey());
        transactionTester2.test();
        LOGGER.info("%%%%%  Transaction status: " + txReg.getTransactionStatus() + " key: " + txReg.getTransactionKey());

    }

}
