public class main {
    public static void main(String[] args) {
        persona persona = new persona("Keiver", 18, 'H');
        persona.setPeso(60);
        persona.setAltura(1.74f);
        System.out.println(persona.calcularIMC());
        System.out.println(persona.EsMayorDeEdad());
        System.out.println(persona.comprobarSexo('X'));
        System.out.println(persona.toString());
    }
}
