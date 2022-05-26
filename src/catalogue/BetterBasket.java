package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * BetterBasket class is an improved version of basket class
 * that adds products while sorting and also ensures no duplicate
 * product is added to the list instead it increments the quantity of that
 * product
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;

  /**
   * add method overrides the add method of ArrayList class and extends its
   * functionality by checking whether the product exists. If it exists it just
   * increments the quantity of the product. It also adds product in ascending order
   * according to product number.
   *
   * @param pr A product to be added to the basket
   * @return boolean showing whether the addition was successful
   */
  @Override
  public boolean add( Product pr )
  {

    for (Product prod : this){
      if (prod.getProductNum().equals(pr.getProductNum())){
        prod.setQuantity(prod.getQuantity()+pr.getQuantity());
        return true;
      }
    }

    if (this.size()==0){
      return super.add(pr);
    }else {
      for (int i = 0; i < this.size(); i++) {
        if(pr.getProductNum().compareTo(this.get(i).getProductNum()) < 0){
          super.add(i, pr);
          return true;
        }
      }
      super.add( this.size(), pr );
      return true;// Call add in ArrayList
    }
  }
  // You need to add code here
}
