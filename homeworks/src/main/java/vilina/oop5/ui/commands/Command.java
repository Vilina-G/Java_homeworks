package vilina.oop5.ui.commands;

import vilina.oop5.ui.Console;

public abstract class Command implements Option
{
    private Console console;

    public Command(Console console)
    {
        this.console = console;
    }

    public Console getConsole()
    {
        return console;
    }
}