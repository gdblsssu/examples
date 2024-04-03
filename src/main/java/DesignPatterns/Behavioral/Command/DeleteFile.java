package DesignPatterns.Behavioral.Command;

import java.io.File;
import java.io.IOException;

public class DeleteFile implements FileCommand {
    File file;

    public DeleteFile(File file) {
        this.file = file;
    }

    @Override
    public void execute() throws IOException {
        file.delete();
    }
}
