package clients.cashier;

import catalogue.Basket;
import catalogue.BetterBasket;
import debug.DEBUG;
import middle.MiddleFactory;
import middle.StockException;

public class BetterCashierModel extends CashierModel{
    /**
     * Construct the model of the Cashier
     *
     * @param mf The factory to create the connection objects
     */
    public BetterCashierModel(MiddleFactory mf) {
        super(mf);
    }

    @Override
    public Basket makeBasket(){
        return new BetterBasket();
    }

    public void doRemove(){
        String theAction = "";
        boolean    notExist  = true;                         //  & quantity
        try
        {
            if ( theState != State.checked )          // Not checked
            {                                         //  with customer
                theAction = "Check if OK with customer first";
            } else {
                if (theBasket==null ){
                    theAction = theProduct.getDescription()+" doesn't exist in the basket";
                }else{
                    for (int i = 0; i < theBasket.size(); i++) {
                        if (theBasket.get(i).getProductNum().equals(theProduct.getProductNum())){
                            theBasket.remove(i);
                            theStock.addStock(theProduct.getProductNum(), 1);
                            theAction = "Deleted " +            //    details
                                    theProduct.getDescription();  //
                            notExist = false;
                            break;
                        }
                    }
                }

                if(notExist){
                    theAction = theProduct.getDescription()+" doesn't exist in the basket";
                }
            }
        } catch( StockException e )
        {
            DEBUG.error( "%s\n%s",
                    "CashierModel.doBuy", e.getMessage() );
            theAction = e.getMessage();
        }
        theState = State.process;                   // All Done
        setChanged(); notifyObservers(theAction);
    }
}