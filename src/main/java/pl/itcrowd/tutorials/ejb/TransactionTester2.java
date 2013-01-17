package pl.itcrowd.tutorials.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.transaction.TransactionSynchronizationRegistry;
import java.util.logging.Logger;


@Stateless
public class TransactionTester2 {

    private static final Logger LOGGER = Logger.getLogger(TransactionTester2.class.getCanonicalName());

    @Resource
    private TransactionSynchronizationRegistry txReg;

    public void test() {

        LOGGER.info("%%%%%  Transaction status: " + txReg.getTransactionStatus() + " key: " + txReg.getTransactionKey());

    }
}
