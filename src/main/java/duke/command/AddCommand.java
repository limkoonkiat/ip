package duke.command;

import duke.*;
import duke.task.Task;

public class AddCommand extends Command {
    private Task task;

    public AddCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.addTask(task);
        ui.printAddTask(task, tasks);
        storage.save(tasks.getTasks());
    }
}
