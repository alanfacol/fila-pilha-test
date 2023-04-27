package com.alan.main.aulas.fila;

public class FilaVetor {
	
	/* A ideia desta fila seja que ela adicione items ao final da lista, com base no topo, e remova do inicio,
	 * reordeando as informações.
	 * 
	 * Para esta ideia, uma posição vazia seria 0.
	 */
	
	public static int[] fila = new int [5];
	public static int fim = 0;
	
	public static void adicionar(int numero) {
		if (!cheia()) {
			fila[fim] = numero;
			fim++;
		} else {
			System.out.println("Erro ao adicionar o item " + numero + " - Fila cheia!");
		}
	}
	
	public static void remover() {
		if (!vazia()) {
			fila[0] = 0;
			for (int i = 0; i < fila.length; i++) {
				if (i <= fila.length - 2) {
					fila[i] = fila[i+1];
				} else {
					fila[i] = 0;
				}
			}
			fim--;
		} else {
			System.out.println("Erro ao remover - Pilha vazia!");
		}
	}
	
	public static int topo() {
		if (!vazia()) {
			return fila[0];
		} else {
			return -1;
		}
	}
	
	public static int tamanho() {
		return fim;
	}
	
	public static void mostrar() {
		for (int i = 0; i < fila.length; i++) {
			System.out.println("[" + fila[i] + "]");
		}
	}
	
	private static boolean vazia() {
		if (fim == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean cheia(){
		if (fim >= fila.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		adicionar(20);
		adicionar(2);
		adicionar(24);
		adicionar(12);
		adicionar(2000);
		adicionar(1); // dara erro porque excedeu a quantidade de elementos
//		mostrar();
		remover(); // remove o primeiro da fila
		remover();
		adicionar(300);
		mostrar();
	}

}
