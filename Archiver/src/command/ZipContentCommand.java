package command;

import main.ConsoleHelper;
import main.FileProperties;
import main.ZipFileManager;

import java.util.List;

/**
 * Prompts the user to enter the full path to the archive file, which content the user wants to be displayed.
 */
public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Viewing contents of the archive.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Archive contents:");

        List<FileProperties> files = zipFileManager.getFileList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Archive contents viewed.");
    }
}