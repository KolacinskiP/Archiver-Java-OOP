package command;

import main.ConsoleHelper;
import main.ZipFileManager;
import exception.PathNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. Prompts the user to enter the full path to the archive file <br>
 * 2. Prompts the user to enter the full name of the file to be added to the archive.
 */
public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Adding a new file to an archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the full name of the file to be added:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());

            zipFileManager.addFile(sourcePath);

            ConsoleHelper.writeMessage("File added to archive.");

        } catch (PathNotFoundException e) {
            ConsoleHelper.writeMessage("File not found.");
        }
    }
}