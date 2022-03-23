package useswitch;

public class UsoSwicth {
	public static void main(String[] args) {
		System.out.println("Escribe que quieres cocinar y obten la receta: " + "\n" + "queque" + "\n" + "pan" + "\n" + "pizza" + "\n" + "torta" + "\n" + "panqueque" + "\n");
		
		String comida = args[0];
		
		switch (comida) {
		case "queque":
			System.out.println("Receta para hacer queque: " + "\n" + "-Harina" + "\n" + "-Azúcar" + "-Mantequilla" + "\n" + "-Polvo para hornear" + "\n" + "-Escencia de vainilla" + "\n" + "-Huevos" + "\n" + "-Leche");
			break;
		case "pan":
			System.out.println("Receta para hacer pan: " + "\n" + "-Harina" + "\n" + "-Sal" + "\n" + "-Manteca" + "\n" + "-Levadura" + "\n" + "-Agua" + "\n" + "-Leche");
			break;
		case "pizza":
			System.out.println("Receta para hacer pizza: " + "\n" + "-Harina" + "\n" + "-Sal" + "\n" + "-Levadura" + "\n" + "-Queso" + "\n" + "-Aceite" + "\n" + "-Salsa de tomate" + "\n" + "-Aceituna" + "\n" + "-Jamon");
			break;
		case "torta":
			System.out.println("Receta para hacer torta: " + "\n" + "-Harina" + "\n" + "-Azucar" + "\n" + "-Crema" + "\n" + "-Manjar" + "\n" + "-Nuez" + "\n" + "-Chocolate" + "\n" + "-Mermelada" + "\n" + "-Crema pastelera");
			break;
		case "panqueque":
			System.out.println("Receta para hacer panqueque: " + "\n" + "-Harina" + "\n" + "-Sal" + "\n" + "-Polvo de hornear" + "\n" + "-Huevos" + "\n" + "-Aceite" + "\n" + "-Leche" + "\n" + "-Manajar" + "\n" + "-Mermelada");
			break;
		default:
			System.out.println("¡¡Debes seleccionar una de las tres comidas en la lista, por favor :| !!");
			break;
		}
	}
}
