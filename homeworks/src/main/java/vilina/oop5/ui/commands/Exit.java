package vilina.oop5.ui.commands;

import vilina.oop5.ui.Console;

public class Exit extends Command
{
    public Exit(Console console)
    {
        super(console);
    }

    @Override
    public String description()
    {
        return "Выход их программы.";
    }

    @Override
    public void execute()
    {
        getConsole().end();
    }
}