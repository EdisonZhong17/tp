package seedu.duke.commands;

public class DeleteBudgetCommand extends Command {

    public static final String COMMAND_WORD = "DeleteBudget";
    public final int index;

    public DeleteBudgetCommand(String indexString) {
        this.index = Integer.parseInt(indexString) - 1;
    }

    public void execute() {
    }
}