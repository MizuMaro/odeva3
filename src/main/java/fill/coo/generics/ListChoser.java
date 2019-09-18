package fill.coo.generics;

import java.util.*;

import fill.coo.scanner.*;

public class ListChoser {

	// Definir la methode chose, qui prend en premier parametre
	// un message sous forme de chaene de caracteres et en second une liste.
	// Cette liste est typee mais sans restriction sur les types admis.
	// Cette methode propose de choisir un element de la liste en saisissant
	// sa position dans la liste.
	// L'element choisi est retourne par la methode, null si le choix 0 est
	// fait.
	//
	// ...methode chose... 
	//
        
        
   
       private <T> T  chose(String which, List<T> lT) {
          int index = 0;
          System.out.println("-"+ index + ") Aucun");

           for( T item : lT){
               index++;
               System.out.println("-"+ index + ") "+lT.get(index-1).toString());
           }
           
         int select = ScannerInt.readInt(index+1);
         if(select == 0){
             return null;
         }else{
            return lT.get(select-1);

         }
        } 

	public static void main(String[] args) {
		// JEU DE TEST

		List<Carrot> lCarrots = new ArrayList<Carrot>();
		lCarrots.add(new Carrot(1));
		lCarrots.add(new Carrot(2));
		lCarrots.add(new Carrot(3));

		List<Apple> lApples = new ArrayList<Apple>();
		lApples.add(new Apple(1));
		lApples.add(new Apple(2));
		lApples.add(new Apple(3));

		ListChoser lc = new ListChoser();

		Carrot chosenCarrot = (Carrot) lc.chose("which carrot ? ", lCarrots);
		System.out.println("you have chosen : " + chosenCarrot);

		Apple chosenApple = (Apple) lc.chose("which appel? ", lApples);
		System.out.println("you have chosen : " + chosenApple);
	}

}
