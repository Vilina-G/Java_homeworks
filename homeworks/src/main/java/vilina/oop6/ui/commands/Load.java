package vilina.oop6.ui.commands;

import vilina.oop6.ui.Console;

public class Load extends Command
{
    public Load(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Загрузить семью. ";
    }

    @Override
    public void execute() 
    {
        getConsole().loadFamily();   
    }
    
}
