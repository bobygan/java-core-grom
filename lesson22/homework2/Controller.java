package lesson22.homework2;

public class Controller  {

    TransactionDAO transactionDAO=new TransactionDAO();

    public Transaction save(Transaction transaction)throws Exception {

            return transactionDAO.save(transaction);
    }

    public Transaction[] transactionList()  throws Exception {
        return  transactionDAO.transactionList();
    }

    public Transaction[] transactionList(String city) {
        return  transactionDAO.transactionList(city);
    }

    public Transaction[] transactionList(int amount) {
        return  transactionDAO.transactionList(amount);
    }
}
