package gerar;

import java.security.SecureRandom;

public class GerarGeral {

	private static SecureRandom random = new SecureRandom();
	private static final String letra = "abcdefghijklmnopqrstuvwxyz";
	private static final String LETRA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String numero = "0123456789";
	private static final String simbolo = "!@#$%^&*_=+-";

	public static String generatorLetraMinuscula(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(letra.length());
            result += letra.charAt(index);
        }
        return result;
    }
	
	public static String generatorLetraMaiuscula(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(LETRA.length());
            result += LETRA.charAt(index);
        }
        return result;
    }
	
	public static String generatorLetraMinusculaMaiuscula(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt((letra+LETRA).length());
            result += (letra+LETRA).charAt(index);
        }
        return result;
    }
	
	public static String generatorLetraMinusculaNumero(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt((letra+numero).length());
            result += (letra+numero).charAt(index);
        }
        return result;
    }
	
	public static String generatorLetraMainusculaNumero(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt((LETRA+numero).length());
            result += (LETRA+numero).charAt(index);
        }
        return result;
    }
	
	public static String generatorNumero(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(numero.length());
            result += numero.charAt(index);
        }
        return result;
    }
	
	public static String generatorNumeroSimbolo(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt((numero+simbolo).length());
            result += (numero+simbolo).charAt(index);
        }
        return result;
    }
	
	public static String generatorSimbolo(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(simbolo.length());
            result += simbolo.charAt(index);
        }
        return result;
    }
	
	public static String generatorMinusculaNumeroSimbolo(int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt((letra+numero+simbolo).length());
            result += (letra+numero+simbolo).charAt(index);
        }
        return result;
    }

	public static String generatorMinusculaMainusculaNumeroSimbolo(int len) {
		String result = "";
		for (int i = 0; i < len; i++) {
			int index = random.nextInt((letra+LETRA+numero+simbolo).length());
			result += (letra+LETRA+numero+simbolo).charAt(index);
		}
		return result;
	}
}
