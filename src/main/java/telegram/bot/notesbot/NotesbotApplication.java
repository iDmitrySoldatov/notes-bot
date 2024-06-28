package telegram.bot.notesbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * The main entry point of the application.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NotesbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesbotApplication.class, args);
	}

}
