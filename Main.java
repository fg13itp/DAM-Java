class Main {
    public static void main(String[] args) {

        Motor miMotor = new Motor();
        Ventana miVentana = new Ventana();
        Puerta miPuerta = new Puerta();

        System.out.println(miPuerta);

        miPuerta.abrir();

        System.out.println(miPuerta);

        miPuerta.getVentana().abrir();

        System.out.println(miPuerta);

        miPuerta.cerrar();

        System.out.println(miPuerta);
        
    }
}