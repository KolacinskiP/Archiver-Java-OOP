package command;

import main.ConsoleHelper;
import main.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. Prompts the user to enter the full path to the archive file <br>
 * 2. Prompts the user to enter the full path to the file in the archive to be removed.
 */
public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Removing a file from an archive.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Enter the full path to the file in the archive:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);
        //ConsoleHelper.readInt();

        ConsoleHelper.writeMessage("File removed from archive.");
    }
}