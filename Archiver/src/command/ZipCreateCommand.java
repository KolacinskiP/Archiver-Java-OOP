package command;

import main.ConsoleHelper;
import main.ZipFileManager;
import exception.PathNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. Prompts the user to enter the full path to the archive file <br>
 * 2. Prompts the user to enter the full name of the file or directory to be archived.
 */
public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Creating an archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the full name of the file or directory to be archived:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.createZip(sourcePath);

            ConsoleHelper.writeMessage("Archive created.");

        } catch (PathNotFoundException e) {
            ConsoleHelper.writeMessage("You didn't correctly enter a file name or directory.");
        }
    }
}