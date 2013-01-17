package pl.itcrowd.tutorials.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.transaction.TransactionSynchronizationRegistry;
import java.util.logging.Logger;

@Startup
@Singleton
public class MySingleton {

    private static final Logger LOGGER = Logger.getLogger(MySingleton.class.getCanonicalName());

    @EJB
    private TransactionTester1 transactionTester;

    @Resource
    TransactionSynchronizationRegistry txReg;

    @PostConstruct
    public void onCreate() {

        LOGGER.info("%%%%% Transaction status: " + txReg.getTransactionStatus() + " key: " +  txReg.getTransactionKey());
        transactionTester.test();
        LOGGER.info("%%%%% Transaction status: " + txReg.getTransactionStatus() + " key: " +  txReg.getTransactionKey());

    }

}