package command;

import main.ConsoleHelper;

/**
 * Closes the programme
 */
public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Bye!");
    }
}