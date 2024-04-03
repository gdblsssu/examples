package DesignPatterns.Behavioral.Command;

import java.io.IOException;

public class FileManager {
    public void executeCommand(FileCommand command) throws IOException {
        command.execute();
    }
}
