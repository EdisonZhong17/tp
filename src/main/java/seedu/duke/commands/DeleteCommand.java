package seedu.duke.commands;

/**
 * Command that deals with deleting Records to the RecordList.
 * Expected to be extended by DeleteBudget and DeleteExpenditure.
 */
public abstract class DeleteCommand extends Command {
    public static final String COMMAND_WORD = "delete";
}