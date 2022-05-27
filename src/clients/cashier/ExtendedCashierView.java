package clients.cashier;

import middle.MiddleFactory;

import javax.swing.*;

public class ExtendedCashierView extends CashierView{

    private static final String REMOVE = "Remove";

    private final JButton     theBtRemove= new JButton( REMOVE );

    /**
     * Construct the view
     *
     * @param rpc Window in which to construct
     * @param mf  Factor to deliver order and stock objects
     * @param x   x-coordinate of position of window on screen
     * @param y   y-coordinate of position of window on screen
     */
    public ExtendedCashierView(RootPaneContainer rpc, MiddleFactory mf, int x, int y) {
        super(rpc, mf, x, y);

        theBtRemove.setBounds( 16, 25+60*2, 80, 40 );   // Clear Button
        theBtRemove.addActionListener(                  // Call back code
                e -> ((ExtendedCashierController)cont).doRemove() );
        cp.add( theBtRemove );
    }
}