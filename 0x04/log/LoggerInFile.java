package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");

        try {
            FileHandler fileHandler = new FileHandler("logs.txt", true); // 'true' para append
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);


            logger.info("teste de Log");
            logger.info("Olá, eu sou o teste da classe principal");

        } catch (IOException e) {
            System.err.println("Erro ao criar o FileHandler: " + e.getMessage());
        }
		
    }
}
