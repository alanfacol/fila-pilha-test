package com.alan.main.aulas.pilha;

public class PilhaVetor {
	
	/* A ideia desta pilha seja que ela adicione e retire items ao final da lista, com base no topo
	 * 
	 * Para esta ideia, uma posição vazia seria 0.
	 */
	
	public static int[] pilha = new int [5];
	public static int topo = 0;
	
	public static void adicionar(int numero) {
		if (!cheia()) {
			pilha[topo] = numero;
			topo++;
		} else {
			System.out.println("Erro ao adicionar o item " + numero + " - Pilha cheia!");
		}
	}
	
	public static void remover() {
		if (!vazia()) {
			pilha[topo - 1] = 0;
			topo--;
		} else {
			System.out.println("Erro ao remover - Pilha vazia!");
		}
	}
	
	public static int topo() {
		if (!vazia()) {
			return pilha[topo -1];
		} else {
			return -1;
		}
	}
	
	public static int tamanho() {
		return topo;
	}
	
	public static void mostrar() {
		for (int i = 0; i < pilha.length; i++) {
			System.out.println("[" + pilha[i] + "]");
		}
	}
	
	private static boolean vazia() {
		if (topo == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean cheia(){
		if (topo >= pilha.length) {
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
		mostrar();
		
	}
}
