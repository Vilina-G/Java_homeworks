package vilina.oop7.ui.commands;

import vilina.oop7.ui.Console;

public class SaveFamily extends Command
{
    public SaveFamily(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Сохранить семью. ";
    }

    @Override
    public void execute() 
    {
        getConsole().saveFamily();      
    }
    
}
