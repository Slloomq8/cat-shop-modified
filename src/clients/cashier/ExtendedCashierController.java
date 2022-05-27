package clients.cashier;

public class ExtendedCashierController extends CashierController{
    /**
     * Constructor
     *
     * @param model The model
     * @param view  The view from which the interaction came
     */
    public ExtendedCashierController(CashierModel model, CashierView view) {
        super(model, view);
    }

    /**
     * Delete interaction from view
     */
    public void doRemove()
    {
        ((BetterCashierModel) model).doRemove();
    }
}