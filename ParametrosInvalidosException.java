public class ParametrosInvalidosException extends Exception {
    public void mensagem() {
        String alerta = "O segundo parâmetro deve ser maior que o primeiro";
        System.out.println(alerta);
    }
}
