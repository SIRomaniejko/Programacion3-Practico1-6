
public class Main {

	public static void main(String[] args) {
		MyLinkedList lista = new MyLinkedList();
		lista.addNodoPrincipio(3);
		lista.addNodoPrincipio(7);
		lista.addNodoPrincipio(2);
		lista.addNodoPrincipio(9);
		lista.addNodoPrincipio(22);
		MyLinkedList diferencia =  new MyLinkedList();
		diferencia.addNodoPrincipio(7);
		diferencia.addNodoPrincipio(3);
		diferencia.addNodoPrincipio(8);
		MyLinkedList resultado = listaDiferencia(lista, diferencia);
		for(Object valor: resultado){
			System.out.println(valor);
		}
	}

	public static MyLinkedList listaDiferencia(MyLinkedList lista, MyLinkedList diferencia){
		MyLinkedList regreso = new MyLinkedList();
		for(Object valor: lista){
			boolean esDistinto = true;
			for(Object valorDistinto: diferencia){
				if(valor == valorDistinto){
					esDistinto = false;
					break;
				}
			}
			if(esDistinto){
				regreso.addNodoPrincipio(valor);
			}
		}
		return regreso;
	}

}
