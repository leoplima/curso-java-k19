
public class Pin {
public static void main(String[] args) {
	for(int contador = 1;contador <= 100;contador++){
		int resto = contador % 4;
		if(resto==0){
			System.out.println("PIN");
		}else{
			System.out.println(contador);
		}
	}
}
}
