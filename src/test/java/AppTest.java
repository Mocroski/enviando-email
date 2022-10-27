import java.util.Properties;

public class AppTest {

    @org.junit.Test
    public void testeEmail(){

        /*configuraçoes smtp do seu email */

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");/*autorizacao */
        properties.put("mail.smtp.starttls", "true");/*autenticacao*/
        properties.put("mail.smtp.host", "smtp.gmail.com");/*servidor do gmail google*/
        properties.put("mail.smtp.port", "465");/*porta do servdos*/
        properties.put("mail.smtp.socketFactor.port", "465");/*especifica a porta a ser conectada pelo socket*/
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" ); /*classe socket de conexao ao smtp*/
    }
}
