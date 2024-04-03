package DesignPatterns.Behavioral.Command;

import java.io.File;
import java.io.IOException;

public class CreateFile implements FileCommand {
    File file;

    public CreateFile(File file) {
        this.file = file;
    }

    @Override
    public void execute() throws IOException {
        file.createNewFile();
    }
}
