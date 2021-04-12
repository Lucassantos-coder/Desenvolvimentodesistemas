package Exemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		/*ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());*/
		
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i<10) {
				it.remove();
			}
		}
		System.out.println(numbers);*/
		
		MenuItem [] menuItens = new MenuItem[4];
		menuItens[1] = new MenuItem("Menu 1");
		menuItens[2] = new MenuItem("Menu 2");
		menuItens[3] = new MenuItem("Menu 3");
		menuItens[4] = new MenuItem("Menu 4");
		
		Iterator menuIterator = new MenuIterator(menuItens);
		while(menuIterator.hasNext()) {
			MenuItem menuitem = (MenuItem)menuIterator.next();
			System.out.println(menuitem.nome);
		}
	}

}
