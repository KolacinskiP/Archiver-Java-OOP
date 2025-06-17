package command;

import main.ConsoleHelper;
import main.ZipFileManager;
import exception.PathNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. Prompts the user to enter the full path to the archive file to be unpacked <br>
 * 2. Prompts the user to enter the path where the archive will be unpacked.
 */
public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Unpacking archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the path where the archive will be unpacked:");
            Path destinationPath = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(destinationPath);

            ConsoleHelper.writeMessage("Archive unpacked.");

        } catch (PathNotFoundException e) {
            ConsoleHelper.writeMessage("Invalid path for unpacking.");
        }
    }
}