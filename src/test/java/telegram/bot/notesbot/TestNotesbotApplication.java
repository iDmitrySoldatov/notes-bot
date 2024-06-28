package telegram.bot.notesbot;

import org.springframework.boot.SpringApplication;

public class TestNotesbotApplication {

	public static void main(String[] args) {
		SpringApplication.from(NotesbotApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
