//Uso en la aplicación (Cliente)
public class PaymentApp {
    public static void main(String[] args) {
        // Crear instancia del servicio de pago existente
        PayPal payPalService = new PayPal();

        // Crear adaptador para PayPal
        PaymentProcessor adapter = new PayPalAdapter(payPalService);

        // Usar la interfaz común para procesar el pago
        adapter.processPayment(100.0);
    }
}
