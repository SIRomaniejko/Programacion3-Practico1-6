import java.util.Iterator;



public class MyLinkedList implements Iterable<Object>{
	Nodo primerNodo;
	int size;
	public MyLinkedList(){
		primerNodo = null;
		size = 0;
	}
	public Object getNodo(int index){
		Nodo nodoActual = primerNodo;
		for(int x = 0; x < index; x++){
			nodoActual = nodoActual.getNodoSiguiente();
		}
		return nodoActual.getContenido();
	}
	public void print(int index){
		Nodo nodoActual = primerNodo;
		System.out.println(nodoActual.getContenido());
		for(int x = 0; x < index; x++){
			nodoActual = nodoActual.getNodoSiguiente();
			System.out.println(nodoActual.getContenido());
		}
	}
	public void addNodoPrincipio(Object contenido){
		Nodo nNuevo = new Nodo();
		nNuevo.setContenido(contenido);
		nNuevo.setNodoSiguiente(primerNodo);
		primerNodo = nNuevo;
		size++;
	}
	public Object extractFront(){
		Object regreso = primerNodo.getContenido();
		Nodo nodoSegundo = primerNodo.getNodoSiguiente();
		primerNodo = nodoSegundo;
		size--;
		return regreso;
	}
	public boolean isEmpty(){
		return primerNodo == null;
	}
	public int getSize(){
		return size;
	}
	@Override
	public Iterator<Object> iterator() {
		return new NodoIterator(primerNodo);
	}
}
